package JScrollPane.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import JTextArea.controller.SearchListener;
import JTextArea.model.SearchModel;

public class SearchView extends JFrame {
    private SearchModel searchModel;
    private JTextArea textArea_text;
    private JTextField textField_keyword;
    private JLabel label_result;

    public SearchView() throws HeadlessException {
        this.searchModel = new SearchModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Search");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 20);

        JLabel label_text = new JLabel("Text input");
        label_text.setFont(font);
        textArea_text = new JTextArea(100, 100);
        textArea_text.setFont(font);

        JPanel panel_center = new JPanel();
        panel_center.setLayout(new GridLayout(2, 1));
        panel_center.add(label_text);
        panel_center.add(textArea_text);

        // JScrollPane -> khong hien thi duoc
        JScrollPane scrollPane = new JScrollPane(textArea_text, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // FOOTER
        ActionListener ac = new SearchListener(this);

        JLabel label_keyword = new JLabel("Keyword");
        label_keyword.setFont(font);
        textField_keyword = new JTextField();
        textField_keyword.setFont(font);

        label_result = new JLabel();
        label_result.setFont(font);
        label_result.setForeground(Color.red);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setFont(font);
        btnSubmit.addActionListener(ac);
        btnSubmit.setOpaque(true);
        btnSubmit.setBorderPainted(false);
        btnSubmit.setForeground(Color.white);
        btnSubmit.setBackground(Color.blue);

        JPanel panel_footer = new JPanel();
        panel_footer.setLayout(new GridLayout(2, 2));
        panel_footer.add(label_keyword);
        panel_footer.add(textField_keyword);
        panel_footer.add(btnSubmit);
        panel_footer.add(label_result);

        this.setLayout(new BorderLayout());
        this.add(label_text, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(panel_footer, BorderLayout.SOUTH);
    }

    public void search() {
        this.searchModel.setText(textArea_text.getText());
        this.searchModel.setKeyword(textField_keyword.getText());
        this.searchModel.search();
        this.label_result.setText(this.searchModel.getResult());
    }

}
