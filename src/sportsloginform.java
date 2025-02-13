import javax.swing.*;
import java.awt.*;

class SportsLoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setBounds(300, 40, 670, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating Container
        Container c = frame.getContentPane();
        c.setLayout(null);

        // Header
        JLabel header = new JLabel("Mechi Sports Clubs");
        header.setBounds(250, 10, 200, 30);
        Font font = new Font("Arial", Font.BOLD, 18); // Fixed font issue
        header.setFont(font);
        c.add(header);  // Adding to container

        // Name Label and TextField
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 60, 100, 30);
        c.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 60, 200, 30);
        c.add(nameField);

        // Password Label and Field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        c.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 100, 200, 30);
        c.add(passField);

        // Gender Radio Buttons
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 140, 100, 30);
        c.add(genderLabel);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 140, 80, 30);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(230, 140, 80, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        c.add(male);
        c.add(female);

        // Semester ComboBox
        JLabel semesterLabel = new JLabel("Semester:");
        semesterLabel.setBounds(50, 180, 100, 30);
        c.add(semesterLabel);

        String[] semesters = { "BCA", "BBA", "BSc", "BIM", "CSTI" };
        JComboBox<String> semesterBox = new JComboBox<>(semesters);
        semesterBox.setBounds(150, 180, 200, 30);
        c.add(semesterBox);

        // Sports Selection Checkboxes
        JLabel sportsLabel = new JLabel("Sports:");
        sportsLabel.setBounds(50, 220, 100, 30);
        c.add(sportsLabel);

        JCheckBox football = new JCheckBox("Football");
        football.setBounds(150, 220, 100, 30);
        JCheckBox cricket = new JCheckBox("Cricket");
        cricket.setBounds(250, 220, 100, 30);
        JCheckBox volleyball = new JCheckBox("Volleyball");
        volleyball.setBounds(150, 250, 100, 30);
        JCheckBox baseball = new JCheckBox("Baseball");
        baseball.setBounds(250, 250, 100, 30);
        c.add(football);
        c.add(cricket);
        c.add(volleyball);
        c.add(baseball);

        // Position Input
        JLabel positionLabel = new JLabel("Gameplay Position:");
        positionLabel.setBounds(50, 290, 150, 30);
        c.add(positionLabel);

        JTextField positionField = new JTextField();
        positionField.setBounds(200, 290, 200, 30);
        c.add(positionField);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(250, 350, 100, 40);
        c.add(submitButton);

        // Make frame visible at the end
        frame.setVisible(true);
    }
}
