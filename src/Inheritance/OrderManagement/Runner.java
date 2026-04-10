package Inheritance.OrderManagement;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Order class");
        OrderMangement o1 = new OrderMangement(201, "17-08-2023", "Order Placed");
        o1.displayDetails();


        System.out.println("-****************-");
        System.out.println("Shipped Order class");
        ShippedOrder s1 = new ShippedOrder(102, "24-5-2020", "Shipped", "ABC453");
        s1.displayDetails();


        System.out.println("-*****************-");
        System.out.println("Delivery order class");
        DeliveryOrder d1 = new DeliveryOrder(101, "23-07-2020", "Order Delivered", "30-4-2024");
        d1.displayDetails();
    }
}

