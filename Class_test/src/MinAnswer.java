import java.util.*;

public class MinAnswer {

	public static void prob01() {   // simple loop
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int small = (m > n) ? n: m;
		int large = (m <= n) ? n: m;
		int sum = 0;
		if ((small%2 == 0 && large %2 == 0) || (small%2 != 0 && large %2 != 0)) {			
			for (int i = small; i <= large; i+=2) {
				System.out.print(i);
				if (i<large) {
					System.out.print("+");
				} else {
					System.out.print("=");
				}
				sum += i;
			}
			System.out.print(sum);
		} else {
			for (int i = small; i <= large; i++) {
				System.out.print(i);
				if (i<large) {
					System.out.print("+");
				} else {
					System.out.print("=");
				}
				sum += i;
			}
			System.out.print(sum);
		}
		
	}
/*--------------------------------------------------------------------------*/
	public static boolean isPrime(int n) {		
		for (int i = 2; i < n/2; i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPower(int n) {
		int pow = 1;
		for (int i=1; true;i++) {
			pow = pow * 2;   // pow = 2^ i
			if (pow -1 == n) {
				return true;
			} else if (pow - 1 > n) {
				return false;
			}
		}
	}
	
	public static void prob02() {   // simple nested loop
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int small = (m > n) ? n: m;
		int large = (m <= n) ? n: m;
		int sum = 0;
		for (int i= small; i<= large; i++) {
			if (isPrime(i) && isPower(i)) {
				// System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
	}
/*--------------------------------------------------------------------------*/
	public static void prob03() {   // simple nested loop
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			for (int j =1; j<=m; j++) {
				for (int k=1; k<=n; k++) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}		
	}
/*--------------------------------------------------------------------------*/	
	public static int towerCount(int n, int m, char source, char target, char tmp) {   // tower
		if (n <=m) {
			// System.out.println("Move " + n + " disks from " + source + " to " + target);
			return 1;
		} else {
			return 2 * towerCount(n-m,m, source, tmp, target) + 1;
			// System.out.println("Move " + m + " disks from " + source + " to " + target);
			// tower(n-m,m, tmp, target, source);				
		}
	}

	public static void prob04() {  
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(towerCount(n,m, 'A','C','B'));		
	}
/*--------------------------------------------------------------------------*/	
	public static void tower(int n, int m, char source, char target, char tmp) {   // tower
		if (n <=m) {
			System.out.println("Move " + n + " disks from " + source + " to " + target);
		} else {
			tower(n-m,m, source, tmp, target);
			System.out.println("Move " + m + " disks from " + source + " to " + target);
			tower(n-m,m, tmp, target, source);				
		}
	}

	public static void prob05() {  
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		tower(n,m, 'A','C','B');		
	}
	
	public static void main(String[] args) {
		//prob01();
		prob02();
		//prob03();
		//prob04();
		//prob05();
		
	}

}
