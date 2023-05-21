package main;


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
