package big.two;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
        // 介面顯示
        // 先展示介面在發牌, 因為發牌裡面有動畫, 介面不展示出來, 動畫無法展示
        this.setVisible(true);

        // 初始化牌
        // 準備牌, 洗牌, 發牌, 排序

        // 打牌之前的準備工作

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
        outCardBut.setVisible(false);
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
        passCardBut.setVisible(false);
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
            time[i].setVisible(false);
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
        dizhu.setVisible(false);
        // 設置位置
        dizhu.setSize(40, 40);
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
    // 初始化牌()

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
