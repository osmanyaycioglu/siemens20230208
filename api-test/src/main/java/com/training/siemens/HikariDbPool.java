package com.training.siemens;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class HikariDbPool {
    private HikariConfig     config = new HikariConfig();
    private HikariDataSource ds;

    public HikariDbPool() {
        config.setJdbcUrl( "jdbc:postgresql://localhost:5432/test" );
        config.setUsername( "postgres" );
        config.setPassword( "123456" );
        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        ds = new HikariDataSource( config );
    }

    public Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
