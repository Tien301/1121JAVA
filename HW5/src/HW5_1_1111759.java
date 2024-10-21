import java.io.*;
import java.util.*;

public class HW5_1_1111759 {
	public static int[] getIntArry(int n) {
		Random generator = new Random(n);
		int[] intArr = new int[n];
		for (int i = 0; i < n; i++) {
			int tmp = Math.abs(generator.nextInt()) % n;
			intArr[i] = tmp;
		}
		return intArr;
	}

	public static void main(String[] args) {
		int n;
		int[] intArr;
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入要存入陣列的元素數量：");
		n = sc.nextInt();
		intArr = getIntArry(n);
		// ----------------------------------------------//
		/* 列印陣列intArr內出現過的整數的總和。
		 * 注意：重複出現的整數只能在計算總合時算一次
		 *例如，如果輸入5，陣列intArr內的數字會是1 4 3 3 3，
		 * 有出現的數字是1 3 4，所以會印出8，因為1+3+4=8。
		 * 如果輸入10，會印出30。如果輸入100，會印出3201。*/
		
		System.out.println("陣列元素：");
		for (int num : intArr) {
			System.out.print(num + " ");
		}
		System.out.println();

		// 將陣列排序
		Arrays.sort(intArr);

		/*
		System.out.println("排序後陣列元素："); // 檢查有沒有排好
		for (int num : intArr) {
			System.out.print(num + " ");
		}
		System.out.println();*/

		// 計算出現過的整數總和
		int sum = intArr[0];
		for (int i = 1; i < n; i++) {
			if (intArr[i] != intArr[i - 1]) { // 沒重複才加
				sum += intArr[i];
			}
		}

		System.out.println("出現過的整數總和：" + sum);

	}

}
