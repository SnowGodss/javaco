package student.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ui extends JFrame implements ActionListener {
    // 创建四个按钮组件
    JButton jtb1 = new JButton("帥爆了");
    JButton jtb2 = new JButton("一般般吧");
    JButton jtb3 = new JButton("不帥, 有點醜");
    JButton dadjtb = new JButton("爸爸, 饒了我吧");

    // 标记是否需要显示“饶了我吧”按钮
    boolean flag = false;

    public Ui() {
        // 初始化窗口框架
        initJFrame();
        
        // 初始化界面内容
        initView();

        // 设置窗口可见
        this.setVisible(true);
    }

    private void initView() {
        // 清除所有内容
        this.getContentPane().removeAll();

        // 如果 flag 为 true，显示“爸爸, 饶了我吧”按钮
        if (flag) {
            dadjtb.setBounds(350, 50, 100, 50);
            dadjtb.removeActionListener(this);  // 清除现有的监听器，防止重复绑定
            dadjtb.addActionListener(this);
            this.getContentPane().add(dadjtb);
        }

        // 创建标签，用于显示问题
        JLabel text = new JLabel("你覺得你自己帥嗎？");
        text.setBounds(350, 150, 200, 50);

        // 设置三个选择按钮的位置
        jtb1.setBounds(350, 200, 100, 50);
        jtb2.setBounds(350, 300, 100, 50);
        jtb3.setBounds(350, 400, 100, 50);

        // 移除已有的监听器，防止多次绑定
        jtb1.removeActionListener(this);
        jtb2.removeActionListener(this);
        jtb3.removeActionListener(this);

        // 为三个按钮绑定点击事件监听器
        jtb1.addActionListener(this);
        jtb2.addActionListener(this);
        jtb3.addActionListener(this);

        // 将标签和按钮添加到窗口中
        this.getContentPane().add(text);
        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);
        this.getContentPane().add(jtb3);

        // 重新绘制内容
        this.getContentPane().repaint();
    }

    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        // 处理“帥爆了”按钮的点击事件
        if (obj == jtb1) {
            showDialog("自己心裡沒點數嗎？, 看來只能給你一點懲罰長長記性了");
            try {
                // 执行关机命令，设置关机时间为1分钟后
                Runtime.getRuntime().exec("sudo shutdown -h +1");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            flag = true;  // 标记 flag 为 true，以便显示“饶了我吧”按钮
            initView();   // 更新视图

        // 处理“一般般吧”按钮的点击事件
        } else if (obj == jtb2) {
            showDialog("不你還是沒有點自知自明, 只能給你一點懲罰了");
            try {
                // 执行关机命令，设置关机时间为2分钟后
                Runtime.getRuntime().exec("sudo shutdown -h +2");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            flag = true;
            initView();

        // 处理“不帥, 有點醜”按钮的点击事件
        } else if (obj == jtb3) {
            showDialog("看來你有點自知之明, 但還是要給你一點懲罰");
            try {
                // 执行关机命令，设置关机时间为30分钟后
                Runtime.getRuntime().exec("sudo shutdown -h +30");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            flag = true;
            initView();

        // 处理“爸爸, 饶了我吧”按钮的点击事件
        } else if (obj == dadjtb) {
            showDialog("XXX 這一次就饒了你吧");
            try {
                // 取消关机命令
                Runtime.getRuntime().exec("sudo pkill shutdown");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    private void initJFrame() {
        // 设置窗口大小和属性
        this.setSize(800, 600);
        this.setTitle("惡搞好基友");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    // 显示弹框提示信息
    private void showDialog(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
}