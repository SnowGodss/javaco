package animal.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Text3 {
    public static void main(String[] args) {
        // Stream練習：數據操作2(進階)
        // 現在有兩個ArrayList集合
        // 第一個集合中：存儲6個男演員的姓名和年齡.
        // 第二個集合中：存儲6個女演員的性名和年齡
        // 姓名和年齡用逗號隔開, 比如, 張三,23
        // 要求完成以下操作：
        // 1：男演員只要名字為3個字的前兩人
        // 2：女演員只要姓楊, 並且不要第一個
        // 3：把過濾後的男演員和女演員姓名合併在一起
        // 4：將上一步的演員信息封裝成Actor對象
        // 5：將所有的演員對象保存到List集合中
        // 備註：演員類Actor, 屬性只有一個：name, age */

        // 1.創建兩個集合用來存儲 男/女性 姓名,年齡
        ArrayList<String> listman = new ArrayList<>();
        ArrayList<String> listwoman = new ArrayList<>();
        // 2.將演員信息添加到集合中
        Collections.addAll(listman, "蔡坤坤,23", "葉猴嫌,23", "流不甜,22", "無鉛,24", "古家,30", "蕭良良,27");
        Collections.addAll(listwoman, "趙小穎,35", "楊穎,36", "高圓圓,43", "張天天,31", "劉詩,35", "楊小冪,33");
        List<Object> list = Stream
                // 3.合併兩個集合
                // 3.1 先把男演員只要名字為3個字的前兩人
                .concat(listman.stream().filter(s -> s.split(",")[0].length() == 3).limit(2),
                        // 3.2 接著把女演員只要姓名, 並且不要第一個
                        listwoman.stream().filter(s -> s.split(",")[0].startsWith("楊")).skip(1))
                // 3.3 把過濾後的男演員和女演員姓名合併在一起
                // .map() 轉換數據類型
                .map(new Function<String, Object>() {
                    @Override
                    public Textson apply(String s) {
                        String name = s.split(",")[0];
                        int age = Integer.parseInt(s.split(",")[1]);
                        return new Textson(name, age);
                    }
                    // 3.4 把流轉成新的集合
                }).collect(Collectors.toList());
        // 4. 打印集合
        System.out.println(list);
    }
}
