import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a placa do seu carro: ");
        String plca = in.nextLine();
        System.out.print("Digite o ano de fabricacao do automovel: ");
        int fab = in.nextInt();

        System.out.println("------> Situação do veiculo:");

        if (fab < 2011) {
            System.out.println("Carro Velho");
        } else if (fab < 2023) {
            System.out.println("Carro Semi Novo");
        } else {
            System.out.println("Carro Novo");
        }

        System.out.println("Placa do automovel: "+formatacao(plca));

    }
    public static String formatacao(String dado){
        dado = dado.replaceAll("e","*");
        dado = dado.replaceAll("a","*");
        dado = dado.replaceAll("i","*");
        dado = dado.replaceAll("o","*");
        dado = dado.replaceAll("u","*");

        return dado;
    }
}