import java.util.*;
import java.io.*;

public class prob03 {
//3.	輸入一個由大小寫英文字母組成的字串，然後印出字串中出現過的字母以及其出現次數

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		//Set<Character> count= new HashSet<>();
		String str2 ;
		char[] c = new char[100];
		int[] count = new int[26];

		
	
		for (int i = 0; i < str1.length(); i++) {
			c[i] = str1.charAt(i);
			
			if (c[i] <= 'z' && c[i] >= 'a') {
				 count[i - 'a']++;
				 
			}}

			

		char en = 'a';

		for (int i = 0; i < 26; i++) {

			en = (char) (i + 'a');
			if (count[i] != 0)

				System.out.println(en + ":" + count[i]);
		}

	}
	}

