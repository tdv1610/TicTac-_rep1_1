/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.NguoiDungDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Oracle
 */
public class NguoiDungDAO extends connection{
     SQLConnectUnit connect;
      public static SQLConnection connection = new SQLConnection("c##sTICTAC", "123", "orcl");
    ;
    public NguoiDungDTO dangnhap(String TENND, String MATKHAU) {
        NguoiDungDTO nd = null;
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet rs = null;

        try {
            con = getConnection();  // Get the database connection
            System.out.println("Connection established successfully.");

            String sql = "SELECT * FROM NGUOIDUNG WHERE TENND = ? AND MATKHAU = ?";
            pre = con.prepareStatement(sql);
            pre.setString(1, TENND);
            pre.setString(2, MATKHAU);
            System.out.println("Executing query: " + sql);

            rs = pre.executeQuery();

            if (rs.next()) {
                nd = new NguoiDungDTO();
                nd.setTenND(rs.getString("TENND"));
                nd.setEmailND(rs.getString("EMAILND"));
                nd.setMatKhauND(rs.getString("MATKHAU"));
               
                System.out.println("User found: " + nd.toString());
            } else {
                System.out.println("No user found with the provided credentials.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pre != null) pre.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return nd;
    }
    public NguoiDungDTO dangki( String EMAIL,String TENND, String MATKHAU){
        NguoiDungDTO nd = null;
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet rs = null;

        try {
            con = getConnection();  // Get the database connection
            System.out.println("Connection established successfully.");

            String sql = "insert into NGUOIDUNG values(?,?,?)";
            pre = con.prepareStatement(sql);
            pre.setString(1, EMAIL);
            pre.setString(2, TENND);
            pre.setString(3, MATKHAU);
            System.out.println("Executing query: " + sql);

            rs = pre.executeQuery();

            if (rs.next()) {
                nd = new NguoiDungDTO();
                nd.setTenND(rs.getString("EMAIL"));
                nd.setEmailND(rs.getString("TENND"));
                nd.setMatKhauND(rs.getString("MATKHAU"));
               
                System.out.println("User found: " + nd.toString());
            } else {
                System.out.println("No user found with the provided credentials.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pre != null) pre.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return nd;
    }
}
