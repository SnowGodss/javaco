package animal.zoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Text4 {
    public static void main(String[] args) {
        // 方法引用綜合小練習：練習三
        // 需求：創建集合添加學生對象, 學生對象屬性：name, age
        // 把姓名和年齡拼接成: 張三-23的字符串, 並放到數組當中(使用方法引用)

        // 1.創建集合
        ArrayList<Textson> list = new ArrayList<>();
        // 2.將信息添加到集合中
        list.add(new Textson("張無忌", 23));
        list.add(new Textson("周正落", 15));
        list.add(new Textson("趙敏", 20));
        list.add(new Textson("張強", 30));
        list.add(new Textson("張三丰", 60));
        list.add(new Textson("張翠山", 90));
        // 把姓名和年齡拼接成: 張三-23的字符串, 並放到數組當中
        String[] arr = list.stream().map(Textson::toString).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
