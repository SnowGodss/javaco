package ithemia.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamText {
    public static void main(String[] args) {
        /*
         * Stream流的使用步驟 1.先得到一條Stream流(流水線), 並把數據放上去 獲取方式 方法名。 說明 單列集合 default Stream<E>
         * stream() Collection中的默認方法 雙列集合 無 無法直接使用Stream流 數組 public static <T> Stream<T>
         * stream(T[] array) Arrays工具類中的靜態方法 一堆零散數據. public static <T> Stream<T>
         * of(V...values) Stream接口中的靜態方法
         */

        // 1.單列集合獲取Stream流
        ArrayList<String> list = new ArrayList<>();
        list.stream().forEach(s -> System.out.println(s));

        // 2.雙列集合獲取Stream流
        // HashMap無序
        HashMap<String, Integer> hm = new HashMap<>();
        hm.entrySet()/* or keySet */.stream().forEach(s -> System.out.println(s));

        // 3.數組獲取Stream流
        int[] arr = new int[0];
        Arrays.stream(arr).forEach(s -> System.out.println(s));

        // 4.一堆零散數據獲取Stream流(需要是同種數據類型)
        Stream.of("1", "2", "3").forEach(s -> System.out.println(s));
    }
}
