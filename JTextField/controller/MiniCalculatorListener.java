package JTextField.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import JTextField.view.MiniCalculatorView;

public class MiniCalculatorListener implements ActionListener {
    private MiniCalculatorView mcv;

    public MiniCalculatorListener(MiniCalculatorView mcv) {
        this.mcv = mcv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String ac = e.getActionCommand();

        switch (ac) {
            case "+":
                this.mcv.plus();
                break;
            case "-":
                this.mcv.minus();
                break;
            case "*":
                this.mcv.multiply();
                break;
            case "/":
                this.mcv.divide();
                break;
            case "^":
                this.mcv.pow();
                break;
            case "%":
                this.mcv.mod();
                break;
        }
    }

}
