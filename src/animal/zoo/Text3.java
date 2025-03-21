package animal.zoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Text3 {
    public static void main(String[] args) {
        // 方法引用綜合小練習：練習二
        // 需求：創建集合添加學生對象, 學生對象屬性：name, age
        // 只獲取姓名並放到數組當中(使用方法引用)

        // 技巧:

        // 1.現在有沒有一個方法符合我目前的需求
        // 2.如果有這樣的方法,這個方法是否滿足引用的規則
        // 靜態 類別名稱::方法名
        // 成員方法
        // 構造方法類別名稱::new

        // 1.創建集合用來存儲 姓名,年齡
        ArrayList<Textson> list = new ArrayList<>();
        // 2.將信息添加到集合中
        list.add(new Textson("張無忌", 23));
        list.add(new Textson("周正落", 15));
        list.add(new Textson("趙敏", 20));
        list.add(new Textson("張強", 30));
        list.add(new Textson("張三丰", 60));
        list.add(new Textson("張翠山", 90));
        //
        String[] arr = list.stream().map(Textson::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
