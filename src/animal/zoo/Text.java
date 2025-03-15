package animal.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Text {
    // 方法引用(引用構造方法)
    // 格式： 類名::new
    // 目的： 這個類的對象
    // 需求： 將數據包裝成Student對象並收集到List集合中

    // 方法引用規則：
    // 1.需要有函數式接口
    // 2.被引用的方法必須已經存在
    // 3.被引用方法的形參和返回值, 需要跟抽象方法的形參返回值保持一致
    // 4.被引用方法的功能需要滿足當前的需求

    public static void main(String[] args) {
        // 1.創建集合
        ArrayList<String> list = new ArrayList<>();
        // 2.添加數據
        Collections.addAll(list, "張無忌, 23", "周正落, 24", "造敏, 15", "張三丰, 30", "張翠山, 60", "張良, 90");
        /*
         * // 3.將數據包裝成Student對象並收集到List集合中 List<Textson> listson = list.stream() .map(s
         * -> new Textson(s.split(", ")[0], Integer.parseInt(s.split(", ")[1])))
         * .collect(Collectors.toList());
         */

        // 3.將數據包裝成Student對象並收集到List集合中
        List<Textson> listson = list.stream().map(Textson::new).collect(Collectors.toList());
        // 4.顯示
        System.out.println(listson);
    }
}