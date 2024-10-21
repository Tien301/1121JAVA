import java.util.*;

public class HW3_6_1111759 {

	static Map <Character, Character> mp = new HashMap<>();
	static {
		 	//鏡像字符映射表，預先用static放在main外面
		    //mp.put('E', '3'); -> key=E ,值=3
			mp.put('A', 'A');   mp.put('E', '3');   mp.put('H', 'H');
			mp.put('I', 'I');   mp.put('J', 'L');   mp.put('L', 'J');
			mp.put('M', 'M');   mp.put('O', 'O');   mp.put('S', '2');
			mp.put('T', 'T');   mp.put('U', 'U');   mp.put('V', 'V');
			mp.put('W', 'W');   mp.put('X', 'X');   mp.put('Y', 'Y');
			mp.put('Z', '5');   mp.put('1', '1');   mp.put('2', 'S');
			mp.put('3', 'E');   mp.put('5', 'Z');   mp.put('8', '8');
			/* Note that ‘0’ (zero) and ‘O’ (the letter) are considered the same character 
			 * 注意‘0’（零）和‘O’（字母O）被視為相同字符，
			 * and therefore ONLY the letter ‘O’ is a valid character.
			 * 因此只有字母‘O’是有效字符。*/
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {  //一直讀取直到沒有下一行，可以一次輸入多筆字串
			String sc = scanner.nextLine();
			int pa = 1, mi = 1, len = sc.length();  //pa指回文，mi指鏡像，預設字串屬於鏡像迴文

			for (int i = 0; i < (len + 1) / 2; i++) {  //只要比較整個字串前半段，ex:14個字元，比較前(14+1)/2=7
				
				
				if (sc.charAt(i) == sc.charAt(len - 1 - i)
						|| (mp.containsKey(sc.charAt(i)) && sc.charAt(len - 1 - i) == mp.get(sc.charAt(i)))) {
					
					if (!(mp.containsKey(sc.charAt(i)) && sc.charAt(len - 1 - i) == mp.get(sc.charAt(i)))) {
						mi = 0;  //不是鏡像( ! sc 中的第 i 個字符的鏡像字符等於字串 sc 中的倒數第 i 個字符)的話
					}
					if (sc.charAt(i) != sc.charAt(len - 1 - i)) { //不是迴文的話
						pa = 0;
					}
					/*如果字串的正向和反向對應位置的字符相等（即回文），
					  或者正向位置的字符在鏡像映射表中存在並且對應的反向位置的字符也相等（即鏡像），則進入這個條件
					  如果是回文，則 pa 不變，如果是鏡像，則 mi 不變。*/
				} else {
					mi = pa = 0;
					break;
				}
			}

			System.out.print("\n"+sc);
			
			if (pa == 1 && mi == 1) { //是鏡像迴文
				System.out.print(" -- is a mirrored palindrome.");
			} else if (pa == 1) {      //是一般的迴文
				System.out.print(" -- is a regular palindrome.");
			} else if (mi == 1) {      //是鏡像字串
				System.out.print(" -- is a mirrored string.");
			} else {                    //不是迴文
				System.out.print(" -- is not a palindrome.");
			}
			System.out.println();
		}
	}
}
/*NOTAPALINDROME
ISAPALINILAPASI
2A3MEAS
ATOYOTA

NOTAPALINDROME -- is not a palindrome.

ISAPALINILAPASI -- is a regular palindrome.

2A3MEAS -- is a mirrored string.

ATOYOTA -- is a mirrored palindrome.
*/
