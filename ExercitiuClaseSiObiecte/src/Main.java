public class Main {
    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("Milka", 110111, 25,125);
        Wine wine = new Wine("Sauvignon", 112321, 150, 700);
        Product product = new Product("Produs nedefinit", 0, 0);

        System.out.println("Chocolate informations: " + "\n"+ chocolate.getInfo());
        System.out.println("Wine informations: " + "\n"+ wine.getInfo());
        System.out.println("Product informations: " + "\n"+ product.getInfo());

    }
}