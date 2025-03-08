package animal.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Text {
    public static void main(String[] args) {
        /*
         * Stream練習：數據過濾 定義一個集合, 並添加些整數1, 2, 3, 4, 5, 6, 7, 8, 9 過濾奇數, 留下偶數 並將結果保存起來
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newlist = list.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
        System.out.println(newlist); // [1, 3, 5, 7, 9]
    }
}