/*
A5: You are reinventing Amazon! (Product, Book, Electronic/Physical Book, Pets/Cats Dogs).
You are in charge of creating an IT system for tracking products. Create a class Product containing name, description and price.
Add a child class Book, that has two child classes by itself: PhysicalBook and ElectronicBook. They differ in some characteristics:
PhysicalBook has weight (in kg), an electronic book has an URL (for downloading PDF). Add the method toString() describing
all different products. Test it. Amazon decided to sell pets (dogs and cats, for the start). See how you can
leverage an existing Product class to add a new class of products to the product line.
*/

public class Main {


public static void main(String args[]){

    ElectronicBook eBook=new ElectronicBook("Book1","all about dogs",100,"www.books.com");
    PhysicalBook pBook=new PhysicalBook("PBook","All about phisical book",130,1);

    System.out.println(eBook);
    System.out.println(pBook);

}

}
