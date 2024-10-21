import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class HW5_5_1111759 {

	public static void main(String[] args)  {    /*----我是main----*/
		System.out.print("請輸入一個不含空白、換行、或tab的字串: ");
		String st="";
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			 st = reader.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}


		// ******去除重複字元****** 精華中的精華!!!!
		String unique_c = removeDuplicateChars(st);

		// 讀取"a1.txt"，丟進countCharacters並計算字元出現次數的總和
		int totalCount = countCharacters(unique_c,"a1.txt");
		
		System.out.println("字元出現次數的總和: " + totalCount);
		
	}/*----main end----*/
	// 去除重複字元 --HashSet我的神qqq--
	private static String removeDuplicateChars(String input) {
		
		Set<Character> charSet = new HashSet<>();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (charSet.add(currentChar)) {
				result.append(currentChar);
			}
		}
		return result.toString();
	}
	
	// 計算字元在檔案中的出現次數總和
	private static int countCharacters(String inputString, String fileName) {
		int totalCount = 0;
		try (BufferedReader fr = new BufferedReader(new FileReader(fileName))) {  //放在try裡面可在try區塊結束時，自動關閉檔案。
	
			String line;
			
			while ((line = fr.readLine()) != null) {            // 走訪檔案的每一行
				
				for (int i = 0; i < inputString.length(); i++) {        // 走訪字串的每一個字元
					char currentChar = inputString.charAt(i);
					
					totalCount += countOccurrences(line, currentChar);  // 計算字元在每一行中的出現次數，加總
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return totalCount;
	}
	
	// 計算字元在字串中的出現次數
	private static int countOccurrences(String input, char target) {    //currentCharr丟出被target接到
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == target) {       // 如果字串中的某個字元等於目標字元，就++
				count++;
			}
		}
		return count;
	}
}
