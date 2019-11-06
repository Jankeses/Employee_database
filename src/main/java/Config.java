import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {

    private Connection conn;
    public  Connection getConnect(){
        String url = "jdbc:sqlserver://DESKTOP-O33LS3J\\SQLEXPRESS;databaseName=master;integratedSecurity=true;";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }

    public Connection getConn() {
        return (conn != null) ? conn : getConnect();
    }



}
