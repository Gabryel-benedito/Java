package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Calculo conta01 = new Calculo();
        
        System.out.println("Digite o número 01:");
        conta01.setNumero1(teclado.nextDouble());
        
        System.out.println("Digite o numero 02:");
        conta01.setNumero2(teclado.nextDouble());
        
        System.out.println("Qual a operação: ");
        conta01.setOperador(teclado.next());
        
        System.out.println("O resultado foi: " + conta01.resultado());
        
    }
    
}
