package LW_08;

import java.sql.*;

public class Database {
    private static final String connectionString = "jdbc:mysql://20.2.84.80:3306/registration?useSSL=false";
    private static final String user = "root";
    private static final String dbPass = "";

    public static boolean createUser(String name, String email, String gender, String dob, String password)
    {
        try {
            Connection connection = DriverManager.getConnection(connectionString, user, dbPass);
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO LW_08 (`name`, `email`, `gender`, `bod`, `password`) VALUES (?, ?, ?, ?, ?)"
            );

            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, gender);
            statement.setString(4, dob);
            statement.setString(5, password);

            statement.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            return false;
        }
    }

    public static boolean SignIn(String email, String password)
    {
        try {
            Connection connection = DriverManager.getConnection(connectionString, user, dbPass);
            PreparedStatement statement =  connection.prepareStatement("SELECT * FROM LW_08 WHERE email = ? AND password = ?");

            statement.setString(1, email);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return true;
            }
            else {
                return false;
            }

        } catch (SQLException e){
            System.out.println("Connection Failed!");
            return false;
        }
    }
}