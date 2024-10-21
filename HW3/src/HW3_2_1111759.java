import java.util.*;

public class HW3_2_1111759 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //標準起手
		String input = sc.nextLine();   //用input來存讀到的字串

        //ex輸入 AABBBCDEAABBCCCDEFABC DE XYZ
        String[] spst = input.split(" ");  
        String str1 = spst[0].trim();  //spst[0]=AABBBCDEAABBCCCDEFABC
        String str2 = spst[1].trim();  //spst[1]=DE  
        String str3 = spst[2].trim();  //spst[2]=XYZ  trim刪掉空白符號
      
        System.out.println("把"+str2+"替換成"+str3+"：");
        System.out.println(str1.replace(str2, str3));
        //AABBBCXYZAABBCCCXYZFABC
        
	}

}
/*
 * 輸入以"空白相隔"的三個字串 str1 與 str2 與 str3，
 * 然後印出將 str1 裡面所有出現 str2的地方，替換成 str3 的結果。
 * 例如，輸入AABBBCDEAABBCCCDEFABC DE XYZ
 * 會輸出
 * AABBBCXYZAABBCCCXYZFABC
 */
