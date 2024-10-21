import java.io.*;
import java.util.*;

public class HW5_3_1111759 {
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
		System.out.println("輸入要存入的數量：");
		n = sc.nextInt();
		intArr = getIntArry(n);
		// ----------------------------------------------//
		/*
		 * 請用陣列intArr內出現過的整數做key，個別整數的出現次數做value，存入HashMap nums內。
		 * 最後執行System.out.print(nums);。
		 * 輸入5，會輸出{1=1, 3=3, 4=1}，因為1,3,4的出現次數分別為1,3,1。
		 * 輸入10，會輸出{0=3, 2=1, 3=1, 4=2, 6=1, 7=1, 8=1}
		 */

		// 建立HashMap
		HashMap<Integer, Integer> nums = new HashMap<>();

		// 計算整數出現次數並存入HashMap
		for (int i = 0; i < n; i++) {
			try {
				int val = nums.get(intArr[i]);
				nums.put(intArr[i], val + 1);
			} catch (Exception e) {
				nums.put(intArr[i], 1);
			}
		}

		System.out.println(nums);
	}
}
