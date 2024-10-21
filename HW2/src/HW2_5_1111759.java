import java.util.*;

public class HW2_5_1111759 {

	public static void main(String[] args) {
		System.out.println("請輸入m個亂數和想知道的排名n：");

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // 產生m個亂數
		int n = sc.nextInt(); // 印出排名第n的亂數值是多少
		// 最大值排名第1，最小值排名第m
		Random rand = new Random();
		rand.setSeed(5);      // 固定產生的亂數用
//---------------------------我是分隔--------------------------		

		int[] num = new int[m];
		int temp;

		for (int i = 0; i < m; i++) {
			int x = rand.nextInt(10000); // 把生成的亂數都丟到num陣列存好
			num[i] = x;
		}
		/*for (int k : num) {            //檢查初始亂數用
			System.out.print(k + " ");
		}
		System.out.println();*/

		for (int i = 0; i < num.length - 1; i++) { // 再用氣泡排序排好
			for (int j = 0; j < num.length - 1 - i; j++) {

				if (num[j] < num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		for (int k : num) {
			System.out.print(k + " ");    //排完的陣列印出
		}System.out.println();

		System.out.println("排第" + n + "的數字為：" + num[n - 1] +"。"); //輸出n

	}

}