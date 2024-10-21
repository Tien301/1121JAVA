
import java.util.*;

public class prob02 {
//2.	輸入一個由小寫英文字母組成的字串，然後印出字串中出現過的字母以及其出現次數。

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int[] count = new int[26];

		for (char c : str1.toLowerCase().toCharArray()) {
			if (Character.isLetter(c)) {
				count[c - 'a']++;
			}
		}
		char en = 'a';

		for (int i = 0; i < 26; i++) {

			en = (char) (i+'a');
			if (count[i] != 0)
				
				System.out.println(en + ":" + count[i]);
		}

	}

}
