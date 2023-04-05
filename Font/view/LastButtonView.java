package Font.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Font.controller.LastButtonListener;
import Font.model.LastButtonModel;

public class LastButtonView extends JFrame {
    private LastButtonModel lastButtonModel;
    private JLabel label;

    public LastButtonView() {
        this.lastButtonModel = new LastButtonModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Last button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);

        ActionListener ac = new LastButtonListener(this);

        JPanel panel_center = new JPanel();
        panel_center.setLayout(new GridLayout(2, 2));

        // Tao font chu
        Font font = new Font("Arial", Font.PLAIN, 16);

        JButton button_1 = new JButton("1");
        // Gan font chu
        button_1.setFont(font);
        button_1.addActionListener(ac);
        JButton button_2 = new JButton("2");
        button_2.setFont(font);
        button_2.addActionListener(ac);
        JButton button_3 = new JButton("3");
        button_3.setFont(font);
        button_3.addActionListener(ac);
        JButton button_4 = new JButton("4");
        button_4.setFont(font);
        button_4.addActionListener(ac);

        panel_center.add(button_1);
        panel_center.add(button_2);
        panel_center.add(button_3);
        panel_center.add(button_4);

        JPanel panel_footer = new JPanel();
        label = new JLabel("---------");
        label.setFont(new Font("Arial", Font.ITALIC, 20));
        panel_footer.add(label);

        this.setLayout(new BorderLayout());
        this.add(panel_center, BorderLayout.CENTER);
        this.add(panel_footer, BorderLayout.SOUTH);
    }

    public void changeTo_1() {
        this.lastButtonModel.setValue_1();
        this.label.setText("Last button: " + this.lastButtonModel.getValue());
    }

    public void changeTo_2() {
        this.lastButtonModel.setValue_2();
        this.label.setText("Last button: " + this.lastButtonModel.getValue());
    }

    public void changeTo_3() {
        this.lastButtonModel.setValue_3();
        this.label.setText("Last button: " + this.lastButtonModel.getValue());
    }

    public void changeTo_4() {
        this.lastButtonModel.setValue_4();
        this.label.setText("Last button: " + this.lastButtonModel.getValue());
    }

}
