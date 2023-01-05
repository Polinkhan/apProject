/**
 * @author  - Abu Sayed Polin
 * @ID - CSE 069 08012
 * @Page - Helping Functions
 * @Date - 27/12/2022
 */
package inventorymanagementsystem;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Helper {

    public static void FillTable(JTable table, ResultSet rs) {
        try {
            //To remove previously added rows
            try (rs) {
                ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
                int columns = rsmd.getColumnCount();
                String column_names[] = new String[columns];

                for (int i = 1; i <= columns; i++) {
                    String name = rsmd.getColumnName(i);
                    column_names[i - 1] = name;
                }

                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        column_names
                ));
                while (rs.next()) {
                    Object[] row = new Object[columns];
                    for (int i = 1; i <= columns; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) table.getModel()).insertRow(rs.getRow() - 1, row);
                }
            }
        } catch (SQLException e) {
        }
    }

    public static String shortQuery(String terget, String Col_Name, String Table, String value) {
        ResultSet result = DB.Query("Select " + terget + " from " + Table + " where " + Col_Name + " = '" + value +"'");
        try {
            if (result.next()) {
                return result.getString(terget);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return "";
    }
}
