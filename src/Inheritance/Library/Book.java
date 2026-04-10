package Inheritance.Library;

public class Book {
String title;
int publicationYear;

public Book(String name,int publicationYear){
    this.title=title;
    this.publicationYear=publicationYear;
}
public void displayDetail(){
    System.out.println("Title :"+title);
    System.out.println("PublicationYear :"+publicationYear);
}
}