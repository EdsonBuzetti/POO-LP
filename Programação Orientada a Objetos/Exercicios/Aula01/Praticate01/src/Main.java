import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("digite o tempo gasto de viagem: ");
        int hora = in.nextInt();
        System.out.print("Digite a velocidade media durante a viagem: ");
        int vel = in.nextInt();
        System.out.print("Digite a quantidade de km/l seu carro consome? ");
        int gasto = in.nextInt();

        int dist = vel * hora;
        int consu = dist / gasto;

        System.out.println("A quantidade de litros de conbustivel gasto na viagem é de: "+consu);
    }
}