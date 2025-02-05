package inherit.son;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        /*
         * 自動點名器2： 班級裡有N個學生, 實現隨機點名器 要求：70%的概率隨機到男生 30%的概率隨機到女生
         */

        // 1.創建集合
        ArrayList<Integer> list = new ArrayList<>();

        // 2.批量添加元素
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);

        // 3.隨機打亂元素
        Collections.shuffle(list);
        int index = list.get(0);

        // 4.創建兩個集合來儲存男生和女生的名字
        ArrayList<String> manlist = new ArrayList<>();
        ArrayList<String> girllist = new ArrayList<>();

        Collections.addAll(manlist, "1", "2", "3", "4", "5", "6", "7");
        Collections.addAll(girllist, "8", "9", "10");

        System.out.println(list);

        // 5.判斷此時是從manlist中取出名字還是girllist中取出名字
        if (index == 1) {
            Collections.shuffle(manlist);
            System.out.println(manlist);
            System.out.println(manlist.get(0));
        } else {
            Collections.shuffle(girllist);
            System.out.println(girllist);
            System.out.println(girllist.get(0));
        }
    }
}