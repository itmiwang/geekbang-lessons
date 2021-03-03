package org.geektimes.web.mvc.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author guozq
 * @date 2021-03-03-5:11 下午
 */
public class DerbyDatabase {
    
    private Connection connection;
    
    public static DerbyDatabase getInstance() {
        return new DerbyDatabase();
    }
    
    public DerbyDatabase() {
        try {
            init();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void init() throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Driver driver = DriverManager.getDriver("jdbc:derby:db/user-platform;create=true");
        connection = driver.connect("jdbc:derby:db/user-platform;create=true", new Properties());
        Statement statement = connection.createStatement();
//        System.out.println(statement.execute(CREATE_USERS_TABLE_DDL_SQL));
        statement.close();
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public void setConnection(final Connection connection) {
        this.connection = connection;
    }
    
    public static final String CREATE_USERS_TABLE_DDL_SQL = "CREATE TABLE users(" +
            "id INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), " +
            "name VARCHAR(16) NOT NULL, " +
            "password VARCHAR(64) NOT NULL, " +
            "email VARCHAR(64) NOT NULL, " +
            "phoneNumber VARCHAR(64) NOT NULL" +
            ")";
}
