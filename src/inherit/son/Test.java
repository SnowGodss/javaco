package inherit.son;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        /*
         * 自動點名器1： 班級裡有N個學生, 實現隨機點名器
         */

        // 1.創建集合
        ArrayList<String> list = new ArrayList<>();

        // 2.批量添加元素
        Collections.addAll(list, "小明", "小虎", "張三", "李四", "唐憎", "孫悟空");

        // 3.隨機打亂元素
        Collections.shuffle(list);

        // 4. 取得第一個元素並取出
        String name = list.get(0);

        // 5. 打印元素
        System.out.println(name);
    }
}