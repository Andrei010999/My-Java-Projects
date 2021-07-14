public class Main {
    public static void main(String[] args) {
        Vehicul masina1 = new Masina();
        Vehicul bicicletaElectrica1 = new BicicletaElectrica();
        masina1.acceleratie();
        masina1.franare();
        masina1.schimbareTrepte();
        bicicletaElectrica1.acceleratie();
        bicicletaElectrica1.franare();
        bicicletaElectrica1.schimbareTrepte();
    }
}
