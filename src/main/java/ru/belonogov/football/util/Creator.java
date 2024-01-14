package ru.belonogov.football.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Creator {

    public void createTeams(Connection connection) {
        PreparedStatement ps = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement("insert into teams (name) values (?)")){
            preparedStatement.setString(1, "Barcelona");
            preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createBarcelonaPlayers(Connection connection) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into players (name, number, team_id) values (?, ?, ?)"
        )){
            preparedStatement.setString(1, "Casilias");
            preparedStatement.setInt(2, 2);
            preparedStatement.setLong(3,1);
            preparedStatement.addBatch();
            preparedStatement.setString(1, "Varan");
            preparedStatement.setInt(2, 2);
            preparedStatement.setLong(3,1);
            preparedStatement.addBatch();
            preparedStatement.setString(1, "Pepe");
            preparedStatement.setInt(2, 3);
            preparedStatement.setLong(3,1);
            preparedStatement.addBatch();

            preparedStatement.executeBatch();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createRealMadrid(Connection connection) {


    }
}
