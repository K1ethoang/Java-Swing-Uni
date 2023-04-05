package MVC.test;

import javax.swing.UIManager;

import MVC.view.CounterView;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        CounterView ctv = new CounterView();
    }
}
