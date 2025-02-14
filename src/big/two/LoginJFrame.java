package big.two;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginJFrame extends JFrame implements MouseListener {
    // 登入按鈕
    JButton login = new JButton();
    // 註冊按鈕
    JButton register = new JButton();
    // 驗證碼按鈕
    JButton codeButton = new JButton();
    // 用戶名輸入框(會顯示)
    JTextField username = new JTextField();
    // 密碼輸入框(不會顯示)
    JPasswordField userpassword = new JPasswordField();
    // 驗證碼輸入框
    JTextField code = new JTextField();
    // 正確的驗證碼
    JLabel rightCode = new JLabel();

    public LoginJFrame() {
        // 初始化介面
        initJFrame();
        // 初始化組建, 在這個介面添加內容
        initView();
        repaint();
    }

    public void initJFrame() {
        // 介面大小
        this.setSize(633, 423);
        // 介面標題
        this.setTitle("大老二遊戲 V1.0登入");
        // 顯示介面
        this.setVisible(true);
        // 設置界面置頂
        this.setAlwaysOnTop(true);
        // 設定關閉模式(一鍵全關)
        this.setDefaultCloseOperation(3);
    }

    public void initView() {
        // 1.添加用戶名文字
        // // 設定字體格式
        Font usernamefont = new Font(null, 1, 16);
        // // 創建字體
        JLabel usernameLabel = new JLabel("用戶名");
        // // 設置字體顏色
        usernameLabel.setForeground(Color.WHITE);
        // // 套上字體格式
        usernameLabel.setFont(usernamefont);
        // // 設置位置和大小
        usernameLabel.setBounds(200, 300, 55, 22);
        // // 獲取窗口並加入到窗口中
        this.getContentPane().add(usernameLabel);

        // 2. 添加用戶名輸入框
        // // 設置位置和大小
        username.setBounds(260, 298, 200, 30);
        // // 獲取窗口並加入到窗口中
        this.getContentPane().add(username);

        // 3. 添加密碼文字
        // // 設定字體格式
        Font passwordfont = new Font(null, 1, 16);
        // // 創建字體
        JLabel passwordLabel = new JLabel("密碼");
        // // 設置字體顏色
        passwordLabel.setForeground(Color.WHITE);
        // // 套上字體格式
        passwordLabel.setFont(passwordfont);
        // // 設置位置和大小
        passwordLabel.setBounds(210, 340, 55, 22);
        // // 獲取窗口並加入到窗口中
        this.getContentPane().add(passwordLabel);

        // 4. 添加碼輸入框
        // // 設置位置和大小
        userpassword.setBounds(260, 337, 200, 30);
        // // 獲取窗口並加入到窗口中
        this.getContentPane().add(userpassword);

        // 5. 添加驗證碼文字
        // // 設定字體格式
        Font codefont = new Font(null, 1, 16);
        // // 創建字體
        JLabel codeText = new JLabel("驗證碼");
        // // 設置字體顏色
        codeText.setForeground(Color.WHITE);
        // // 套上字體格式
        codeText.setFont(codefont);
        // // 設置位置和大小
        codeText.setBounds(540, 250, 55, 22);
        // // 獲取窗口並加入到窗口中
        this.getContentPane().add(codeText);

        // 6. 添加驗證碼輸入框
        // // 設置位置和大小
        code.setBounds(510, 280, 100, 30);
        // // 獲取窗口並加入到窗口中
        this.getContentPane().add(code);

        // 7. 創建一個工具類方法來獲取驗證碼
        String codeStr = CodeUtil.getCode();
        // 8. 添加正確驗證碼文字
        // // 設定字體格式
        Font rightCodefont = new Font(null, 1, 15);
        // // 設置字體顏色
        rightCode.setForeground(Color.RED);
        // // 套上字體格式
        rightCode.setFont(rightCodefont);
        // // 設置位置和大小
        rightCode.setBounds(535, 310, 100, 30);
        // // 設置內容
        rightCode.setText(codeStr);
        // // 綁定鼠標監控
        rightCode.addMouseListener(this);
        // // 獲取窗口並加入到窗口中
        this.getContentPane().add(rightCode);

        // 9.創建正確驗證碼刷新按鈕
        codeButton.setText("🔃");
        codeButton.setBounds(510, 315, 20, 20);
        // // 綁定鼠標監控
        codeButton.addMouseListener(this);
        this.getContentPane().add(codeButton);

        // 10. 創建登入按鈕
        login.setText("登入");
        login.setBounds(100, 290, 80, 40);
        // 綁定鼠標監控
        login.addMouseListener(this);
        // 獲取窗口並加入到窗口中
        this.getContentPane().add(login);

        // 11. 創建註冊按鈕
        register.setText("註冊");
        register.setBounds(100, 335, 80, 40);
        // 綁定鼠標監控
        register.addMouseListener(this);
        // 獲取窗口並加入到窗口中
        this.getContentPane().add(register);

        // 12.添加背景圖片
        JLabel background = new JLabel(new ImageIcon("src/big/two/images/BigTwobackground.png"));
        background.setBounds(0, 0, 633, 423);
        this.getContentPane().add(background);
    }

    // 滑鼠點擊
    @Override
    public void mouseClicked(MouseEvent e) {
        // 獲取觸發事件的物件
        Object obj = e.getSource();
        // 如果觸發事件的物件是登入按鈕
        if (obj == login) {
            // 獲取用戶名和密碼兩個文本輸入的內容
            String usernameInput = username.getText();
            String passwordInput = userpassword.getText();

            // 獲取用戶的驗證碼
            // 判斷驗證碼是否為空
            // 判斷用戶名和密碼是否為空
            // 判斷驗證碼是否正確
            // 把用戶名和密碼幫裝成一個對象, 然後直接判斷這個對象有沒有在集合當中, 有的話就登錄成功, 反之就登錄失敗
        } else if (obj == register) {
            System.out.println("點擊了註冊按鈕");
        } else if (obj == codeButton) {
            String codeStr = CodeUtil.getCode();
            rightCode.setText(codeStr);
        }
    }

    // 滑鼠按下
    @Override
    public void mousePressed(MouseEvent e) {
        // Handle mouse press event
    }

    // 滑鼠放開
    @Override
    public void mouseReleased(MouseEvent e) {
        // Handle mouse release event
    }

    // 鼠標停在按鈕上
    @Override
    public void mouseEntered(MouseEvent e) {
        // Handle mouse enter event
    }

    // 鼠標離開按鈕上
    @Override
    public void mouseExited(MouseEvent e) {
        // Handle mouse exit event
    }

    // 創建彈框方法
    public void showJDialog(String content) {
        JOptionPane.showMessageDialog(this, content);
    }
}
