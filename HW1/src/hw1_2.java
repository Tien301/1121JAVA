import java.util.Scanner;

public class hw1_2 {

	public static void main(String[] args) {

		int i = 0, j = 0, k = 0, m = 0;

		Scanner sc = new Scanner(System.in); // 讀取輸入的東西
		int Cou = sc.nextInt(); // 金字塔個數
		int num = sc.nextInt(); // 層數

		for (i = 1; i <= num; i++) {

			while (m < Cou) {
				for (j = 0; j < i; j++) {
					System.out.print("*");
				}
				for (k = 0; k < (num - j); k++) {
					System.out.print(" ");
				}
				m++;
			}
			System.out.println();
			m = 0;
		}

	}

}
