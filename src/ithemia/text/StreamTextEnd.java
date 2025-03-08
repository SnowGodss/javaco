package ithemia.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class StreamTextEnd {
    public static void main(String[] args) {
        /*
         * Stream流的終結方法 方法名。 說明 void forEach(Consumer action). 遍歷 long count() 統計
         * toArray() 收集流中的數據, 放到數組中 collect(Collector collector) 收集流中的數據, 放到集合中
         */
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "張無忌", "周正落", "造敏", "張三丰", "張翠山", "張良");

        // 1. forEach 遍歷
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("================遍歷==============");

        // 2. count 統計
        System.out.println(list.stream().count());
        System.out.println("=================統計==============");

        // 3. toArray 收集數據, 放到數組中
        /*
         * Object[] arr = list.stream().toArray();
         * System.out.println(Arrays.toString(arr));
         */
        // IntFunction的範型：
        // toArray方法的參數作用：負責創建一個指定類型的數組
        // toArray方法的底層：會依次得到流中的每一個數據, 並把數據放到數組當中
        // toArray方法的返回值：是一個裝著流裡面所有數據的數組
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            // apply的形參：流中數據的個數, 要跟數組的長度保持一致
            // apply的返回值：具體類型的數組
            // 方法體：就是創建數組
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));
        System.out.println("================收集1==============");
        // toArray() 把流结果转换成 数组
        String[] arr2 = list.stream().toArray(s -> new String[s]);
        System.out.println(Arrays.toString(arr2));
        System.out.println("================收集2==============");

        // 4. collect 收集數據, 放到集合中
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "張無忌-男-15", "周正弱-女-19", "造敏-男-20", "張三丰-男-30", "張翠花-女-60", "張良-男-90");
        // stream() 把 list2 转换成 Stream，生成流对象，方便用流操作处理数据
        // filter() 对流中的每个元素进行筛选，返回满足条件的元素
        // split() 拆分字符串，按指定字符（如 -）分割成数
        // collect() 把流中的元素收集成新的集合
        // toList() 把流结果转换成 List
        List<String> newlsit = list2.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(newlsit);
    }
}