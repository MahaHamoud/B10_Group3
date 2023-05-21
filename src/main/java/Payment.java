public class Payment {
    private int customerID;
    private String paymentMethod;
    private String cardInfo;

    // Constructor
    public Payment(int customerID, String paymentMethod, String cardInfo) {
        this.customerID = customerID;
        this.paymentMethod = paymentMethod;
        this.cardInfo = cardInfo;
    }

    // Method to send confirmation
    public String sendConfirmation() {
        // Logic to send confirmation message
        String confirmationMessage = "Payment for Customer ID: " + customerID + " was successful.";
        return confirmationMessage;
    }

    // Method to contact the bank
    public void contactBank() {
        // Logic to contact the bank for payment processing
        System.out.println("Contacting the bank for payment processing...");
        // Additional code for bank communication
        System.out.println("Payment processed successfully.");
    }

    // Getter methods
    public int getCustomerID() {
        return customerID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getCardInfo() {
        return cardInfo;
    }

    // Setter methods
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setCardInfo(String cardInfo) {
        this.cardInfo = cardInfo;
    }
}