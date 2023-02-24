import java.time.LocalDate;

public class Produckt {
    private  String name;
    private String description;
    private  int price;
    private LocalDate madeofdate;
    private Productype productype;

    public Produckt(String name, String description, int price, LocalDate madeofdate, Productype productype) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.madeofdate = madeofdate;
        this.productype = productype;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getMadeofdate() {
        return madeofdate;
    }

    public void setMadeofdate(LocalDate madeofdate) {
        this.madeofdate = madeofdate;
    }

    public Productype getProductype() {
        return productype;
    }

    public void setProductype(Productype productype) {
        this.productype = productype;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "  description: " + description +
                "  price: " + price +
                "  madeofdate: " + madeofdate +
                "  productype: " + productype;
    }
}




