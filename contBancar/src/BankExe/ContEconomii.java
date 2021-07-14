package BankExe;

import BankExe.ContBancar;

public class ContEconomii  extends ContBancar {

    public ContEconomii(long iban, String nume) {
        super(iban, nume, "RON");
    }

    public void depunere(double suma){
        System.out.println("metoda depundere din economii");
        double dobanda;
        if (suma>100){
            dobanda = (suma*0.1)/100;
        } else {
            dobanda = suma*0.05/100;
        }
        suma += dobanda;
        super.setBalanta(suma);


    }


}
