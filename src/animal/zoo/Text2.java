package animal.zoo;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Text2 extends JFrame {

    private JButton button;

    public Text2() {
        // 创建按钮
        button = new JButton("Click");
        button.setBounds(150, 100, 100, 30);

        // ✅ 新写法：使用方法引用绑定事件
        button.addActionListener(this::onClick);

        // 添加按钮
        add(button);

        // 设置窗口
        setTitle("新方法示例");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // ✅ 定义方法（无需重写接口方法）
    private void onClick(ActionEvent e) {
        System.out.println("Button clicked (新方法)!");
    }

    public static void main(String[] args) {
        new Text2(); // 创建窗口
    }
}