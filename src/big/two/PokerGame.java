package big.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/*  大老二練習：大老二遊戲2(控制台版)
完成鬥地主遊戲以下步驟：
步驟一：準備牌
步驟二：洗牌
步驟三：發牌
步驟四：給排進行排序
*/
public class PokerGame {
    // 4. 建立集合用來存儲 組合好的牌組
    static ArrayList<String> list = new ArrayList<>();
    // 5. 建立雙列集合用來存儲牌組數值
    static HashMap<String, Integer> hm = new HashMap<>();
    static {
        // 1. 建立集合用來存儲花色
        String[] color = { "♣️", "♦️", "♥️", "♠️" };
        // 2. 建立集合用來存儲數字
        String[] number = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };

        // 3. 將所有花色和數字組合在一起，並將其加入到集合中
        // 外循環：遍歷每一個花
        for (String c : color) {
            // 內循環：遍歷每一個數字
            for (String n : number) {
                // 將每一個數字印上同個花色再全部重新遍歷
                // 先印花色再印數字, 印完後加入到集合中
                list.add(c + n);
            }
        }
        // 6. 紀錄牌面數值
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
    }

    public PokerGame() {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入游玩人數(3人/4人):");
        int playerNum = sc.nextInt();
        if (playerNum == 3) {
            ThreePlayer();
        } else {
            FourPlayer();
        }
    }

    // 7.創建方法用來排列牌組
    public void order(ArrayList<String> list) {
        // 8. 對集合進行指定排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 9. 根據數值和花色進行排序，數值大的優先
                // 取出花色(包頭不包尾)
                String color1 = o1.substring(0, 1);
                String color2 = o2.substring(0, 1);
                // 調用方法排列數值
                int value1 = getValue(o1);
                int value2 = getValue(o2);

                // 要插入的牌值 - 已存入的牌值
                int i = value1 - value2;

                // 使用三元運算符判斷 數值相減是否等於0? 如果等於0
                // 那就對比花色(花色的數值不同)(花色大小：黑桃 > 愛心 > 方塊 > 梅花)
                // 如果花色相同那就返回0
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    // 創建一個方法用來判斷該鍵是否存在
    public int getValue(String poker) {
        // 獲取鍵值(調用方法判斷牌數值)
        String number = getNumber(poker);
        // 判斷鍵值是否存在並返回(如果存在就返回原本鍵的值, 如果不存在就返回-1)
        if (hm.containsKey(number)) {
            return hm.get(number);
        } else {
            return Integer.parseInt(number);
        }
    }

    // TODO: ”重要“ 去掉花色只取要的數字
    public String getNumber(String poker) {
        // 替換全部換成指定的正則表達式的格式
        return poker.replaceAll("[^0-9JQKA2]", "");
    }

    // 10.創建一個方法來判斷是幾個人玩
    public void FourPlayer() {
        // 打亂牌組
        Collections.shuffle(list);

        // 創建玩家
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> player4 = new ArrayList<>();

        // 發牌(輪流發牌給玩家)
        for (int i = 0; i < list.size(); i++) {
            switch (i % 4) {
            case 0 -> player1.add(list.get(i));
            case 1 -> player2.add(list.get(i));
            case 2 -> player3.add(list.get(i));
            case 3 -> player4.add(list.get(i));
            }
        }

        // 排序各自的牌
        order(player1);
        order(player2);
        order(player3);
        order(player4);

        // 打印四位玩家手牌
        System.out.println("🃏 玩家1手牌: " + player1);
        System.out.println("🃏 玩家2手牌: " + player2);
        System.out.println("🃏 玩家3手牌: " + player3);
        System.out.println("🃏 玩家4手牌: " + player4);
    }

    public void ThreePlayer() {
        // 打亂牌組
        Collections.shuffle(list);

        // 創建玩家
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        // 發牌(輪流發牌給玩家)
        for (int i = 0; i < list.size() - 1; i++) {
            switch (i % 3) {
            case 0 -> player1.add(list.get(i));
            case 1 -> player2.add(list.get(i));
            case 2 -> player3.add(list.get(i));
            }
        }
        // 最後一張當作底牌
        String trumpcard = list.get(51);

        if (player1.contains("♣️3")) {
            player1.add(trumpcard);
        } else if (player2.contains("♣️3")) {
            player2.add(trumpcard);
        } else {
            player3.add(trumpcard);
        }

        // 排序各自的牌
        order(player1);
        order(player2);
        order(player3);

        // 打印三位玩家手牌
        System.out.println("玩家1 (" + player1.size() + " 張): " + player1);
        System.out.println("玩家2 (" + player2.size() + " 張): " + player2);
        System.out.println("玩家3 (" + player3.size() + " 張): " + player3);
        System.out.println("底牌: " + trumpcard);
    }
}