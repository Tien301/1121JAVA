import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readtxt {
    public static void main(String[] args) {
        // 要讀取的檔案路徑
        String filePath = "a1.txt";

        try {
            // 使用FileReader來讀取檔案
            FileReader fileReader = new FileReader(filePath);

            // 使用BufferedReader來讀取文字檔案，以提高效能
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // 逐行讀取文字檔案內容
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // 關閉資源
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            // 處理例外狀況
            e.printStackTrace();
        }
    }
}
