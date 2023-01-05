/**
 * @author  - Abu Sayed Polin
 * @ID - CSE 069 08012
 * @Page - Database Connection [ user = 'root' , password = 'Polin@102030' , DB
 * = 'mySQL'
 * @Date - 26/12/2022
 */
package inventorymanagementsystem;

import java.sql.*;
import java.util.Map;

public class DB {

    static Connection con = null;

    DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DB.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AP_Final_Project", "root", "Polin@102030");
            if (con != null) {
                System.out.println("Successfully Connected");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }

    public static ResultSet Query(String query, Map<Integer, String> queryParam) {
        try {
            PreparedStatement pst = con.prepareStatement(query);
            for (Map.Entry param : queryParam.entrySet()) {

                int index = (int) param.getKey();
                String value = (String) param.getValue();

                System.out.println(value);

                pst.setString(index, value);
            }
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public static ResultSet Query(String query) {
        try {
            PreparedStatement pst = con.prepareStatement(query);
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    public static String nonReturnAbleQuery(String query, Map<Integer, String> queryParam) {
        try {
            PreparedStatement pst = con.prepareStatement(query);
            for (Map.Entry param : queryParam.entrySet()) {

                int index = (int) param.getKey();
                String value = (String) param.getValue();

                System.out.println(value);

                pst.setString(index, value);
            }
            return String.valueOf(pst.executeUpdate());
        } catch (SQLException ex) {
            return ex.toString();
        }
    }

    public static String nonReturnAbleQuery(String query) {
        try {
            PreparedStatement pst = con.prepareStatement(query);
            return String.valueOf(pst.executeUpdate());
        } catch (SQLException ex) {
            return ex.toString();
        }
    }
}
