package LW_08;

import javax.swing.*;
import java.awt.*;

public class MyTable extends JTable {
    private static final String[][] data = {
            {"Dilki", "Female", "23"},
            {"Dilki", "Female", "22"},
            {"Dilki", "Female", "23"},
            {"Dilki", "Female", "22"},
            {"Dilki", "Female", "23"},
            {"Dilki", "Female", "22"},
            {"Dilki", "Female", "23"},
            {"Dilki", "Female", "22"},
    };
    private static final String[] columnNames = {"Name", "Gender", "Age"};


    public MyTable() {
        super(data, columnNames);
        setSize(300, getPreferredSize().height);
    }
}