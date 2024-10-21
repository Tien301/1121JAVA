import java.util.*;

public class HW2_2_1111759 {

	public static String generatingRandomString(int targetStringLength) {
		int leftLimit = 48; // letter '0'
		int rightLimit = 122; // letter 'z'
		Random random = new Random();
		random.setSeed(100);

		String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		return generatedString;
	}

	// 印出將str中每一個出現英文字母或數字的地方換成一個*的結果
	// 如果str= “XIao@r;Vy=FAh7K953G\” 會印出 “****@*;**=*********\”。

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("請輸入字串：");    //輸入的是str字串
        String str = sc.nextLine();
             //StringBuilder 的特色：允許在現有的物件上直接修改內容，不需要產生一個新的字串物件
        StringBuffer result = new StringBuffer();

        for (char c : str.toCharArray()) {   //StringBuilder做一個result字串輸出(一開始是空字串)
        	
            if (Character.isLetterOrDigit(c)) {//如果char c是字母（包括大寫和小寫字母）或數字：
                result.append('*');    // 把 * 附加（追加）到 result 字串的末尾。
            } else {
                result.append(c);      
            }
        }
        System.out.println("修改後字串: " + result);
   
	}
}
