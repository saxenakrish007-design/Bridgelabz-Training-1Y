package com.gla.JDBC;
import java.sql.*;
import java.util.Scanner;

public class AccountManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            while (true) {
                System.out.println("1.Add 2.Display 3.Update 4.Delete 5.Exit");
                int ch = sc.nextInt();

                if (ch == 1) {
                    int accNo = sc.nextInt();
                    String name = sc.next();
                    double bal = sc.nextDouble();

                    PreparedStatement ps = con.prepareStatement(
                            "insert into accounts values(?,?,?)");
                    ps.setInt(1, accNo);
                    ps.setString(2, name);
                    ps.setDouble(3, bal);
                    ps.executeUpdate();
                }

                else if (ch == 2) {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(
                            "select * from accounts where balance>10000");

                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getDouble(3));
                    }
                }

                else if (ch == 3) {
                    int accNo = sc.nextInt();
                    double amt = sc.nextDouble();
                    int type = sc.nextInt();

                    PreparedStatement ps;

                    if (type == 1) {
                        ps = con.prepareStatement(
                                "update accounts set balance=balance+? where accNo=?");
                    } else {
                        ps = con.prepareStatement(
                                "update accounts set balance=balance-? where accNo=?");
                    }

                    ps.setDouble(1, amt);
                    ps.setInt(2, accNo);
                    ps.executeUpdate();
                }

                else if (ch == 4) {
                    int accNo = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "delete from accounts where accNo=?");
                    ps.setInt(1, accNo);
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
