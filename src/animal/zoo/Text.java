package animal.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Text {
    public static void main(String[] args) {
        // 1.創建集合
        ArrayList<Integer> list = new ArrayList<>();
        // 2.添加數據
        Collections.addAll(list, 1, 2, 3, 4, 5);
        // 3. 收集到數組當中
        Integer[] arr = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        // Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
        // public Integer[] apply(int value) {
        // return new Integer[value];
        // }
        // }); */
    }
}