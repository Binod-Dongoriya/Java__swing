import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class jmenubar {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame f = new JFrame("Notepad");
       f.setBounds(300,200,600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        // Create JMenuBar
        JMenuBar menubar = new JMenuBar();

        // Create JMenu
        JMenu file = new JMenu("File");

        // Create Menu Items
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
        JMenuItem i4 = new JMenuItem("Save As");

        // Add menu items to the menu
        file.add(i2);
        file.add(i3);
        file.add(i4);

        // Add menu to the menubar
        menubar.add(file);






        // Create JMenu
        JMenu edit = new JMenu("Edit");

        // Create Menu Items
        JMenuItem i5 = new JMenuItem("Copy");
        JMenuItem i6 = new JMenuItem("Cut");
        JMenuItem i7 = new JMenuItem("Paste");
        JMenuItem i8 = new JMenuItem("Delete");


        // Add menu items to the menu
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);
        edit.add(i8);




        // Create JMenu
        JMenu view = new JMenu("View");

        // Create Menu Items
        JMenuItem i9 = new JMenuItem("Zoom in");
        JMenuItem i10 = new JMenuItem("Zoom out");


        // Add menu items to the menu
        view.add(i9);
        view.add(i10);


        // Add menu to the menubar

        menubar.add(file);
        menubar.add(edit);
        menubar.add(view);

        
        // Set the menubar in the frame
        f.setJMenuBar(menubar);


        Container c = f.getContentPane();
        c.setLayout(null);

        JTextArea texthere= new JTextArea();
        texthere.setBounds(2,1,599,399);
        texthere.setText("write something...");
        c.add(texthere);



        // Make frame visible
        f.setVisible(true);
    }
}
