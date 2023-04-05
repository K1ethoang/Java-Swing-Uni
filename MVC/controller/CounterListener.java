package MVC.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import MVC.view.CounterView;

public class CounterListener implements ActionListener {
    private CounterView ctv;

    public CounterListener(CounterView ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println("Ban da nhan nut");
        String ac = e.getActionCommand();
        // System.out.println("Ban da nhan nut" + " : " + ac);
        switch (ac) {
            case "UP":
                this.ctv.increment();
                break;
            case "DOWN":
                this.ctv.decrement();
                break;
            case "RESET":
                this.ctv.reset();
                break;

            default:
                break;
        }
    }

}