package animal.zoo;

import java.util.ArrayList;
import java.util.Collections;

public class Text2 {
    public static void main(String[] args) {
        /*
         * 方法引用練習：練習一 格式：對象::成員方法 1.其他類：其他類對象::方法名 2.本類：this::方法名 3.父類：super::方法名
         *
         * 需求：集合中有一些名字, 按照要求過濾數據 數據："張無忌", "周正落", "趙敏", "張強", "張三丰" 要求：只要以張開頭,
         * 並且名字是三個字的(需使用方法引用)
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "張無忌", "周正落", "造敏", "張三丰");
        Textson jdg = new Textson();
        list.stream().filter(jdg::stringJudge).forEach(s -> System.out.println(s));

    }
}
