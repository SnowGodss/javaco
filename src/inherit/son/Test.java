package inherit.son;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*
         * 創建Map的不可變集合, 鍵值對的數項要超過十個： 細節1：鍵是不可重複的 細節2：Map裡面的of方法, 參數是有上限的, 最多只能傳遞20個參數,
         * 十個鍵值對 細節3：如果我們要傳遞多個鍵值對對象, 數量大於10個, 在Map接口中還有一個方法
         */

        // 1.創建一個普通的Map集合
        HashMap<String, String> hm = new HashMap<>();
        hm.put("張三", "新北");
        hm.put("李四", "台中");
        hm.put("王五", "桃園");
        hm.put("老六", "台北");
        hm.put("舞七", "高雄");
        hm.put("老八", "新竹");
        hm.put("六九", "苗栗");
        hm.put("十字", "台南");
        hm.put("aaa", "123");
        hm.put("bbb", "456");
        // 2.利用上面的數據獲取一個不可變的集合
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        // 把entries變成一個數組
        Map.Entry[] arr = entries.toArray(new Map.Entry[0]);
        // toArray方法在底層會比較集合的長度跟數組的長度兩者的大小
        // 如果集合的長度 > 數組的長度 ： 數據在數組中放不下, 此時會根據實際數據的個數, 重新創建數組
        // 如果集合的長度 <= 數組的長度 ： 數據在數組中完全可以放下, 所以不會重新創建數組
        Map map = Map.ofEntries(arr);

        // 長度1：
        // Map.entry[] arr1 = new Map.entry[0];
        // Map.entry[] arr2 = entries.toArray(arr1);
        // Map map = Map.ofEntries(arr2);
        // 長度2：
        // Map.Entry[] arr = entries.toArray(new Map.Entry[0]);
        // Map map = Map.ofEntries(arr);
        // 長度三：
        // Map<Object, Object> map = Map.ofEntries(entries.toArray(new Map.Entry[0]));

        Map<String, String> map1 = Map.copyOf(hm);
        // 這樣就變成了不可變, 添加數據會報錯
        map1.put("123", "123");

    }
}