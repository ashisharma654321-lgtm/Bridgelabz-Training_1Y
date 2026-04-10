package Inheritance.Animals;

import java.util.*;
public class Runner{
    public static void main(String[] args){
        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(new Dog("Kittu",3));
        animals.add(new Cat("Puchku",2));
        animals.add(new Bird("Guluu",1));
        for(Animal a:animals){
            a.display();
            a.makeSound();
            System.out.println();
        }
    }
}