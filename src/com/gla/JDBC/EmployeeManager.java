package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            while (true) {
                System.out.println("1.Add 2.Display 3.Update 4.Delete 5.Exit");
                int ch = sc.nextInt();

                if (ch == 1) {
                    int id = sc.nextInt();
                    String name = sc.next();
                    double sal = sc.nextDouble();

                    PreparedStatement ps = con.prepareStatement(
                            "insert into employee values(?,?,?)");
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setDouble(3, sal);
                    ps.executeUpdate();
                }

                else if (ch == 2) {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(
                            "select * from employee where salary>30000");

                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getDouble(3));
                    }
                }

                else if (ch == 3) {
                    int id = sc.nextInt();
                    PreparedStatement ps = con.prepareStatement(
                            "update employee set salary=salary+salary*0.1 where id=?");
                    ps.setInt(1, id);
                    ps.executeUpdate();
                }

                else if (ch == 4) {
                    PreparedStatement ps = con.prepareStatement(
                            "delete from employee where salary<15000");
                    ps.executeUpdate();
                }

                else if (ch == 5) {
                    con.close();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
