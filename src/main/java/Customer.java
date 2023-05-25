
public class Customer {
    
    String customerID;
    String customerName;
    String customerEmail;
    private String cardInfo;
    
    public Customer(String customerID, String customerName,String customerEmail,String cardInfo) {
        this.customerID = customerID;
        this.customerName= customerName;
        this.customerEmail=customerEmail;
        this.cardInfo=cardInfo;
        
    }

    Customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", customerName=" + customerName + ", customerEmail=" + customerEmail + ", cardInfo=" + cardInfo + '}';
    }
    
    public static void placeOreder(){
        
    }
  public static void Register(){
        
    }
    public static void login(){
        
    }
      public static void updateProfile(){
        
    }
        public static void searchForService(){
        
    }
    
}
