import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class GridLayout_Cus extends JFrame {
    public GridLayout_Cus() {
        this.setTitle("ViDu Gridlayout");
        this.setSize(600, 400);
        // Căn giữa cử sổ chương trình
        this.setLocationRelativeTo(null);

        // Set layout
        GridLayout gridLayout1 = new GridLayout();
        GridLayout gridLayout2 = new GridLayout(4, 5);
        GridLayout gridLayout3 = new GridLayout(4, 5, 25, 25);
        this.setLayout(gridLayout3);

        // JButton button1 = new JButton("1");
        // JButton button2 = new JButton("2");
        // JButton button3 = new JButton("3");

        for (int i = 0; i < 21; i++) {
            JButton button = new JButton(i + "");
            this.add(button);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayout_Cus();
    }

}