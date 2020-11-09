public class ElectronicBook extends Book {

    private String Url;

    public ElectronicBook(String name, String description, double price, String Url) {
        super(name, description, price);
        this.Url=Url;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    @Override
    public String toString() {
        return super.toString()+" Url "+Url;
    }
}
