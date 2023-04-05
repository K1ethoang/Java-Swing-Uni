import javax.swing.JFrame;

public class Learn {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        // Gán tên
        frame.setTitle("Java swing");

        // Gán kích cỡ
        frame.setSize(400, 500);

        // Thoát khỏi chương trình khi đóng cửa sổ JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);

        // Gán vị trí hiển thị (width, height)
        frame.setLocation(300, 200);

        // Cho phép hiển thị
        frame.setVisible(true);
    }
}
