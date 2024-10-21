import java.util.*;

public class HW2_4_1111759 {

	public static void main(String[] args) {
		
		System.out.println("請輸入盤子的數量 n 和 一次可以搬動的最大盤子數量 m：");
		Scanner sc = new Scanner(System.in);
		hanoi HN = new hanoi();
		
		int n = sc.nextInt();    //盤子的數量n
		HN.m = sc.nextInt();     //一次可以搬動的最大盤子數量m
		
		HN.f(n, 1, 2, 3);
		System.out.println("最小搬動次數："+HN.re()+"次。");  //輸出總移動次數

	}

}

class hanoi {
	int m,count=0;

	 void f(int n, int one,int two, int three) {
		if (n <= m) {
			//System.out.println("盤子從" + one + "移到" + three);
			count ++;
		}
		else {
		f(n - m, one, three, two);  // Step1. 最上面 n-m 個盤子從 木椿 1 -> 木椿2
		f(m, one, two, three);      // Step2. 木椿 1 最下面 m 個盤子移動到木椿 3
		f(n - m, two, one, three);  // Step3. 將木椿 2 中 n-m 個盤子移動到木椿 1
		}
	}
	 int re(){
		 return count;              //傳送紀錄的移動次數
	 }

}