package Color.model;

import java.awt.Color;
import java.io.ObjectInputStream.GetField;

public class MyColorModel {
    private Color foreground;
    private Color background;
    private boolean isOpaque;

    public MyColorModel() {
        this.foreground = Color.black;
        this.background = Color.white;
        this.isOpaque = true;
    }

    public Color getForeground() {
        return foreground;
    }

    public Color getBackground() {
        return background;
    }

    public boolean getIsOpaque() {
        return isOpaque;
    }

    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public void setOpaque(boolean isOpaque) {
        this.isOpaque = isOpaque;
    }

}
