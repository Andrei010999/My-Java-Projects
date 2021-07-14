import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 20;
        int randomNo = (int) (Math.random()*(max-min+1)+min);
        Scanner in = new Scanner(System.in);
        int nrCitit;
        System.out.println("Introdu numarul de la tastatura");

        do {
            nrCitit = in.nextInt();
            if (nrCitit == randomNo){
                System.out.println("Ai ghicit nr");
            }else if (nrCitit>randomNo){
                System.out.println("Numarul este prea mare, Mai incearca");
            }
            else if (nrCitit<randomNo){
                System.out.println("nr este prea mic, mai incearca");
            }


        }while (randomNo != nrCitit);

    }
}