package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();
        client.setName("Móka Miki");
        client.setYear(1980);
        client.setAddress("Fő utca 1");

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        client.migrate("Petőfi utca 1");

        System.out.println("Új cím: " + client.getAddress());
    }
}
