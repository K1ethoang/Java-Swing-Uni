import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class BorderLayout_Cus extends JFrame {
    public BorderLayout_Cus() {
        this.setTitle("ViDu Borderlayout");
        this.setSize(600, 400);
        // Căn giữa cử sổ chương trình
        this.setLocationRelativeTo(null);

        // Set layout
        BorderLayout BorderLayout1 = new BorderLayout();
        BorderLayout BorderLayout2 = new BorderLayout(50, 50);

        this.setLayout(BorderLayout2);

        JButton button1 = new JButton("NORTH");
        JButton button2 = new JButton("SOUTH");
        JButton button3 = new JButton("EAST");
        JButton button4 = new JButton("WEST");
        JButton button5 = new JButton("CENTER");

        // Add thành phần
        this.add(button1, BorderLayout.NORTH);
        this.add(button2, BorderLayout.SOUTH);
        this.add(button3, BorderLayout.EAST);
        this.add(button4, BorderLayout.WEST);
        this.add(button5, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayout_Cus();
    }

}