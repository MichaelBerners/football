package ru.belonogov.football;

import java.sql.*;

public class Test {
    public static void main(String[] args) {

        Connection root = getConnection("jdbc:postgresql://localhost:5433/football", "root", "111");
        System.out.println();


    }


    public static Connection getConnection(String url, String user, String password) {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(url, user, password);
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

    public static void statmant(Connection connection) {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select * game");
            while (resultSet.next()) {
                //resultSet.getString()
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
