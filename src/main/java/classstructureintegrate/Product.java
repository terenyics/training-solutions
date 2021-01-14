package classstructureintegrate;

public class Product {

    private String name;
    private Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(Integer increase){
        price = price + increase;
    }

    public void decreasePrice(Integer decrease){
        price = price - decrease;
    }
}
