import javax.swing.*;
import java.awt.*;

class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // Creating a JFrame window

        frame.setBounds(300, 100, 400, 200); // Set position and size
        frame.setTitle("My JFrame"); // Set title

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        frame.setVisible(true); // Make the frame visible
        frame.setResizable(false); // Prevent resizing

        // Load icon safely
        ImageIcon icon = new ImageIcon("icon.png"); // Ensure correct path
        frame.setIconImage(icon.getImage());

        Container c= frame.getContentPane();
        c.setBackground(Color.Blue);
    }
}
