import java.util.Scanner;

public class hw1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 輸入一個大於100的正整數n，輸出小魚貨等於n的最大Armstrong number

		Scanner sc = new Scanner(System.in); // 讀取輸入的東西
		int n = sc.nextInt();
		// int n1=n%10, n2=n/10%10, n3=n/100%10, n4=n/1000%10,n5=n/10000%10;
		/*
		 * System.out.println("n1=個位數"+n1); System.out.println("n2=十位數"+n2);
		 * System.out.println("n3=百位數"+n3); System.out.println("n4=千位數"+n4);
		 * System.out.println("n5=萬位數"+n5);
		 */
	
		int tem1 = 0, digit = 1, sum = 0, tem2 = 0, check = 0;

		for (int I = n; I > 100; I--) {
			tem1 = I;
			sum = 0;
			digit=1;

			while (tem1 > 9) { // 先找有幾位數digit存位數
				tem1 = tem1 / 10;
				digit++;
			}
			tem1 = I;// 再利用一次tem1 讓I不被動到

			for (int j = 1; j <= digit; j++) {
				tem2 = tem1 % 10;
				sum = sum + (int) Math.pow(tem2, digit); // tem2的digit次方
				tem1 /= 10;
			}

			if (sum == I) {
				check=I;
				break;  //找到最接近n但比較小的Armstrong數就跑
			}
		}
		System.out.println(check);

	}
}



/*
//確認輸入的n484Armstrong number;

		Scanner sc = new Scanner(System.in); // 讀取輸入的東西
		int n = sc.nextInt();
		// int n1=n%10, n2=n/10%10, n3=n/100%10, n4=n/1000%10,n5=n/10000%10;

		int tem1 = n, digit = 1, sum = 0, tem2 = 0;

		while (tem1 > 9) { // 先找有幾位數digit存位數
			tem1 = tem1 / 10;
			digit++;
		}
		tem1 = n;// 再利用一次tem1 讓n不被動到

		for (int j = 1; j <= digit; j++) {
			tem2 = tem1 % 10;
			sum = sum + (int) Math.pow(tem2, digit); // tem2的digit次方
			tem1 /= 10;
		}
		if (sum == n) {
			System.out.println(n + "是Armstrong數");
		} else
			System.out.println(n + "非Armstrong數");
*/