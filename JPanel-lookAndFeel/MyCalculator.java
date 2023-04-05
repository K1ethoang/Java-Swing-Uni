import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame {
    public MyCalculator() {
        this.setTitle("My Calcualtor");

        this.setSize(300, 300);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(50);
        JPanel panel_head = new JPanel();
        panel_head.setLayout(new BorderLayout());
        panel_head.add(textField, BorderLayout.CENTER);

        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonAdd = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonMulti = new JButton("*");
        JButton buttonDiv = new JButton("/");
        JButton buttonEqual = new JButton("=");
        JPanel panel_button = new JPanel();
        panel_button.setLayout(new GridLayout(5, 3));
        panel_button.add(button0);
        panel_button.add(button1);
        panel_button.add(button2);
        panel_button.add(button3);
        panel_button.add(button4);
        panel_button.add(button5);
        panel_button.add(button6);
        panel_button.add(button7);
        panel_button.add(button8);
        panel_button.add(button9);
        panel_button.add(buttonAdd);
        panel_button.add(buttonMinus);
        panel_button.add(buttonMulti);
        panel_button.add(buttonDiv);
        panel_button.add(buttonEqual);

        this.setLayout(new BorderLayout());
        this.add(panel_head, BorderLayout.NORTH);
        this.add(panel_button, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        // su dung look and feel mac dinh cua he thong
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new MyCalculator();
    }
}
