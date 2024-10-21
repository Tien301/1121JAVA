import java.util.*;

public class HW3_1_1111759 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //標準起手

        System.out.print("請輸入由兩個運算元和一個運算子組成的字串（例如：123*456）：");
        String st = sc.nextLine();   //nextLine讀字串

        // ex輸入 456*123
        String[] spst = st.split("[+\\-*/]");  //看到+ - * / 就拆掉
        int n1 = Integer.parseInt(spst[0].trim());  //spst[0]=456
        int n2 = Integer.parseInt(spst[1].trim());  //spst[1]=123  trim刪掉空白符號
        
        char operator = st.charAt(spst[0].length());  //charAt=字元在 第tokens[0].length()個位置   
        //tokens[0]=456，長度為3。input字串裡0>1>2>3第三號位置就是符號
        
        
        int result = 0;
        switch (operator) {
            case '+':
                result = n1 + n2;break;
            case '-':
                result = n1 - n2;break;
            case '*':
                result = n1 * n2;break;
            case '/':
            	if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("除數不能為0");
                    return;
                }
                break;
            default:
                System.out.println("無效的運算子");
                return;
        }
        System.out.println(n1+"\n"+operator+"\n"+n2+"\n"+result);
    }

}
