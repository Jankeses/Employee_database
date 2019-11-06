import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static Connection conn;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Config config = new Config();
        conn = config.getConn();

//        Statement statement = conn.createStatement();
//        String sqlQuery = "Select * from Employees";
//        ResultSet rs = statement.executeQuery(sqlQuery);
//        while (rs.next()) {
//            System.out.println(rs.getDate("StartJobDate"));
//        }
        //insert
//        String insert = "Insert INTO Employees (LastName, FirstName, Address, City, Salary, Age, StartJobDate, Benefit) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//        PreparedStatement ps = conn.prepareStatement(insert);
//        ps.setString(1, "Jarek");
//        ps.setString(2, "Garek");
//        ps.setString(3, "Bursztynowa");
//        ps.setString(4, "Wilno");
//        ps.setInt(5, 4500);
//        ps.setInt(6, 42);
//        ps.setDate(7, Date.valueOf("2018-10-15"));
//        ps.setInt(8, 1);
////        int rowInsert = ps.executeUpdate();
////        if(rowInsert > 0) {
////            System.out.println("Success!");
////        }
    }
 public void nowyWpis(String LastName, String FirstName, String Address, String City, int salary, int age, String start, int benefit) throws SQLException {

     String insert = "Insert INTO Employees (LastName, FirstName, Address, City, Salary, Age, StartJobDate, Benefit) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
     PreparedStatement ps = conn.prepareStatement(insert);

     ps.setString(1, LastName);
     ps.setString(2, FirstName);
     ps.setString(3, Address);
     ps.setString(4, City);
     ps.setInt(5, salary);
     ps.setInt(6, age);
     ps.setDate(7, Date.valueOf(start));
     ps.setInt(8, benefit);
     ps.executeUpdate();
 }


}
