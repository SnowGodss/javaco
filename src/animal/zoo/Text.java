package animal.zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Text extends JFrame implements ActionListener {

    private JButton button;

    public Text() {
        // 创建按钮
        button = new JButton("Click");
        button.setBounds(150, 100, 100, 30);

        // ✅ 旧写法：使用 this 绑定事件监听器
        button.addActionListener(this);

        // 添加按钮
        add(button);

        // 设置窗口
        setTitle("旧方法示例");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // ✅ 必须重写 ActionListener 的方法
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button clicked (旧方法)!");
        }
    }

    public static void main(String[] args) {
        new Text(); // 创建窗口
    }
}