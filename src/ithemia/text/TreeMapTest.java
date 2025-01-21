package ithemia.text;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        /*
         * TreeMap基本應用1： 需求： 鍵：整數表示ID 值：字符串表示商品名稱 要求：按照id的升序排列, 按照id的降序排列
         */

        // 1. 創建集合
        // 使用Comparator來指定排序方法，在這裡指定為降序排序(大到小)
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2 - o1);

        // 2. 添加元素
        tm.put(2, "雪碧");
        tm.put(4, "紅茶");
        tm.put(3, "綠茶");
        tm.put(1, "可樂");

        // 3. 打印集合
        System.out.println(tm);
    }
}