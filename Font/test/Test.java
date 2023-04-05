package Font.test;

import javax.swing.UIManager;

import Font.view.LastButtonView;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        LastButtonView lbv = new LastButtonView();
    }
}
