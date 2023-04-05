package Color.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Color.controller.MyColorListener;
import Color.model.MyColorModel;
import Font.controller.LastButtonListener;

public class MyColorView extends JFrame {
    private MyColorModel mcm;
    private JLabel label;

    public MyColorView() {
        this.mcm = new MyColorModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("My color");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new MyColorListener(this);

        label = new JLabel("K1ethoang");
        label.setFont(new Font("Arial", Font.ITALIC, 50));
        label.setOpaque(true);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3));

        Font font = new Font("Arial", Font.BOLD, 16);

        // mau chu
        JButton button_text_red = new JButton("Red text");
        button_text_red.setFont(font);
        button_text_red.setForeground(Color.red);
        button_text_red.addActionListener(ac);

        JButton button_text_blue = new JButton("Blue text");
        button_text_blue.setFont(font);
        button_text_blue.setForeground(Color.blue);
        button_text_blue.addActionListener(ac);

        JButton button_text_green = new JButton("Green text");
        button_text_green.setFont(font);
        button_text_green.setForeground(Color.green);
        button_text_green.addActionListener(ac);

        // mau nen
        JButton button_background_red = new JButton("Red background");
        button_background_red.setFont(font);
        button_background_red.setBackground(Color.red);
        button_background_red.addActionListener(ac);

        JButton button_background_blue = new JButton("Blue background");
        button_background_blue.setFont(font);
        button_background_blue.setBackground(Color.blue);
        button_background_blue.addActionListener(ac);

        JButton button_background_green = new JButton("Green background");
        button_background_green.setFont(font);
        button_background_green.setBackground(Color.green);
        button_background_green.addActionListener(ac);

        panel.add(button_text_red);
        panel.add(button_text_blue);
        panel.add(button_text_green);
        panel.add(button_background_red);
        panel.add(button_background_blue);
        panel.add(button_background_green);

        this.setLayout(new BorderLayout());
        this.add(label, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
    }

    public void changeTextColor(Color c) {
        this.label.setForeground(c);
    }

    public void changeBackgroundColor(Color c) {
        this.label.setBackground(c);
    }
}
