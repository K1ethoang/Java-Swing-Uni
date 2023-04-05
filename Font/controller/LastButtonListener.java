package Font.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Font.view.LastButtonView;

public class LastButtonListener implements ActionListener {
    private LastButtonView lbv;

    public LastButtonListener(LastButtonView lbv) {
        this.lbv = lbv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String ac = e.getActionCommand();
        switch (ac) {
            case "1":
                this.lbv.changeTo_1();
                break;
            case "2":
                this.lbv.changeTo_2();
                break;
            case "3":
                this.lbv.changeTo_3();
                break;
            case "4":
                this.lbv.changeTo_4();
                break;
        }
    }

}
