import java.util.Scanner;

public class hw1_4 {

	public static void main(String[] args) {
		// 輸入大於1的正整數n，輸出小於或等於n的最大質數
		
		Scanner sc = new Scanner(System.in); // 讀取輸入的東西
		int n = sc.nextInt(),ans=0;
		
		
		for(int i=2;i<=n;i++) {      //質數表示只能跟1或自己整除，所以從2開始
			boolean K=true;
			
			for(int j=2;j<i;j++) {   //一旦找到有人能跟i整除，表示i不是質數，直接break出找下一個i
				
				if(i%j==0) {
					K=false;
					break;        
				}
			}
			if(K) {
				ans=i;           //只記錄找到的最大質數
			}
		}
		System.out.print(ans/*+ "是質數"*/);

	}

}
