import java.util.*;
public class HW3_5_1111759 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 事件的數量
        scanner.nextLine(); // 消耗換行符

        // 使用Map來儲存每個國家對應的女性名字集合  
        Map<String, Integer> countryMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            String country = parts[0]; // 國家名稱
            // 將國家對應的女性名字數量加一
            countryMap.put(country, countryMap.getOrDefault(country, 0) + 1);
        }//countryMap.getOrDefault(country, 0) + 1指從countryMap 中取得指定 country 的值，如果該鍵不存在，則返回 0，然後將取得的值加上 1

        // 輸出結果
        for (Map.Entry<String, Integer> entry : countryMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
/* UVA-10420 - List of Conquests
 * 簡單來說，本題就是要找每個國家重複的個數，並按照字典順序印出答案。
 * 因此，只需要「存取國家名稱」，按「首字字母順序排序」，最後「找出重複的數量」。
 * 要注意的是，女生名字並沒有規定字數，但是若只有兩個字的話會 WA。
 */