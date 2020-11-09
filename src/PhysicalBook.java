public class PhysicalBook extends Book{

    private int weight;

    public PhysicalBook(String name, String description, double price, int weight) {
        super(name, description, price);
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+ " weight "+this.weight;

    }
}
