import java.io.*;
import java.util.*;

public class HW5_4_1111759 {
	public static String[] getStrArray(int n) {
		Random generator = new Random(n);
		String[] strArr = new String[n];
		StringBuffer bf = new StringBuffer();
		char tmp;

		for (int i = 0; i < n; i++) {
			bf.delete(0, bf.length());
			for (int j = 0; j <= 7; j++) {
				tmp = (char) ('a' + (int) Math.abs(generator.nextInt()) % 26);
				bf.append(tmp);
			}
			strArr[i] = new String(bf);
			if (i % 7 == 1) {
				i++;
				strArr[i] = new String(bf);
			}
		}
		return strArr;
	}

	public static void main(String[] args) {
		int n;
		String[] strArr;
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入n的值：");
		n = sc.nextInt();
		strArr = getStrArray(n);
		/*---------------------------------------------------------------*/
		/*System.out.println("排序前的陣列：");
		for (String str : strArr) {
			System.out.println(str);
		}System.out.println();*/

		// 由小到大排序
		Arrays.sort(strArr);

		// hash去除重複
		Set<String> uniqueSet = new LinkedHashSet<>(Arrays.asList(strArr));
		// 轉成字串
		String[] finalArr = uniqueSet.toArray(new String[0]);

		System.out.println("排序後的結果：");
		for (String st : finalArr) {
			System.out.println(st);
		}
	}
}
