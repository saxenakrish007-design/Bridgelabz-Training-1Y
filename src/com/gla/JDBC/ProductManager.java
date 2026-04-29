package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            while (true) {
                System.out.println("1.Insert 2.Display 3.Update 4.Delete 5.Exit");
                int ch = sc.nextInt();

                if (ch == 1) {
                    for (int i = 0; i < 3; i++) {
                        int id = sc.nextInt();
                        String name = sc.next();
                        int qty = sc.nextInt();

                        PreparedStatement ps = con.prepareStatement(
                                "insert into product values(?,?,?)");
                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.setInt(3, qty);
                        ps.executeUpdate();
                    }
                }

                else if (ch == 2) {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(
                            "select * from product where qty<10");

                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getInt(3));
                    }
                }

                else if (ch == 3) {
                    int id = sc.nextInt();
                    int addQty = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "update product set qty=qty+? where pid=?");
                    ps.setInt(1, addQty);
                    ps.setInt(2, id);
                    ps.executeUpdate();
                }

                else if (ch == 4) {
                    int id = sc.nextInt();
                    PreparedStatement ps = con.prepareStatement(
                            "delete from product where pid=?");
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
