package Color.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Color.view.MyColorView;

public class MyColorListener implements ActionListener {
    private MyColorView mcv;

    public MyColorListener(MyColorView mcv) {
        this.mcv = mcv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String ac = e.getActionCommand();

        switch (ac) {
            case "Red text":
                this.mcv.changeTextColor(Color.red);
                break;
            case "Blue text":
                this.mcv.changeTextColor(Color.blue);
                break;
            case "Green text":
                this.mcv.changeTextColor(Color.green);
                break;
            case "Red background":
                this.mcv.changeBackgroundColor(Color.red);
                break;
            case "Blue background":
                this.mcv.changeBackgroundColor(Color.blue);
                break;
            case "Green background":
                this.mcv.changeBackgroundColor(Color.green);
                break;

            default:
                break;
        }
    }

}
