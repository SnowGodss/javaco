package animal.zoo;

import java.util.List;

public class Text {
    public static void main(String[] args) {
        /*
         * 創建不可變的List集合 "張三", "李四", "王五", "老六"
         */

        // 一但建立完畢後, 是無法進行修改的, 在下面的代碼中, 只能進行查詢的動作
        List<String> list = List.of("張三", "李四", "王五", "老六");

        for (String s : list) {
            System.out.println(s);
        }
    }
}