package LW_10;

import javax.swing.*;
import java.awt.*;

public class TableFrame extends JFrame {

    public TableFrame() {
        int FRAME_HEIGHT = 300;
        int FRAME_WIDTH = 500;

        int LOCATION_X = 200;
        int LOCATION_Y = 200;

        String[][] tableData = {
                {"Amal", "CS/2022/020", "85"},
                {"Nimal", "Et/2022/014", "77"},
                {"Kamal", "CT/2022/011", "92"}
        };

        String[] columnNames = {"Name", "Index Number", "Marks"};

        setTitle("JTable View");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(LOCATION_X, LOCATION_Y);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());



        JTable table = new JTable(tableData, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        setJMenuBar(createMenuBar());

        FlowPanel flowPanel = new FlowPanel();
        add(flowPanel, BorderLayout.SOUTH);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        openMenuItem.setEnabled(false);
        exitMenuItem.addActionListener((e) -> { System.exit(0); });

        fileMenu.add(openMenuItem);
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        return menuBar;
    }

}