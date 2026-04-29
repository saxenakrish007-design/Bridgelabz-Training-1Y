package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;

public class CustomerManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            while (true) {
                System.out.println("1.Add 2.Search 3.Update 4.Delete 5.Exit");
                int ch = sc.nextInt();

                if (ch == 1) {
                    int id = sc.nextInt();
                    String name = sc.next();
                    String phone = sc.next();

                    PreparedStatement ps = con.prepareStatement(
                            "insert into customers values(?,?,?)");
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setString(3, phone);
                    ps.executeUpdate();
                }

                else if (ch == 2) {
                    String name = sc.next();

                    PreparedStatement ps = con.prepareStatement(
                            "select * from customers where name like ?");
                    ps.setString(1, "%" + name + "%");

                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getString(3));
                    }
                }

                else if (ch == 3) {
                    int id = sc.nextInt();
                    String phone = sc.next();

                    PreparedStatement ps = con.prepareStatement(
                            "update customers set phone=? where id=?");
                    ps.setString(1, phone);
                    ps.setInt(2, id);
                    ps.executeUpdate();
                }

                else if (ch == 4) {
                    int id = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "delete from customers where id=?");
                    ps.setInt(1, id);
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
