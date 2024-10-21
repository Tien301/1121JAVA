import java.util.*;

public class HW3_3_1111759 {
	/*
	 * 輸入以空白相隔的三個字串 str1 與 str2 與 str3，
	 * 然後印出 str2 與 str3 在 str1 中出現的索引位置之總和。
	 * 例如，輸入AABBBCDEAABBCCCDEFABC DE AA
	 * 會輸出29
	 * 因為 DE 出現在索引位置 6 與 15，AA 出現在索引位置 0 與 8，
	 * 6+15+0+8=29。*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 標準起手
        System.out.println("輸入以空白相隔的三個字串：");
        String input = sc.nextLine(); // 用 input 來存讀到的字串

        String[] spst = input.split(" ");
        String str1 = spst[0].trim();
        String str2 = spst[1].trim();
        String str3 = spst[2].trim();
        count C = new count();

        // 呼叫函式計算索引位置之總和並印出結果
        int result = C.IndexSum(str1, str2, str3);
        System.out.println("索引位置之總和：" + result);
	}
}

class count{
	
	int IndexSum(String str1, String str2, String str3) {
        int indexSum = 0;
        
        int index = -1;
        // 在 str1 中尋找 str2 的索引位置並加總
        while ((index = str1.indexOf(str2/*要找的字串*/ , index + 1 /*開始找的位置*/)) != -1) {
            indexSum += index;
        }  
        
        
        index = -1;  //調回-1
        // 在 str1 中尋找 str3 的索引位置並加總
        while ((index = str1.indexOf(str3, index + 1)) != -1) {
            indexSum += index;
        }
        return indexSum;
    }
}

