package animal.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Text2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "張無忌, 23", "周正落, 24", "造敏, 15", "張三丰, 30", "張翠山, 60", "張良, 90");
        // 首先將逗號分隔成陣列, 再過篩選出年齡大於等於24的(因為年齡是字串, 所以要轉成數字)
        // 注意: 這是將鍵值對換成Map時, 若有同名的鍵, 後面的值會覆掉前面的值, 這是希望同名的鍵表示同一個人多個年齡時, 取最後的年齡
        // 若不希望這樣, 可以改用Collectors.groupingBy() 來分組, 再用groupingByValues() 取出每個分組的最後一個元素
        list.stream().map(s -> s.split(", ")).filter(s -> Integer.parseInt(s[1]) >= 24)
                // 然後將以下的元素流換成Map, 鍵為名字, 值為年齡, 最後輸出結果
                .collect(Collectors.toMap(s -> s[0], s -> Integer.parseInt(s[1])))
                .forEach((name, age) -> System.out.println(name + " - " + age));
    }
}
