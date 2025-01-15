package student.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ui extends JFrame implements ActionListener {
    JButton jtb1 = new JButton("帥爆了");
    JButton jtb2 = new JButton("一般般吧");
    JButton jtb3 = new JButton("不帥, 有點醜");
    JButton dadjtb = new JButton("爸爸, 饒了我吧");
    boolean flag = false;

    public Ui() {
        initJFrame();
        initView();
        this.setVisible(true);
    }

    private void initView() {
        this.getContentPane().removeAll();
        if (flag) {
            dadjtb.setBounds(350, 50, 100, 50);
            dadjtb.removeActionListener(this);
            dadjtb.addActionListener(this);
            this.getContentPane().add(dadjtb);
        }
        JLabel text = new JLabel("你覺得你自己帥嗎？");
        text.setBounds(350, 150, 200, 50);
        jtb1.setBounds(350, 200, 100, 50);
        jtb2.setBounds(350, 300, 100, 50);
        jtb3.setBounds(350, 400, 100, 50);
        jtb1.removeActionListener(this);
        jtb2.removeActionListener(this);
        jtb3.removeActionListener(this);
        jtb1.addActionListener(this);
        jtb2.addActionListener(this);
        jtb3.addActionListener(this);
        this.getContentPane().add(text);
        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);
        this.getContentPane().add(jtb3);
        this.getContentPane().repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == jtb1) {
            showDialog("自己心裡沒點數嗎？, 看來只能給你一點懲罰長長記性了");
            try {
                new ProcessBuilder("sudo", "shutdown", "-h", "+1").start();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            flag = true;
            initView();
        } else if (obj == jtb2) {
            showDialog("不你還是沒有點自知自明, 只能給你一點懲罰了");
            try {
                new ProcessBuilder("sudo", "shutdown", "-h", "+2").start();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            flag = true;
            initView();
        } else if (obj == jtb3) {
            showDialog("看來你有點自知之明, 但還是要給你一點懲罰");
            try {
                new ProcessBuilder("sudo", "shutdown", "-h", "+30").start();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            flag = true;
            initView();
        } else if (obj == dadjtb) {
            showDialog("XXX 這一次就饒了你吧");
            try {
                new ProcessBuilder("sudo", "pkill", "shutdown").start();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    private void initJFrame() {
        this.setSize(800, 600);
        this.setTitle("惡搞好基友");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    private void showDialog(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
}