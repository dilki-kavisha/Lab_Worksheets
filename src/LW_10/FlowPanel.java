package LW_10;

import javax.swing.*;
import java.awt.*;

public class FlowPanel extends JPanel {
    public FlowPanel() {
        setSize(100, 100);

        setLayout(new FlowLayout());

        JButton saveButton = new JButton("Save");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        add(saveButton);
        add(updateButton);
        add(deleteButton);

        setBackground(Color.LIGHT_GRAY);
    }
}