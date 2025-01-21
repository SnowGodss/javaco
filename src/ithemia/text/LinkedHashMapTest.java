package ithemia.text;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        /*
         * LinkedHashMap： 由鍵決定：有序, 不重複, 不索引 有序：保證存取和取出的順序一樣 原理：底層數據結構是依據哈希表,
         * 只是每個鍵值對元素又額外多了一個雙鏈錶的機制紀錄存儲的順序
         */
        // 1.創建集合
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();

        // 2.添加元素
        lhm.put("A", "123");
        lhm.put("A", "123");
        lhm.put("B", "456");
        lhm.put("C", "789");

        // 3.打印集合
        System.out.println(lhm);
    }
}