import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        // Set frame properties
        setBounds(300, 100, 400, 200);
        setTitle("My JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Set icon
        ImageIcon icon = new ImageIcon("icon.png"); // Ensure correct path
        setIconImage(icon.getImage());

        // Set background color
        getContentPane().setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyFrame frame = new MyFrame();
            frame.setVisible(true);
        });
    }
}
