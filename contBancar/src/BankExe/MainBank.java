package BankExe;

public class  MainBank {
    public static void main(String[] args) {
        Person person1 = new Person("Popescu", "Maria", "123456765");
        Card card1RON = new Card(1234323234243L, 111, 1234, person1.getNumeSiPrenume());
        ContCurent contBancarRON = new ContCurent(957463, "Cont curent", "RON");
        ContCurent contBancar2 = new ContCurent(1234456, "Cont curent", "RON");

        contBancarRON.setCard(card1RON);
        person1.setContBancar(contBancarRON);


        System.out.println(" balanta pt primul cont este : " + contBancarRON.getBalanta() + " " + contBancarRON.getValuta());
        contBancarRON.depunere(30);
        System.out.println(" balanta pt primul cont este : " + contBancarRON.getBalanta() + " " + contBancarRON.getValuta());
        contBancarRON.retragere(10);
        System.out.println(" balanta pt primul cont este : " + contBancarRON.getBalanta() + " " + contBancarRON.getValuta());
        contBancarRON.transferIntreConturi(10, contBancar2);
        System.out.println(" balanta pt primul cont este : " + contBancarRON.getBalanta() + " " + contBancarRON.getValuta());
        System.out.println(" balanta pt al doilea cont este : " + contBancar2.getBalanta() + " " + contBancar2.getValuta());

        System.out.println("---------------Economii");
        ContEconomii contEconomii = new ContEconomii(12413, "cont economii");
        System.out.println("Balanta contului de economii inainte de depunere: " + contEconomii.getBalanta());
        contEconomii.depunere(100);
        System.out.println("Balanta contului de economii dupa depunere: " + contEconomii.getBalanta());

        SchimbValutar.schimbEuroinRon(50);

    }
}
