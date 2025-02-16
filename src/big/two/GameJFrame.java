package big.two;

import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameJFrame extends JFrame implements ActionListener {
    // 獲取介面的隱藏容器, 達到統一獲取, 後面就可以直接用了
    public static Container container = null;
    // 管理出牌和Pass兩個按鈕
    JButton[] publishCard = new JButton[2];
    // 遊戲介面中大老二的圖標
    JLabel dizhu;

    // 集合嵌套集合
    // 大集合中有三個小集合
    // 小集合中裝著每一個玩家當前要出的牌
    // 0索引: 左邊的電腦玩家
    // 1索引: 中間的自己
    // 2索引: 右邊的電腦玩家
    ArrayList<ArrayList<Poker>> currentList = new ArrayList<>();

    // 集合嵌套集合
    // 大集合中有三個小集合
    // 小集合中裝著每一個玩家手上的牌
    // 0索引: 左邊的電腦玩家
    // 1索引: 中間的自己
    // 2索引: 右邊的電腦玩家
    ArrayList<ArrayList<Poker>> playerList = new ArrayList<>();

    // 底牌
    ArrayList<Poker> lordList = new ArrayList<>();
    // 牌盒, 用來裝所有的牌
    ArrayList<Poker> pokerList = new ArrayList<>();

    // 三個玩家的文本提示(時間倒數)
    // 0索引, 左邊的電腦玩家
    // 1索引, 中間的自己
    // 2索引, 右邊的電腦玩家
    JTextField time[] = new JTextField[3];

    public GameJFrame() {
        // 設置任務欄的圖標(視窗左邊的LOGO)
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/big/two/images/LOGO.png"));
        // 設置界面
        initJFrame();
        // 添加組件
        initView();
        repaint();
        // 介面顯示
        // 先展示介面在發牌, 因為發牌裡面有動畫, 介面不展示出來, 動畫無法展示
        this.setVisible(true);

        // 初始化牌
        // 準備牌, 洗牌, 發牌, 排序
        initCard();
    }

    // 添加組件
    public void initView() {
        // 1.創建出牌的按鈕
        // //創建出牌的按鈕
        JButton outCardBut = new JButton("出牌");
        // //設置位置
        outCardBut.setBounds(320, 400, 60, 20);
        // //添加點擊事件
        outCardBut.addActionListener(this);
        // //設置隱藏
        outCardBut.setVisible(true);
        // //添加到數組當中統一管理
        publishCard[0] = outCardBut;
        // //添加到介面當中
        container.add(outCardBut);

        // 2.創建Pass的按鈕
        // //創建出牌的按鈕
        JButton passCardBut = new JButton("Pass");
        // //設置位置
        passCardBut.setBounds(420, 400, 75, 20);
        // //添加點擊事件
        passCardBut.addActionListener(this);
        // //設置隱藏
        passCardBut.setVisible(true);
        // //添加到數組當中統一管理
        publishCard[1] = passCardBut;
        // //添加到介面當中
        container.add(passCardBut);

        // 3.創建三個玩家前方的提示文本: 倒計時
        // 每一個玩家一個
        // 左邊的電腦玩家是0
        // 中間的是自己1
        // 右邊的玩家是2
        for (int i = 0; i < 3; i++) {
            // 圖示
            time[i] = new JTextField("倒計時：");
            // 不可點擊
            time[i].setEditable(false);
            // 隱藏
            time[i].setVisible(true);
            container.add(time[i]);
        }
        // 設置位置寬高
        time[0].setBounds(140, 230, 60, 20);
        time[1].setBounds(374, 360, 60, 20);
        time[2].setBounds(620, 230, 60, 20);

        // 創建地主圖標
        dizhu = new JLabel();
        // 設置圖片
        dizhu.setIcon(new ImageIcon("src/big/two/images/LOGO.png"));
        // 設置隱藏
        dizhu.setVisible(true);
        // 設置位置
        dizhu.setBounds(250, 370, 40, 40);
        // 加入到介面當中
        container.add(dizhu);
    }

    // 設置界面
    public void initJFrame() {
        // 設置標題
        this.setTitle("大老二遊戲");
        // 介面大小
        this.setSize(830, 620);
        // 設置關閉模式
        this.setDefaultCloseOperation(3);
        // 設置窗口無法進行調節
        this.setResizable(false);
        // 介面居中
        this.setLocationRelativeTo(null);
        // 獲取介面的隱藏容器, 以後直接用無需再次調用方法
        container = this.getContentPane();
        // 取消內部默認的居中
        container.setLayout(null);
        // 設置背景顏色
        container.setBackground(Color.LIGHT_GRAY);
    }

    // 初始化牌(準備牌, 洗牌, 發牌, 排序)
    public void initCard() {
        // 準備牌
        // 把所有的牌加入到, pokerList中
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Poker poker = new Poker(i + "-" + j, false);
                pokerList.add(poker);
                container.add(poker);
            }
        }
        // 洗牌
        Collections.shuffle(pokerList);

        // 準備三個玩家集合, 並把三個小集合放到大集合中方便管理
        ArrayList<Poker> pleyer0 = new ArrayList<>();
        ArrayList<Poker> pleyer1 = new ArrayList<>();
        ArrayList<Poker> pleyer2 = new ArrayList<>();

        // 發牌
        for (int i = 0; i < pokerList.size(); i++) {
            Poker poker = pokerList.get(i);
            if (i == pokerList.size()) {
                lordList.add(poker);
            }
            if (i % 3 == 0) {
                Common.move(poker, poker.getLocation(), new Point(50, 60 + i * 5));
                pleyer0.add(poker);
            } else if (i % 3 == 1) {
                Common.move(poker, poker.getLocation(), new Point(180 + i * 7, 450));
                pleyer1.add(poker);
            } else {
                Common.move(poker, poker.getLocation(), new Point(700, 60 + i * 5));
                pleyer2.add(poker);
            }
            playerList.add(pleyer0);
            playerList.add(pleyer1);
            playerList.add(pleyer2);

            container.setComponentZOrder(poker, 0);
        }

        // 排序
        for (int i = 0; i < 3; i++) {
            order(playerList.get(i));
            Common.rePosition(this, playerList.get(i), i);
        }
    }

    public void order(ArrayList<Poker> list) {
        Collections.sort(list, new Comparator<Poker>() {
            @Override
            public int compare(Poker o1, Poker o2) {
                // TODO Auto-generated method stub
                int color1 = Integer.parseInt(o1.getName().substring(0, 1));
                int value1 = getValue(o1);

                int color2 = Integer.parseInt(o2.getName().substring(0, 1));
                int value2 = getValue(o2);

                int flag = value1 - value2;

                if (flag == 0) {
                    return color1 - color2;
                } else {
                    return flag;
                }
            }
        });
    }

    public int getValue(Poker poker) {
        String name = poker.getName();

        int value = Integer.parseInt(name.substring(2));

        if (value == 1) {
            return value += 13;
        }
        if (value == 2) {
            return value += 13;
        }
        return value;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object obj = e.getSource();
        if (obj == publishCard[0]) {
            // 表是出牌的按鈕被點擊
            // 呼叫出牌的方法
            // outCard();
            System.out.println("出牌");
        } else if (obj == publishCard[1]) {
            // 表是過牌的按鈕被點擊
            // 呼叫過牌的方法
            // passCard();
            System.out.println("過牌");
        }
    }
}