package inherit.son;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        /*
         * HashMap練習1：Map集合案例-統計投票人數 需求： 某個班級80名學生, 現在需要組成秋遊活動, 班長提供了四個景點(A, B, C, D),
         * 每個學生只能選擇一個景點, 請統計出最終哪個景點想去的人數最多
         */

        HashMap<Ye, String> map = new HashMap<Ye, String>();

        map.put(new Ye("A", 1), "台灣");
        map.put(new Ye("B", 2), "日本");
        map.put(new Ye("C", 3), "美國");
        map.put(new Ye("B", 2), "越南");

        for (Ye name : map.keySet()) {
            System.out.println(name + " " + map.get(name));
        }

    }
}