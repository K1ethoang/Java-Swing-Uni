package MVC.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import MVC.controller.CounterListener;
import MVC.model.CounterModel;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton button_up;
    private JButton button_down;
    private JButton button_reset;
    private JLabel label_value;

    public CounterView() {
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Counter");

        this.setSize(200, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new CounterListener(this);

        button_up = new JButton("UP");
        button_up.addActionListener(ac);

        button_down = new JButton("DOWN");
        button_down.addActionListener(ac);

        button_reset = new JButton("RESET");
        button_reset.addActionListener(ac);

        label_value = new JLabel(this.counterModel.getValue() + "", label_value.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(button_up, BorderLayout.WEST);
        panel.add(label_value, BorderLayout.CENTER);
        panel.add(button_down, BorderLayout.EAST);
        panel.add(button_reset, BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
    }

    public void increment() {
        this.counterModel.increment();
        this.label_value.setText(this.counterModel.getValue() + "");
    }

    public void decrement() {
        this.counterModel.decrement();
        this.label_value.setText(this.counterModel.getValue() + "");
    }

    public void reset() {
        this.counterModel.reset();
        this.label_value.setText(this.counterModel.getValue() + "");
    }

}
