
package main;

/**
 *
 * @author sarahkalfoot
 */
public class Admin {
    int AdminID;
    String AdminEmail;

    public int getAdminID() {
        return AdminID;
    }

    public void setAdminID(int AdminID) {
        this.AdminID = AdminID;
    }

    public String getAdminEmail() {
        return AdminEmail;
    }

    public void setAdminEmail(String AdminEmail) {
        this.AdminEmail = AdminEmail;
    }

    public Admin(int AdminID, String AdminEmail) {
        this.AdminID = AdminID;
        this.AdminEmail = AdminEmail;
    }
    
    
}
