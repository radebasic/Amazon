
/*
A5: You are reinventing Amazon! (Product, Book, Electronic/Physical Book, Pets/Cats Dogs).
You are in charge of creating an IT system for tracking products. Create a class Product containing name, description and price.
Add a child class Book, that has two child classes by itself: PhysicalBook and ElectronicBook. They differ in some characteristics:
PhysicalBook has weight (in kg), an electronic book has an URL (for downloading PDF). Add the method toString() describing
all different products. Test it. Amazon decided to sell pets (dogs and cats, for the start). See how you can
leverage an existing Product class to add a new class of products to the product line.
*/


public class Product {

    private String name;
    private String description;
    private double price;


    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
