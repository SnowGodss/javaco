package inherit.son;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*
         * Map集合的第三種遍歷方式
         */

        // 1. 創建Map集合對象
        Map<String, String> map = new HashMap<>();

        // 2. 添加數據
        map.put("0", "A");
        map.put("1", "B");
        map.put("2", "C");
        map.put("3", "D");
        map.put("4", "E");

        // 3.遍歷集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        entrySet.forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
    }
}