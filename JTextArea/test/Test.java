package JTextArea.test;

import javax.swing.UIManager;

import JTextArea.view.SearchView;

public class Test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new SearchView();
    }
}
