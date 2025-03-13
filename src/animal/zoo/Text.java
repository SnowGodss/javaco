package animal.zoo;

import java.util.ArrayList;
import java.util.Collections;

public class Text {
    public static void main(String[] args) {
        /*
         * 方法引用練習：引用靜態方法 格式：類名::靜態方法 範例：Integer::parseInt
         *
         * 練習： 集合中有以下數字, 要求把他們都變成int類型 "1", "2", "3" ,"4", "5"
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");
        // 引用的方法是 JAVA中的：parseInt
        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));
    }
}