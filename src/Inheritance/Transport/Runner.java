package Inheritance.Transport;

public class Runner{
    public static void main(String[] args){
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car(170,"Petrol",9);
        vehicles[1]=new Truck(100,"Diesel",30);
        vehicles[2]=new Motorcycle(120,"Petrol",true);
        for(Vehicle v:vehicles){
            v.displayInfo();
            System.out.println();

        }
    }
}
