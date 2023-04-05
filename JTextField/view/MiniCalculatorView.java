package JTextField.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import JTextField.controller.MiniCalculatorListener;
import JTextField.model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {
    private MiniCalculatorModel miniCalculatorModel;
    private JTextField textField_firstValue;
    private JTextField textField_secondValue;
    private JTextField textField_answer;

    public MiniCalculatorView() {
        this.miniCalculatorModel = new MiniCalculatorModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Mini Calculator");
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new MiniCalculatorListener(this);

        Font font = new Font("Arial", Font.BOLD, 20);
        JLabel label_firstValue = new JLabel("1st value");
        label_firstValue.setFont(font);
        JLabel label_secondValue = new JLabel("2st value");
        label_secondValue.setFont(font);
        JLabel label_answer = new JLabel("Answer");
        label_answer.setFont(font);

        textField_firstValue = new JTextField(50);
        textField_firstValue.setFont(font);
        textField_secondValue = new JTextField(50);
        textField_secondValue.setFont(font);
        textField_answer = new JTextField(50);
        textField_answer.setFont(font);

        JPanel panelIO = new JPanel();
        panelIO.setLayout(new GridLayout(3, 2, 10, 10));

        panelIO.add(label_firstValue);
        panelIO.add(textField_firstValue);
        panelIO.add(label_secondValue);
        panelIO.add(textField_secondValue);
        panelIO.add(label_answer);
        panelIO.add(textField_answer);

        JButton button_plus = new JButton("+");
        button_plus.setFont(font);
        button_plus.addActionListener(ac);
        JButton button_minus = new JButton("-");
        button_minus.setFont(font);
        button_minus.addActionListener(ac);
        JButton button_multiply = new JButton("*");
        button_multiply.setFont(font);
        button_multiply.addActionListener(ac);
        JButton button_divide = new JButton("/");
        button_divide.setFont(font);
        button_divide.addActionListener(ac);
        JButton button_pow = new JButton("^");
        button_pow.setFont(font);
        button_pow.addActionListener(ac);
        JButton button_mod = new JButton("%");
        button_mod.setFont(font);
        button_mod.addActionListener(ac);

        JPanel panelBtn = new JPanel();
        panelBtn.setLayout(new GridLayout(2, 3, 2, 2));

        panelBtn.add(button_plus);
        panelBtn.add(button_minus);
        panelBtn.add(button_multiply);
        panelBtn.add(button_divide);
        panelBtn.add(button_pow);
        panelBtn.add(button_mod);

        this.setLayout(new BorderLayout(10, 10));
        this.add(panelIO, BorderLayout.CENTER);
        this.add(panelBtn, BorderLayout.SOUTH);
    }

    private double getFirstValue() {
        return Double.valueOf(this.textField_firstValue.getText());
    }

    private double getSecondValue() {
        return Double.valueOf(this.textField_secondValue.getText());
    }

    public void plus() {
        this.miniCalculatorModel.setFirstValue(this.getFirstValue());
        this.miniCalculatorModel.setSecondValue(this.getSecondValue());
        this.miniCalculatorModel.plus();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void minus() {
        this.miniCalculatorModel.setFirstValue(this.getFirstValue());
        this.miniCalculatorModel.setSecondValue(this.getSecondValue());
        this.miniCalculatorModel.minus();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void multiply() {
        this.miniCalculatorModel.setFirstValue(this.getFirstValue());
        this.miniCalculatorModel.setSecondValue(this.getSecondValue());
        this.miniCalculatorModel.multiply();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void divide() {
        this.miniCalculatorModel.setFirstValue(this.getFirstValue());
        this.miniCalculatorModel.setSecondValue(this.getSecondValue());
        this.miniCalculatorModel.divide();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void pow() {
        this.miniCalculatorModel.setFirstValue(this.getFirstValue());
        this.miniCalculatorModel.setSecondValue(this.getSecondValue());
        this.miniCalculatorModel.power();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void mod() {
        this.miniCalculatorModel.setFirstValue(this.getFirstValue());
        this.miniCalculatorModel.setSecondValue(this.getSecondValue());
        this.miniCalculatorModel.mod();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
}
