package inherit.son;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        /*
         * 綜合練習6：Map集合案例-市和區 需求：定義一個Map集合, 鍵用來表示市名稱city, 值用來表示區district, 但區會有多個 添加完畢後,
         * 遍歷格式如下： 新北市 = 蘆洲區, 三重區, 新店區, 土城區, 五股區 高雄市 = 永安區, 左營區, 甲仙區, 內門區, 鳳山區 台北市 =
         * 中山區, 松山區, 信義區, 萬華區, 北投區
         */

        // 1.創建集合
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        // 2.創建單列集合來儲存 區
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();

        // 3.添加 區名
        Collections.addAll(city1, "蘆洲區", "三重區", "新店區", "土城區", "五股區");
        Collections.addAll(city2, "永安區", "左營區", "甲仙區", "內門區", "鳳山區");
        Collections.addAll(city3, "中山區", "松山區", "信義區", "萬華區", "北投區");

        // 4.添加市和區到集合中
        map.put("新北市", city1);
        map.put("高雄市", city2);
        map.put("台北市", city3);

        // 創建entry 取出集合中的key和value
        Set<Map.Entry<String, ArrayList<String>>> entry = map.entrySet();
        // 遍歷集合
        for (Map.Entry<String, ArrayList<String>> entry1 : entry) {
            // 取出市的值
            String key = entry1.getKey();
            // 創建StringJoiner來定義儲存格式
            StringJoiner sj = new StringJoiner(", ", "", "");
            // 遍歷當前集合的值並添加到StringJoiner用來排列到指定格式
            for (String value : entry1.getValue()) {
                sj.add(value);
            }
            // 打印
            System.out.println(key + " = " + sj);
        }
    }
}