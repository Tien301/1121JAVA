import java.util.Scanner;

public class hw1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0, k = 0, x = 1, h = 0, m = 0;
		Scanner sc = new Scanner(System.in); // 讀取輸入的東西
		int num = sc.nextInt();
		
		
		h = num / 2 + 1;                          // ex: (5/2)+1=3

		for (i = 0; i < h; i++) {                 // 菱形上半部
			for (j = h - 1; j > i; j--) {         // **+**
				System.out.print("*");            // *+++*
			}                                     // +++++
			for (k = 0; k < x; k++) {
				System.out.print("+");
			}
			for (j = h - 1; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
			x += 2;

		}
		x -= 4;
		m = num - h;                              // 菱形下半部
		for (i = 0; i < m; i++) {                 // *+++*
			for (j = 0; j <= i; j++) {            // **+**
				System.out.print("*");
			}
			for (k = 0; k < x; k++) {
				System.out.print("+");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			x -= 2;
		}

	}

}
