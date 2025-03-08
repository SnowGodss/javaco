package ithemia.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamTextMid {
    public static void main(String[] args) {
        /*
         * Stream流的中間方法 方法名。 說明 Stream<T> filter(Predicate<? super T>predicate). 過濾
         * Stream<T> limit(long maxSize) 獲取前幾個元素 Stream<T> skip(long n) 跳過前幾個元素
         * Stream<T> distinct() 元素去重, 依賴(hashCode和equals方法) static <T> Stream<T>
         * concat(Stream a, Stream b) 合併a和b兩個為一個流 Stream<R> map(Function<T, R> mapper)
         * 轉換流中的數據類型 注意一：中間方法, 返回新的Stream流, 原來的Stream流只能使用一次, 建議使用鍊式編程
         * 注意二：修改Stream流中的數據, 不會影響原來集合或者數據中的數據
         */

        // 創建集合
        ArrayList<String> list = new ArrayList<>();
        // 加入元素
        Collections.addAll(list, "張無忌-3", "張無忌-3", "張無忌-3", "周正落-15", "造敏-20", "張三丰-30", "張翠山-60", "張良-90");

        // 1.filter 過濾 (把張開頭的留下, 其餘數據過濾不要)
        list.stream().filter(s -> s.startsWith("張")).forEach(s -> System.out.println(s));
        System.out.println("================================");

        // 2.limit 獲取前幾個元素
        list.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println("================================");

        // 3.skip 跳過前幾個元素
        list.stream().skip(3).forEach(s -> System.out.println(s));
        System.out.println("================================");

        // 3.5 混著用
        list.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
        System.out.println("================================");

        // 4. distinct 去掉重複的元素
        list.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("================================");

        // 5.concat 合併a和b兩個流為一個流
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "消炎", "唐三");
        Stream.concat(list.stream(), list2.stream()).forEach(s -> System.out.println(s));
        System.out.println("=================================");

        // 6. map 轉換流中的數據類型

        /*
         * list.stream().map(new Function<String, Integer>() {
         *
         * @Override public Integer apply(String s) { String[] arr = s.split("-");
         * String ageString = arr[1]; int age = Integer.parseInt(ageString); return age;
         * } }).forEach(s -> System.out.println(s));
         */

        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));
    }
}
