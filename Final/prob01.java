
import java.util.*;

public class prob01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		if( ! str1.matches("s1[0-9]{6}@mail.yzu.edu.tw")) {
			System.out.println("NO");
		}
		else
			System.out.println("OK");
		
		}
	}

//檢查該字串是不是一個元智大學學生的email address。是，則印出”OK”  
//都是"s#######@mail.yzu.edu.tw”格式