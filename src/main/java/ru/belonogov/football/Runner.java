package ru.belonogov.football;

import ru.belonogov.football.util.Creator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/football", "root", "111")) {
            init(connection);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void init(Connection connection) {
        Creator creator = new Creator();
        //creator.createTeams(connection);
        creator.createBarcelonaPlayers(connection);
    }
}
