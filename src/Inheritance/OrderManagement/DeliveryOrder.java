package Inheritance.OrderManagement;

public class DeliveryOrder extends OrderMangement{
    String deliveryDate;

    public DeliveryOrder(int orderId,String orderDate,String status,String DeliveryOrder){
        super(orderId,orderDate,status);
        this.deliveryDate=deliveryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date : "+deliveryDate);

    }
}