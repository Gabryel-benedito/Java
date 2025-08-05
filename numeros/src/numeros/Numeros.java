package numeros;
import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        
        int leituras, numero,  maior, menor;
        Scanner teclado = new Scanner(System.in);
        
        do{
        
            System.out.println("Digite a quantidade de leituras a serem feitas");
            leituras = teclado.nextInt();
            
        }while(leituras <= 0);
        
        
        
        System.out.println("Digite o primeiro número");
        numero = teclado.nextInt();
        maior = numero;
        menor = numero;
        

        
        
        
        for(int i = 2; i <= leituras; i++){
            
            System.out.println("Digite o " + i + "° número");
            
            numero = teclado.nextInt();
            
           if(numero >= maior){
                
                maior = numero;
                
            }else if(numero <= menor){
                
                menor = numero;
                
            }
        }
        
        
        System.out.println("O maoir número digitado foi " + maior);
        
        System.out.println("O menor número digitado foi " + menor);
    }    
}
