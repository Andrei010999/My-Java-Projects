package BankExe;

import BankExe.Card;

public class ContBancar {
    private long iban;
    private String nume;
    private double balanta;
    private String valuta;
    private Card card;

    public ContBancar(long iban, String nume, String valuta){
        this.iban = iban;
        this.nume= nume;
        this.valuta = valuta;
        balanta = 0;
    }

    public void setCard(Card card){
        this.card = card;
    }

    public double getBalanta(){
        return balanta;
    }

    public void setBalanta(double balanta){
        this.balanta = balanta;
    }

    public String getValuta(){
        return valuta;
    }

    public void depunere(double suma){
        System.out.println("metoda depundere din cont bancar");
        balanta += suma;
    }

    public void retragere(double suma){
        if (balanta <suma){
            System.out.println("Nu aveti fonduri");}
        else {
            balanta -= suma;
        }
    }

}
