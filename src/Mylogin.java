import javax.swing.*;
import java.awt.*;

class MyLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form"); // Set title
        frame.setBounds(200, 200, 300, 200); // Set position and size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        frame.setLayout(null); // Disable layout manager (absolute positioning)

        // Header Label
        JLabel header = new JLabel("Login Form", SwingConstants.CENTER);
        header.setBounds(50, 10, 200, 30);
        Font headerFont = new Font("Arial", Font.BOLD, 16);
        header.setFont(headerFont);
        frame.add(header);

        // Email Label
        JLabel email = new JLabel("Email:");
        email.setBounds(20, 50, 100, 30);
        frame.add(email);

        // Email Text Field
        JTextField emailField = new JTextField();
        emailField.setBounds(100, 50, 150, 25);
        frame.add(emailField);

        // Password Label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 80, 100, 30);
        frame.add(passwordLabel);

        // Password Field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 80, 150, 25);
        frame.add(passwordField);

        // Submit Button
        JButton submitButton = new JButton("Login");
        submitButton.setBounds(100, 120, 80, 30);
        frame.add(submitButton);

        // Make frame visible at the end
        frame.setVisible(true);
    }
}
