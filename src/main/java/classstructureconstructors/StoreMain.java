package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Store sushiStore = new Store("sushi");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg számokkal mennyi " + sushiStore.getProduct() + " érkezett be:");
        sushiStore.store(scanner.nextInt());
        System.out.println("Módosított raktári db: " + sushiStore.getStock());

        System.out.println("Kérem adja meg számokkal mennyi " + sushiStore.getProduct() + " került kiszállításra:");
        sushiStore.dispatch(scanner.nextInt());
        System.out.println("Módosított raktári db: " + sushiStore.getStock());

        Store tofuStore = new Store("tofu");

        System.out.println("Kérem adja meg számokkal mennyi " + tofuStore.getProduct() + " érkezett be:");
        tofuStore.store(scanner.nextInt());
        System.out.println("Módosított raktári db: " + tofuStore.getStock());

        System.out.println("Kérem adja meg számokkal mennyi " + tofuStore.getProduct() + " került kiszállításra:");
        tofuStore.dispatch(scanner.nextInt());
        System.out.println("Módosított raktári db: " + tofuStore.getStock());


    }
}
