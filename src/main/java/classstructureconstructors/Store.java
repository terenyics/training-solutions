package classstructureconstructors;

public class Store {

    private String product;
    private Integer stock;

    public Store(String product) {
        this.product = product;
        stock = 0;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void store(int plusz){
        stock = stock + plusz;
    }
    public void dispatch(int minusz){
        stock = stock - minusz;
    }
}
