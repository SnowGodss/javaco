package animal.zoo;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        /*
         * Stream流：體驗Stream流的作用 需求：按照下面的要求集合的創建和遍歷 創建一個集合, 儲存多個字符串元素
         * 要求一：把所有已"張"開頭的元素儲存到新集合中 要求二：把"張"開頭的, 長度為3的元素再儲存到新集合中 要求三：遍歷打印結果
         */

        // 未使用Steam的結果

        /*
         * // 1. 創建集合 ArrayList<String> list1 = new ArrayList<>(); // 2. 添加元素
         * list1.add("張三"); list1.add("李四"); list1.add("王五"); list1.add("赵六");
         * list1.add("張強路"); list1.add("張三瘋"); // 3. 創建新集合來記錄姓張的人 ArrayList<String>
         * list2 = new ArrayList<>(); // 4. 遍歷 for (String s : list1) { if
         * (s.startsWith("張")) { list2.add(s); } }
         *
         * // 5. 創建新的集合來記錄姓張, 長度為3的人 ArrayList<String> list3 = new ArrayList<>(); //
         * 6.遍歷 // 以list2為依據在進行遍歷一次 for (String s : list2) { if (s.length() == 3) {
         * list3.add(s); } } System.out.println(list3);
         */

        // 使用Stream的結果：

        // 1.創建集合
        ArrayList<String> list = new ArrayList<>();
        // 2. 添加元素
        list.add("張三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("張強路");
        list.add("張三瘋");
        // 3.使用stream的過濾code filter
        // 第一步開頭姓張的, 第二步長度為三的, 打印結果
        list.stream().filter(name -> name.startsWith("張")).filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }
}