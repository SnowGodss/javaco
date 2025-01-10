package inherit.son;

import java.util.HashMap;
import java.util.Map;

public class Text {
    public static void main(String[] args) {
        /*
         * Map的常見API
         * Map是雙列集合的頂層接口, 它的功能是全部雙列集合都可以繼承使用
         * 方法名。 說明
         * V put(K key, V value) 添加元素
         * V remove(Object key) 根據鍵刪除鍵值對元素
         * void clear() 移除所有的鍵值對元素
         * boolean containsKey(Object key). 判斷集合是否包含指定的鍵
         * boolean containsValue(Object value) 判斷集合是否包含指定的值
         * boolean isEmpty() 判斷集合是否為空
         * int size() 集合的長度, 也就是集合中鍵值對的個數
         */

        // 1.創建對象
        Map<String, String> m = new HashMap<>();

        // 2.添加元素
        // put方法的細節：
        // 添加/覆蓋
        // 在添加數據的時候, 如果鍵不存在, 那麼直接把鍵值對對象添加到map集合當中, 方法返回null
        // 在添加數據的時候, 如果存在, 那麼會把原有的鍵值對象覆蓋, 會把被覆蓋的值進行返回
        System.out.println("添加元素");
        m.put("1", "a");
        m.put("2", "b");
        m.put("3", "c");

        String value = m.put("1", "d");
        System.out.println(m.put("4", "d")); // 如果key不存在，返回null
        System.out.println(value);
        System.out.println("-----------------");

        // 3.刪除元素
        // remove方法的細節：
        // 刪除鍵值對對
        System.out.println("刪除元素");
        String value1 = m.remove("1"); // 返回刪除的值d
        System.out.println(value1);
        System.out.println("-----------------");

        // 4.判斷元素是否存在
        // containsKey方法的細節：
        // 判斷集合是否包含指定的鍵
        System.out.println("判斷元素的鍵是否存在");
        System.out.println(m.containsKey("2"));
        System.out.println("-----------------");

        // 5.判斷元素是否存在
        // containsValue方法的細節：
        // 判斷集合是否包含指定的值
        System.out.println("判斷元素的值是否存在");
        System.out.println(m.containsValue("2"));
        System.out.println("-----------------");

        // 6.判斷集合是否為空
        // isEmpty方法的細節：
        // 判斷集合是否為空
        System.out.println("判斷集合是否為空");
        System.out.println(m.isEmpty());
        System.out.println("-----------------");

        // 7.獲取集合長度
        // size方法的細節：
        // 獲取集合的長度, 也就是集合中鍵值對的個數
        System.out.println("獲取集合長度");
        System.out.println(m.size());
        System.out.println("-----------------");

        // 8.獲取元素
        // get方法的細節：
        // 根據鍵獲取鍵值對象
        System.out.println("獲取元素");
        System.out.println(m.get("2"));
        System.out.println("-----------------");

        // 9.迭代遍歷集合
        // entrySet方法的細節：
        // 獲取集合中所有的鍵值對對元素
        // 遍歷集合時可以獲取鍵值對對中的鍵和值
        System.out.println("迭代遍歷集合");
        for (Map.Entry<String, String> entry : m.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        System.out.println("-----------------");

        // 10.清空集合
        // clear方法的細節：
        // 移除所有的鍵值對元素
        System.out.println("清空集合");
        m.clear();
        System.out.println("-----------------");

        // 11.打印集合
        System.out.println("打印集合");
        System.out.println(m);

    }
}