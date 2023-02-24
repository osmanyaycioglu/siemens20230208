package com.training.siemens;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        HikariDbPool hikariDbPool = new HikariDbPool();
        try (Connection connection = hikariDbPool.getConnection();
             PreparedStatement ps = connection.prepareStatement("INSERT INTO person (person_id, person_name, person_surname) VALUES (?,?,?)");
             ) {

            ps.setLong(1,
                       101);
            ps.setString(2,
                         "deneme");
            ps.setString(3,
                         "yaycıoğlu");
            ps.execute();

        } catch (SQLException eParam) {
            eParam.printStackTrace();
        }

        try (Connection connection = hikariDbPool.getConnection();
             PreparedStatement pss = connection.prepareStatement("select * from person");
             ResultSet resultSet = pss.executeQuery();
        ) {
            while (resultSet.next()){
                long personId = resultSet.getLong("person_id");
                String personName = resultSet.getString("person_name");
                String personSurname = resultSet.getString("person_surname");
                System.out.println("pid : " + personId + " pn : " + personName + " ps : " + personSurname);
            }
        } catch (SQLException eParam) {
            eParam.printStackTrace();
        }

    }
}
