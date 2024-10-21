
import java.util.Scanner;

public class prob04 {
	/*
	 * 4.請輸入一個字串， 然後將該字串裡面每一個小寫英文字母都替換成該字母之後的一個字母(也就是說，a變b，x變y，…，但是z變a)，
	 * 其他字元不變。請印出轉換後的字串。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		char[] c = new char[100];

		for (int i = 0; i < str1.length(); i++) {
			c[i] = str1.charAt(i);
			if (c[i] < 'z' && c[i] >= 'a') {
				
				switch(c[i]) {
				
				case'a':c[i] ='b'; break;
				case'b':c[i] ='c'; break;
				case'c':c[i] ='d'; break;
				case'd':c[i] ='e'; break;
				case'e':c[i] ='f'; break;
				case'f':c[i] ='g'; break;
				case'g':c[i] ='h'; break;
				case'h':c[i] ='i'; break;
				case'i':c[i] ='j'; break;
				case'j':c[i] ='k'; break;
				case'k':c[i] ='l'; break;
				case'l':c[i] ='m'; break;
				case'm':c[i] ='n'; break;
				case'n':c[i] ='o'; break;
				case'o':c[i] ='p'; break;
				case'p':c[i] ='q'; break;
				case'q':c[i] ='r'; break;
				case'r':c[i] ='s'; break;
				case's':c[i] ='t'; break;
				case't':c[i] ='u'; break;
				case'u':c[i] ='v'; break;
				case'v':c[i] ='w'; break;
				case'w':c[i] ='x'; break;
				case'x':c[i] ='y'; break;
				case'y':c[i] ='z'; break;
				case'z':c[i] ='a'; break;
				}
			}}
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(c[i]);
		}
	}
}
