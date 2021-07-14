public class VolumCilindru {
    public static void main(String[] args) {
        /*Trebuie creat un program Java care va calcula volumul cilindrului, a cărui rază este 10, iar înălțimea 50.

        Formula necesară pentru calcularea volumului cilindrului este:

        V = r^2 * Pi * H
        r – raza bazei cilindrului
        H – înălțimea
        Pi – constanta Pi, 3.14

        Valoarea obținută trebuie scrisă la ieșire.
         */

        double Pi = 3.14;
        double r = 10;
        double H = 50;
        double V = (r*r) * Pi * H;
        System.out.println("Un cilindru a carui raza este 10 iar inaltimea 50 are volumul:"+ V);
    }
}
