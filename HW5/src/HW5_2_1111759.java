import java.io.*;
import java.util.*;

public class HW5_2_1111759 {
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
		/* 請列印陣列intArr內有重複出現過的整數的總和。 
		 * 注意：重複出現的整數只能在計算總合時算一次。
		 * 例如，如果輸入15，陣列intArr內的數字會是4,12,11,9,10,10,14,6,2,5,2,14,5,8,7，
		 * 有重複出現過的數字是2,5,10,14，所以會印出31，因為2+5+10+14=31。
		 */

		System.out.println("陣列元素：");
		for (int num : intArr) {
			System.out.print(num + " ");
		}
		System.out.println();

		// 將陣列排序
		Arrays.sort(intArr);
		
		/* System.out.println("排序後陣列元素："); // 檢查有沒有排好 for (int num : intArr) {
		 * System.out.print(num + " "); } System.out.println();
		 */

		int sum = 0;
		for (int i = 0; i < intArr.length-1; i++) {
			// 如果跟後面一位元素相同&&(是第一個數字||不是第二次出現的數字)，加入總和
			if (intArr[i] == intArr[i + 1] && (i == 0 || intArr[i] != intArr[i - 1])) {
				sum += intArr[i];
			}
		}
		System.out.println("重複出現過的整數總和：" + sum);

	}

}
