package inherit.son;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        /*
         * TreeMap基本應用2： 需求： 鍵：學生對象 值：籍貫 要求：按照學生年齡的升序排列, 年齡一樣按照姓名的字母排列, 同姓名同年齡視為同一個人
         */

        // 1. 創建集合
        TreeMap<Ye, String> tm = new TreeMap<>();

        // 2. 添加元素
        tm.put(new Ye("小明", 19), "台北");
        tm.put(new Ye("小明", 18), "北京");
        tm.put(new Ye("小明", 19), "台南");
        tm.put(new Ye("小亮", 18), "上海");

        // 3. 打印集合
        System.out.println(tm);
    }
}