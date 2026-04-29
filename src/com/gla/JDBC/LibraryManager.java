package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            while (true) {
                System.out.println("1.Insert 2.Display 3.Issue 4.Delete 5.Exit");
                int ch = sc.nextInt();

                if (ch == 1) {
                    int id = sc.nextInt();
                    sc.nextLine();
                    String title = sc.nextLine();
                    String author = sc.nextLine();
                    String status = sc.nextLine();

                    PreparedStatement ps = con.prepareStatement(
                            "insert into books values(?,?,?,?)");
                    ps.setInt(1, id);
                    ps.setString(2, title);
                    ps.setString(3, author);
                    ps.setString(4, status);
                    ps.executeUpdate();
                }

                else if (ch == 2) {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(
                            "select * from books where status='Available'");

                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getString(3) + " " +
                                rs.getString(4));
                    }
                }

                else if (ch == 3) {
                    int id = sc.nextInt();
                    PreparedStatement ps = con.prepareStatement(
                            "update books set status='Issued' where id=?");
                    ps.setInt(1, id);
                    ps.executeUpdate();
                }

                else if (ch == 4) {
                    int id = sc.nextInt();
                    PreparedStatement ps = con.prepareStatement(
                            "delete from books where id=?");
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
