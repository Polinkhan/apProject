/**
 * @author  - Abu Sayed Polin
 * @ID - CSE 069 08012
 * @Page - Main Class
 * @Date - 26/12/2022
 */
package inventorymanagementsystem;

class CurrentUser {
    static String name = "";
}

public class InventoryManagementSystem {

    public static void main(String[] args) {
        new DB();
        new Login_Page().setVisible(true);
    }

}
