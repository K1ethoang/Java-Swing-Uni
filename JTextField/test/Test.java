package JTextField.test;

import javax.swing.UIManager;

import JTextField.view.MiniCalculatorView;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new MiniCalculatorView();
    }
}
