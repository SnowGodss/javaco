package inherit.son;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TestSwing extends JFrame implements ActionListener {
    JButton button = new JButton("Click me");

    public TestSwing() {
        button.addActionListener(this);
        this.add(button);
        this.setSize(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TestSwing frame = new TestSwing();
                frame.setVisible(true);
            }
        });
    }
}