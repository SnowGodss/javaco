package big.two;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Poker extends JLabel implements MouseListener {
    // 屬性
    // 1.牌的名字 格式：數字 - 數字
    private String name;
    // 2. 牌顯示的是正面是反面
    private Boolean up;
    // 3.是否可以被點擊(不能點別人的牌)
    private Boolean canClick = false;
    // 4.當前的狀態, 表是當前的牌是否已經是否已經被點擊
    // 如果是沒有被點擊的狀態, 此時點擊了, 會執行彈起的狀態
    // 如果是已經被點擊的狀態, 此時點擊了, 會執行放下的狀態
    private Boolean clicked = false;
    private Point location;

    public Poker(String name, Boolean up) {
        this.name = name;
        this.up = up;

        // 判斷當前的牌面是正面還是反面
        if (up) {
            // 顯示正面
            turnFront();
        } else {
            // 顯示反面
            turnBack();
        }

        // 設置牌的寬高
        this.setSize(71, 96);
        // 把牌顯示出來
        this.setVisible(true);
        // 給每一張牌添加監聽
        this.addMouseListener(this);
    }

    // 顯示正面
    public void turnFront() {
        // 給牌設置正面
        this.setIcon(new ImageIcon("src/big/two/images/PokerCard/" + name + ".jpg"));
        // 修改成員變量(up變成是指牌的正反面)
        this.up = true;
    }

    // 顯示反面
    public void turnBack() {
        // 給牌設置反面
        this.setIcon(new ImageIcon("src/big/two/images/PokerCard/green_back.jpg"));
        // 修改成員變量(up變成是指牌的正反面)
        this.up = false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        // 判斷當前的牌是否可以被點擊
        if (canClick) {
            // 表示牌的位移像素
            int step = 0;
            // 判斷牌的狀態是升起還是放下
            if (clicked) {
                // 表是當前的牌已經被點擊
                // 將牌往下推
                step = 20;
            } else {
                // 表是當前的牌還沒有被點擊
                // 將牌往上推
                step = -20;
            }
            // 修改clicked變量記錄的值(把原本的值取反)
            // 例如：原本是升起的狀態，就變成了放下的狀態
            // 原本是放下的狀態，就變成了升起的狀態
            clicked = !clicked;
            // 修改一下牌的位置
            Point from = this.getLocation();
            // 創建一個Point的對象, 表是結束的位置
            Point to = new Point(from.x, from.y + step);
            // 使牌動到新位置
            this.setLocation(to);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUp() {
        return up;
    }

    public void setUp(Boolean up) {
        this.up = up;
    }

    public Boolean getCanClick() {
        return canClick;
    }

    public void setCanClick(Boolean canClick) {
        this.canClick = canClick;
    }

    public Boolean getClicked() {
        return clicked;
    }

    public void setClicked(Boolean clicked) {
        this.clicked = clicked;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

}
