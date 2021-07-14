public class BicicletaElectrica extends Vehicul{


    @Override
    public void acceleratie() {
        System.out.println("Bicicleta electrica accelereaza");
    }

    @Override
    public void franare() {
        System.out.println("Bicicleta electrica franeaza");
    }

    @Override
    public void schimbareTrepte() {
        System.out.println("Bicicleta electrica schimba trepte");
    }
}
