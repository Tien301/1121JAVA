import java.io.*;

public class HW3_4_1111759 {
	/*寫完成下面程式中的函式 int findCount(string s1, string s2)。*/
	public static int findCount(String s1, String s2)
	 {
		int count = 0;
        int index = s1.indexOf(s2);  //indexOf找不到就默認是-1

        while (index != -1) {
            count++;
            index = s1.indexOf(s2, index + 1);
        }
        return count;
		
	 }

	public static void main(String[] args)  /*throws IOException*/{
		/*
		 * 此函式會傳回 s2 在 s1 裡面出現的"次數"。例如，輸入 s1 後按 Enter 輸入 s2，再按 Enter 輸出結果。
		 * abeabdfabafbgbbaxbahjjbabebeaba
		 * ab
		 * 會輸出
		 * 5*/
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String s1, s2;
            s1 = br.readLine();
            s2 = br.readLine();
            System.out.print(findCount(s1, s2));
        }catch (IOException e) {
            e.printStackTrace();
        }

	}

}
