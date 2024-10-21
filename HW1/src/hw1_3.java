import java.util.Scanner;

public class hw1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//輸入n，找出 c*c+4*a*a*b*b=n 的(a,b,c)有多少組解
		
		Scanner sc = new Scanner(System.in); // 讀取輸入的東西
		int n = sc.nextInt();                // 正整數
		int a=0,b=0,c=0,cou=0;
		
		for(a=1;a<n;a++) {
			
			for(b=1;b<n;b++) {
				
				for(c=1;c<n;c++) {
					if(c*c+4*a*a*b*b==n) {
						System.out.println("{"+a+","+b+","+c+")");
						cou++;
					}
				}
			}
		}
		System.out.println(cou);
		

	}

}
