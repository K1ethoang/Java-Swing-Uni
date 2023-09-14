package MouseEvent.view;

import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;

import MouseEvent.model.MouseModel;

public class MouseView extends JFrame {
    private MouseModel mouseModel;

    public MouseView() {
        this.mouseModel = new MouseModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Mouse");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
