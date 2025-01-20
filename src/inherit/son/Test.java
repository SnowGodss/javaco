package inherit.son;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*
         * HashMap練習1：Map集合案例-統計投票人數 需求： 某個班級80名學生, 現在需要組成秋遊活動, 班長提供了四個景點(A, B, C, D),
         * 每個學生只能選擇一個景點, 請統計出最終哪個景點想去的人數最多
         */

        // 1.需要先讓同學投票

        // 定義一個數組, 用來存儲4個景點
        String[] arr = { "A", "B", "C", "D" };

        // 利用隨機數模擬80個同學的投票, 並把投票結果存儲起來
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 80; i++) {
            int r = (int) (Math.random() * arr.length);
            list.add(arr[r]);
        }

        // 2. 如果要統計的東西比較多, 不方便使用計數器思想
        // 我們可以定義Map集合, 利用集合進行統計
        HashMap<String, Integer> map = new HashMap<>();

        for (String name : list) {
            // 判斷當前的景點在map集合中是否存在
            if (map.containsKey(name)) {
                // 如果存在, 獲取出來
                // map.get("A"); 會得到 對應的值也就是數字
                int count = map.get(name);
                // 對應的值+1
                map.put(name, count + 1);
            } else {
                // 如果不存在, 直接存儲進去, 對應的值為1
                map.put(name, 1);
            }
        }
        for (String name : map.keySet()) {
            System.out.println(name + " : " + map.get(name));

        }
        int max = 0;
        Set<Map.Entry<String, Integer>> keys = map.entrySet();
        for (Map.Entry<String, Integer> key : keys) {
            int count = key.getValue();
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);

        for (Map.Entry<String, Integer> key : keys) {
            if (key.getValue() == max) {
                System.out.println("最多的景點是 : " + key.getKey());
            }
        }
    }
}