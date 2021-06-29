package edu.pepper.srp.depois;

import java.sql.Connection;
import java.util.Properties;

public class ConnectionDAO {

    private Properties connectionProps;
    private Connection conn;
    private String dbms;
    private String dbName;
    private String serverName;
    private String portNumber;

    private static final String JDBC = "jdbc:";

    public ConnectionDAO() {
        super();
    }

    public ConnectionDAO(String username, String password) {
        super();
        connectionProps = new Properties();
        connectionProps.put("user", username);
        connectionProps.put("password", password);
    }
    /*
    ...
    */
}
