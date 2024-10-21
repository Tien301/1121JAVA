import java.util.*;

public class HW2_3_1111759 {

	public static void main(String[] args) {
//		n代表接下來有n組測試資料，每一組測試資料有兩行，各有m個數字，EX：
//		2 6
//		1 5 6 8 9 13  第一組
//		3 4 5 7 8 11

//		4 6 7 14 16 23   第二組
//		6 9 12 13 16 23
		System.out.println("輸入要測試的n組資料，以及各有m個數字(請一次全部輸入)：");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] count = new int[n];
		int M = sc.nextInt();

		for (int I = 0; I < n; I++) {             //看有幾組就重複幾次

			grouptest GT = new grouptest();

			GT.m = M; 
			GT.text1 = new int[GT.m];             //reset text1[m]
			GT.text2 = new int[GT.m];

			for (int i = 0; i < GT.m; i++) {
				GT.text1[i] = sc.nextInt();
			}
			for (int i = 0; i < GT.m; i++) {
				GT.text2[i] = sc.nextInt();
			}
			count[I] = GT.compare();
			// GT.show();
		}

		// GT.show(); //印出輸入進去的數組

		for (int k : count) {
			System.out.println(k); // 排完的陣列印出
		}
		System.out.println();
	}
}

class grouptest {
	int m, count;
	int[] text1;
	int[] text2;

	void show() {
		for (int k : text1) {
			System.out.print(k + " "); // 排完的陣列印出
		}
		System.out.println();
		for (int k : text2) {
			System.out.print(k + " "); // 排完的陣列印出
		}
		System.out.println();
	}

	int compare() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (text1[i] == text2[j])
					count++;
			}
		}
		return count;
	}
}