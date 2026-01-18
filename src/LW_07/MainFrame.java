package LW_07;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainFrame extends JFrame {
    private static final String FRAME_TITLE = "Registration From";
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 500;
    private static final int FRAME_X = 700;
    private static final int FRAME_Y = 300;

    private String connectionString = "jdbc:mysql://localhost:3306/registration?useSSL=false";
    private String user = "root";
    private String password = "";

    public MainFrame(){
        setTitle(FRAME_TITLE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X, FRAME_Y);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null);

        Font headerFont = new Font("Sans Serif", Font.BOLD, 25);

        JLabel header = new JLabel("Registration Form");
        header.setFont(headerFont);
        header.setSize(400,40);
        header.setLocation(200, 10);
        container.add(header);

        JLabel name = new JLabel("Name");
        name.setSize(50,25);
        name.setLocation(50, 70);
        container.add(name);

        JTextField nameField = new JTextField();
        nameField.setSize(200, 25);
        nameField.setLocation(100, 70);
        container.add(nameField);

        JLabel mobile = new JLabel("Mobile");
        mobile.setSize(50,25);
        mobile.setLocation(50, 110);
        container.add(mobile);

        JTextField mobileField = new JTextField();
        mobileField.setSize(200, 25);
        mobileField.setLocation(100, 110);
        container.add(mobileField);

        JLabel gender = new JLabel("Gender");
        gender.setSize(50,25);
        gender.setLocation(50, 150);
        container.add(gender);

        JRadioButton genderMale = new JRadioButton("Male");
        genderMale.setSize(70,25);
        genderMale.setLocation(130, 150);
        genderMale.setSelected(true);
        container.add(genderMale);

        JRadioButton genderFemale = new JRadioButton("Female");
        genderFemale.setSize(100,25);
        genderFemale.setLocation(200, 150);
        container.add(genderFemale);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);

        JLabel DOB = new JLabel("DOB");
        DOB.setSize(50,25);
        DOB.setLocation(50, 200);
        container.add(DOB);

        JComboBox<String> dayBox = new JComboBox<>(getDays());
        dayBox.setSize(50, 25);
        dayBox.setLocation(100,200);
        container.add(dayBox);

        JComboBox<String> monthBox = new JComboBox<>(getMonths());
        monthBox.setSize(80, 25);
        monthBox.setLocation(150,200);
        container.add(monthBox);

        JComboBox<String> yearBox = new JComboBox<>(getYears());
        yearBox.setSize(70, 25);
        yearBox.setLocation(230,200);
        container.add(yearBox);

        JLabel address = new JLabel("Address");
        address.setSize(50,25);
        address.setLocation(50, 250);
        container.add(address);

        JTextArea addressArea = new JTextArea();
        addressArea.setSize(200, 100);
        addressArea.setLocation(100, 250);
        container.add(addressArea);

        JCheckBox checkBox = new JCheckBox("Accept Terms and Conditions");
        checkBox.setSize(200, 25);
        checkBox.setLocation(100, 360);
        container.add(checkBox);

        JTextArea output = new JTextArea();
        output.setSize(250, 350);
        output.setLocation(310, 70);
        container.add(output);

        JButton submitButton = new JButton("Submit");
        submitButton.setSize(100, 25);
        submitButton.setLocation(70, 390);
        container.add(submitButton);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }



        submitButton.addActionListener(e -> {
            if (nameField.getText().isBlank()) {
                output.setText("Name is required!");
                return;
            }
            if (mobileField.getText().isBlank()) {
                output.setText("Mobile is required!");
                return;
            }
            if (addressArea.getText().isBlank()) {
                output.setText("Address is required!");
                return;
            }
            if (!checkBox.isSelected()){
                output.setText("Accepting is required!");
                return;
            }

            String txt = "Name: " + nameField.getText() + "\n" +
                    "Mobile: " + mobile.getText() + "\n" +
                    "Gender: " + (genderMale.isSelected() ? "Male" : "Female") + "\n" +
                    "DOB: " + dayBox.getSelectedItem() + "-" + monthBox.getSelectedItem() + "-" + yearBox.getSelectedItem() + "\n" +
                    "Address: " + addressArea.getText();
            output.setText(txt);

            try {
                Connection connection = DriverManager.getConnection(connectionString, user, password);
                PreparedStatement statement = connection.prepareStatement("INSERT INTO `users` (`name`, `mobile`, `gender`, `DOB`, `address`) VALUES (?, ?, ?, ?, ?)");
                statement.setString(1, nameField.getText());
                statement.setString(2, mobileField.getText());
                statement.setString(3, genderMale.isSelected() ? "Male" : "Female");
                String DOB_Value = dayBox.getSelectedItem() + "-" + monthBox.getSelectedItem() + "-" + yearBox.getSelectedItem();
                statement.setString(4, DOB_Value);
                statement.setString(5, addressArea.getText());
                statement.execute();
                connection.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.setSize(100, 25);
        resetButton.setLocation(190, 390);

        resetButton.addActionListener(e -> {
            nameField.setText("");
            addressArea.setText("");
            checkBox.setSelected(false);
            dayBox.setSelectedIndex(0);
            monthBox.setSelectedIndex(0);
            yearBox.setSelectedIndex(0);
            mobileField.setText("");
            output.setText("");
        });

        container.add(resetButton);


    }

    String[] getDays(){
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i+1);
        }
        return days;
    }

    String[] getMonths(){
        return new String[]{
                "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"
        };
    }
    String[] getYears(){
        String[] years = new String[100];
        for (int i = 0; i < 100; i++) {
            years[i] = String.valueOf(1950+i);
        }
        return years;
    }

}