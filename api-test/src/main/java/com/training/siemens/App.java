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
             PreparedStatement pss = connection.prepareStatement("select * from person");
             ResultSet resultSet = pss.executeQuery();
             ) {

            ps.setLong(1,
                       100);
            ps.setString(2,
                         "osman");
            ps.setString(3,
                         "yaycıoğlu");
            ps.execute();
            ps.flu
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
