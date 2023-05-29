
import java.util.Date;



public class Order {
   int OrderNumber;
   Date OrderDate= new Date();
   private Date DeliveryDate = new Date();
   String OrderStatus ;

    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Date getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(Date DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public Order(int OrderNumber, String OrderStatus) {
        this.OrderNumber = OrderNumber;
        this.OrderStatus = OrderStatus;
    }
   
   public int ClaculatePrice(int OrderNumber){
       return 0;
       
   }
}


//import java.util.Date;
//
//public class Order {
//    private int orderNumber;
//    private Date orderDate;
//    private Date deliveryDate;
//    private String orderStatus;
//
//    // Constructor
//    public Order(int orderNumber, Date orderDate) {
//        this.orderNumber = orderNumber;
//        this.orderDate = orderDate;
//        this.deliveryDate = null;
//        this.orderStatus = "Pending";
//    }
//
//    // Method to calculate price
//    public int calculatePrice() {
//        // Logic to calculate the price of the order
//        int totalPrice = 0;
//        // Additional code for price calculation
//        return totalPrice;
//    }
//
//    // Getter methods
//    public int getOrderNumber() {
//        return orderNumber;
//    }
//
//    public Date getOrderDate() {
//        return orderDate;
//    }
//
//    public Date getDeliveryDate() {
//        return deliveryDate;
//    }
//
//    public String getOrderStatus() {
//        return orderStatus;
//    }
//
//    // Setter methods
//    public void setOrderNumber(int orderNumber) {
//        this.orderNumber = orderNumber;
//    }
//
//    public void setOrderDate(Date orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    public void setDeliveryDate(Date deliveryDate) {
//        this.deliveryDate = deliveryDate;
//    }
//
//    public void setOrderStatus(String orderStatus) {
//        this.orderStatus = orderStatus;
//    }
//}