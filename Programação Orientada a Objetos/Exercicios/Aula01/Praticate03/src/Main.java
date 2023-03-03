import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int vog = 0, cons = 0, outros = 0;

        System.out.print("Digite sua frase: ");
        String frase = in.nextLine();

        frase = frase.toLowerCase();
        char[] chars = frase.toCharArray();

        for(int i=0;i < frase.length(); i++){
            if((frase.charAt(i) >= 'a') && (frase.charAt(i) <= 'z')){
                if(frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' ||
                        frase.charAt(i)=='o' || frase.charAt(i)=='u'){
                    vog++;
                }
                else{
                    cons++;
                }
            }
            else{
                outros++;
            }
        }

        System.out.println("Numero de Vogais: "+vog);
        System.out.println("Numero de Consoantes: "+cons);
        System.out.println("---> Frase: "+frase);
    }
}