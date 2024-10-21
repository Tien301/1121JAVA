import java.util.*;

public class HW2_1_1111759 {

	public static String generatingRandomString(int targetStringLength) {

		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		Random random = new Random();
		random.setSeed(5);

		String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		return generatedString;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = generatingRandomString(n);
		System.out.println(str);
		/*
		 * 請輸入一個正整數n，下面程式片段會產生一個由小寫英文字母組成的String
		 * str，請在指定的(灰色)區域內寫程式，印出str中"最常出現"的英文字母的出現次數。 Class名稱可以改。
		 * 例如，輸入100，會輸出8。輸入1000，會輸出48。
		 */

		// ------------ write your code below ------------

		// 創建一個陣列來計算每個字母的出現次數
		int[] letterCount = new int[26];

		// 將字串轉換為小寫，並遍歷每個字元
		for (char c : str.toLowerCase().toCharArray()) {
			// 檢查字元是否為英文字母
			if (Character.isLetter(c)) {
				// 將字元轉換為相對應的索引，並增加計數
				letterCount[c - 'a']++;
			}
		}

		// 找出最多的出現次數
		int maxCount = 0;
		for(int i=0;i<26;i++) {
			if (letterCount[i] > letterCount[maxCount]) {
				maxCount = i;
			}
		}
		char C = (char) (maxCount+'a');
		System.out.println("出現最多次的字母："+C+" \n一共出現"+letterCount[maxCount]+"次");

		// ------------ write your code above ------------
	}
}
