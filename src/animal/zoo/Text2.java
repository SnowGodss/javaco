package animal.zoo;

import java.util.ArrayList;
import java.util.Collections;

public class Text2 {
    // 方法引用(類別名稱引用成員方法)
    // 格式：類別名稱::成員方法
    // 需求：集合裡面一些字串,要求變成大寫後進行輸出

    // 方法引用的規則:
    // 1. 需要有函數式接口
    // 2. 被引用的方法必須已經存在
    // 3. 被引用方法的形參,需要跟抽象方法的第二個形參到最後一個形參保持一致,返回值需要保持一致。
    // 4. 被引用方法的功能需要滿足當前的需求

    // 抽象方法形參的詳解:
    // 第一個參數:表示被引用方法的呼叫者,決定了可以引用哪些類別中的方法
    // // 在Stream流當中,第一個參數一般都表示流裡面的每一個資料。
    // // 假設流裡面的資料是字串,那麼使用這種方式進行方法引用,只能引用String這個類別中的方法
    // 第二個參數到最後一個參數:跟被引用方法的形參保持一致,如果沒有第二個參數,說明被引用的方法需要是無參的成員方法

    // 局限性:
    // // 不能引用所有類別中的成員方法。
    // // 是跟抽象方法的第一個參數有關,這個參數是什麼型別的,那麼就只能引用這個類別中的方法。

    public static void main(String[] args) {
        // 1.創建集合
        ArrayList<String> list = new ArrayList<>();
        // 2.添加數據
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");
        // 3.變大後進行輸出
        // 映射（字串::toUpperCase）
        // 拿著流裡面的每一個資料,去呼叫String類別中的toUpperCase方法,方法的回傳值就是轉換之後的結果。
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

        // String -> String
        // list.stream().map(new Function<String, String>() {
        // @Override
        // public String apply(String s) {
        // return s.toUpperCase();
        // }
        // }).forEach(s -> System.out.println(s));
    }
}