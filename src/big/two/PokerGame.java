package big.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*  大老二練習：大老二遊戲1(控制台版)
    完成鬥地主遊戲以下步驟：
    步驟一：準備牌
    步驟二：洗牌
    步驟三：發牌
*/
public class PokerGame {
    static ArrayList<String> list = new ArrayList<String>();
    static {
        ArrayList<String> color = new ArrayList<>();
        Collections.addAll(color, "♠️", "♣️", "♥️", "♦️");
        ArrayList<String> number = new ArrayList<>();
        Collections.addAll(number, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
    }

    public PokerGame() {
        System.out.println(list);
        Collections.shuffle(list);
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入游玩人數(3人/4人):");
        int playerNum = sc.nextInt();
        if (playerNum == 3) {
            ThreePlayer();
        } else {
            FourPlayer();
        }
    }

    public static void ThreePlayer() {
        List<String> play1 = new ArrayList<>(list.subList(0, 17));
        List<String> play2 = new ArrayList<>(list.subList(17, 34));
        List<String> play3 = new ArrayList<>(list.subList(34, 51));
        List<String> bottomCard = new ArrayList<>(list.subList(51, 52));

        if (play1.contains("♣️3")) {
            play1.addAll(bottomCard);
        } else if (play2.contains("♣️3")) {
            play2.addAll(bottomCard);
        } else {
            play3.addAll(bottomCard);
        }
        System.out.println("玩家1 (" + play1.size() + " 張): " + play1);
        System.out.println("玩家2 (" + play2.size() + " 張): " + play2);
        System.out.println("玩家3 (" + play3.size() + " 張): " + play3);
        System.out.println("底牌: " + bottomCard);
    }

    public static void FourPlayer() {
        List<String> play1 = new ArrayList<>(list.subList(0, 13));
        List<String> play2 = new ArrayList<>(list.subList(13, 26));
        List<String> play3 = new ArrayList<>(list.subList(26, 39));
        List<String> play4 = new ArrayList<>(list.subList(39, 52));
        System.out.println("玩家1 (" + play1.size() + " 張): " + play1);
        System.out.println("玩家2 (" + play2.size() + " 張): " + play2);
        System.out.println("玩家3 (" + play3.size() + " 張): " + play3);
        System.out.println("玩家4 (" + play4.size() + " 張): " + play4);
    }
}
