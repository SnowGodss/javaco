package big.two;

import java.awt.Point;
import java.util.ArrayList;

public class Common {
    // 此類為尚未學習部分, 所以以下部分為拷貝過來的尚未自己寫
    // 移動牌(有移動的動畫效果)
    public static void move(Poker poker, Point from, Point to) {
        if (from == null) {
            from = new Point(0, 0); // 🛠️ 默认从 (0,0) 开始
        }
        if (to.x != from.x) {
            double k = (1.0) * (to.y - from.y) / (to.x - from.x);
            double b = to.y - to.x * k;
            int flag = 0;
            if (from.x < to.x) {
                flag = 20;
            } else {
                flag = -20;
            }
            for (int i = from.x; Math.abs(i - to.x) > 20; i += flag) {
                double y = k * i + b;
                poker.setLocation(i, (int) y);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        poker.setLocation(to);
    }

    // 重新擺放牌
    // 參數一：遊戲介面
    // 參數二：要重新擺放順序的集合
    // 參數三：標記
    // // 0表示左邊玩家 1表示自己 2表示右邊玩家
    public static void rePosition(GameJFrame m, ArrayList<Poker> list, int flag) {
        Point p = new Point();
        if (flag == 0) {
            p.x = 50;
            p.y = (450 / 2) - (list.size() + 1) * 15 / 2;
        }
        if (flag == 1) {
            p.x = (800 / 2) - (list.size() + 1) * 21 / 2;
            p.y = 450;
        }
        if (flag == 2) {
            p.x = 700;
            p.y = (450 / 2) - (list.size() + 1) * 15 / 2;
        }
        int len = list.size();
        for (int i = 0; i < len; i++) {
            Poker poker = list.get(i);
            move(poker, poker.getLocation(), p);
            m.container.setComponentZOrder(poker, 0);
            if (flag == 1) {
                p.x += 21;
            } else {
                p.y += 15;
            }
        }
    }
}