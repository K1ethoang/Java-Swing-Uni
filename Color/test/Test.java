package Color.test;

import javax.swing.UIManager;

import Color.view.MyColorView;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        } catch (Exception e) {
            e.printStackTrace();
        }
        MyColorView mcv = new MyColorView();
    }
}
