package LW_08;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {

    public Home() {
        setTitle("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setResizable(false);
        boolean isVisible = false;
        setVisible(isVisible);
        setLayout(null);

        Container contentPane = getContentPane();

        JMenuBar menuBar = getBar();
        setJMenuBar(menuBar);

        JButton backButton = new JButton("Back");
        backButton.setLocation(20,20);
        backButton.setSize(backButton.getPreferredSize());
        contentPane.add(backButton);

        backButton.addActionListener((e -> {
            new SignUp().setVisible(true);
            this.dispose();
        }));

//        ImageIcon image = new ImageIcon("Resources/home.jpg");
//        JLabel imageLabel = new JLabel(image);
//        imageLabel.setLocation(60,60);
//        imageLabel.setSize(600, 400);
//        contentPane.add(imageLabel);

        MyTable table = new MyTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setLocation(200, 100);
        scrollPane.setSize(table.getSize());
        contentPane.add(scrollPane);

    }

    private JMenuBar getBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu homeMenu = new JMenu("Home");
        JMenuItem fileItem1 = new JMenuItem("New");
        homeMenu.add(fileItem1);
        JMenuItem fileItem2 = new JMenuItem("Open");
        homeMenu.add(fileItem2);
        JMenuItem fileItem3 = new JMenuItem("Save");
        homeMenu.add(fileItem3);

        JMenu editMenu = new JMenu("Edit");
        JMenuItem menuItem4 = new JMenuItem("Copy");
        editMenu.add(menuItem4);
        JMenuItem menuItem5 = new JMenuItem("Paste");
        editMenu.add(menuItem5);
        JMenuItem menuItem6 = new JMenuItem("Cut");
        editMenu.add(menuItem6);

        JMenu accountsMenu = new JMenu("Accounts");
        JMenuItem menuItem7 = new JMenuItem("Log in");
        accountsMenu.add(menuItem7);
        JMenuItem menuItem8 = new JMenuItem("Logout");
        accountsMenu.add(menuItem8);
        JMenuItem menuItem9 = new JMenuItem("Sign up");
        accountsMenu.add(menuItem9);

        menuBar.add(homeMenu);
        menuBar.add(editMenu);
        menuBar.add(accountsMenu);

        return menuBar;
    }
}