package JScrollPane.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import JTextArea.view.SearchView;

public class SearchListener implements ActionListener {
    private SearchView searchView;

    public SearchListener(SearchView searchView) {
        this.searchView = searchView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.searchView.search();
    }

}
