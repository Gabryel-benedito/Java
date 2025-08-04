package adivinhacao;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {
        int segredo, numero, tentativas = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o segredo (número inteiro): ");
        segredo = teclado.nextInt();
        
        do{
            System.out.println("Qual é o segredo? ");
            numero = teclado.nextInt();
            
            tentativas++;
        }while(numero != segredo);
        
        System.out.println("O segredo é " + segredo + ", e você acertou em " + tentativas + " tentativas.");
    }
    
}
