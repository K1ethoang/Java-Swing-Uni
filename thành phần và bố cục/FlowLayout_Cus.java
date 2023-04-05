import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayout_Cus extends JFrame {
    public FlowLayout_Cus() {
        this.setTitle("ViDu FlowLayout");
        this.setSize(600, 400);
        // Căn giữa cử sổ chương trình
        this.setLocationRelativeTo(null);

        // Set layout
        FlowLayout flowLayout1 = new FlowLayout();
        FlowLayout flowLayout2 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout3 = new FlowLayout(FlowLayout.CENTER, 50, 50);
        // this.setLayout(flowLayout1);
        // this.setLayout(flowLayout2);
        this.setLayout(flowLayout3);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");

        // Add thành phần
        this.add(button1);
        this.add(button2);
        this.add(button3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayout_Cus();
    }

}