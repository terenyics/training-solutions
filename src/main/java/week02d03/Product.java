package week02d03;

public class Product {

    String name;
    String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public static void main(String[] args) {
        Product product = new Product("Körte", "lm");
        Product anotherProduct = new Product("Körte", "krt");

        int x = product.code.length() - anotherProduct.code.length();
        boolean maxDiff = x == -1 || x == 1 || x == 0;
        boolean sameProduct = product.name.equals(anotherProduct.name);
        boolean isSame = maxDiff == true && sameProduct == true;

        System.out.println(isSame);

    }

}
