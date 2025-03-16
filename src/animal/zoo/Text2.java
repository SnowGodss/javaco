package animal.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Text2 {
    // 方法引用綜合小練習：練習一
    // 需求：集合中儲存一些字符串的數據, 比如：張三, 23
    // 收集到Student類型的數組當中(使用方法引用完成)

    public static void main(String[] args) {
        // 1.創建集合
        ArrayList<String> list = new ArrayList<>();
        // 2.添加數據
        Collections.addAll(list, "張無忌,23", "周正落,15", "趙敏,20", "張強,30", "張三丰,60", "張翠山,90");
        // 3.收集到Student類型的數組當中
        Textson[] arr = list.stream().map(Textson::new).toArray(Textson[]::new);
        System.out.println(Arrays.toString(arr));
    }
}