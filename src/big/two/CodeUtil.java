package big.two;

import java.util.ArrayList;

public class CodeUtil {
    public static String getCode() {
        // 1.創建一個集合用來存儲a-z A-Z 0-9
        ArrayList<Character> list = new ArrayList<>();
        // 2. 將所有字母和數字添加到集合中
        // //有26個字母
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        // 3.隨機生成四個字母
        // //創建一個字符用來存儲隨機生成的四個字母
        String result = "";
        // //在集合中隨機取出四個字符添加到 result 字串中
        for (int i = 0; i < 4; i++) {
            int r = (int) (Math.random() * list.size());
            result += list.get(r);
        }
        // 4.隨機生成一個數字
        int r = (int) (Math.random() * 10);
        // //將數字添加到 result 字串中
        result += r;
        // 5.返回 result 字串
        return result;
    }
}
