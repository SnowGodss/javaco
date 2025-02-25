package animal.zoo;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        /*
         * Stream流：體驗Stream流的作用 需求：按照下面的要求集合的創建和遍歷 創建一個集合, 儲存多個字符串元素
         * 要求一：把所有已"張"開頭的元素儲存到新集合中 要求二：把"張"開頭的, 長度為3的元素再儲存到新集合中 要求三：遍歷打印結果
         */

        // 1. 創建集合
        ArrayList<String> list1 = new ArrayList<>();
        // 2. 添加元素
        list1.add("張三");
        list1.add("李四");
        list1.add("王五");
        list1.add("赵六");
        list1.add("張強");
        list1.add("張三瘋");
        // 3. 創建新集合
        ArrayList<String> list2 = new ArrayList<>();
        // 4. 遍歷
        for (String s : list1) {
            if (s.startsWith("張")) {
                list2.add(s);
            }
        }
        System.out.println(list2);
    }
}