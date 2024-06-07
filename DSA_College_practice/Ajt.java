import java.sql.*;
import java.util.Scanner;

public class Ajt {
    public static void main(String[] args) throws Exception {
        java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mu","root","");
        String sql = "select * from emp";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("Records\n");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }
        sql = "insert into emp values(?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        pst.setInt(1, sc.nextInt());
        System.out.print("Enter Name: ");
        pst.setString(2, sc.next());
        System.out.print("Enter City: ");
        pst.setString(3, sc.next());
        System.out.print("Enter Age: ");
        pst.setInt(4, sc.nextInt());

        System.out.println("\n" + pst.executeUpdate() + " record inserted!\n");

        sql = "select * from emp";
        rs = stmt.executeQuery(sql);
        System.out.println("Records\n");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }
    }
}