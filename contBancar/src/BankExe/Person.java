package BankExe;

import BankExe.ContBancar;

public class Person {
    private String nume;
    private String prenume;
    private String cnp;
    private ContBancar contBancar;

    public Person(String nume, String prenume, String cnp){
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }

    public void setContBancar(ContBancar contBancar){
        this.contBancar = contBancar;
    }

    public String getNumeSiPrenume(){
        return nume + " " + prenume;
    }

}
