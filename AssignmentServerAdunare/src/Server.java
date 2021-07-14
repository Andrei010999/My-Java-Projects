import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {

    public static void main(String[] args) {

        while (true) {

            try (DatagramSocket datagramSocket = new DatagramSocket(1081)) {

                byte[] buffer = new byte[256];


                DatagramPacket p = new DatagramPacket(buffer, buffer.length);
                System.out.println("Se asteapta numerele");


                datagramSocket.receive(p);


                String mesajPrimit = new String(p.getData(), 0, p.getLength());
                String[] numere =   mesajPrimit.split("\\+");


                int numar1 = Integer.parseInt(numere[0]);
                int numar2 = Integer.parseInt(numere[1]);

                String raspuns = String.valueOf(Sum(numar1, numar2));
                buffer = raspuns.getBytes();

                p = new DatagramPacket(buffer, buffer.length, p.getAddress(), p.getPort());

                datagramSocket.send(p);

                System.out.println("Raspunsul a fost = " + raspuns);
                System.out.println("Raspunsul a fost trimis");
            } catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        }
    }

    public static int Sum (int a, int b)
    {
        return a+b;
    }

}