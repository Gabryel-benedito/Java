package tabuada;
import java.util.Scanner;

public class Tabuada {


    public static void main(String[] args) {
        int tabuada, resultado, acertos = 0, erros = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número ");
        tabuada = teclado.nextInt();
        
        for(int i = 0; i <= 10; i++){
            do{
            System.out.print(tabuada + " x " + i + " = ");
            resultado = teclado.nextInt();
            if(resultado == tabuada * i){
                System.out.println("Correto");
                acertos++ ;
                
            }else{
                System.out.println("Incorreto");
                erros++ ;
            }
            
            
            }while(resultado != tabuada * i);
        }
        
        System.out.println("Você teve um total de " + acertos + "acertos, e " + erros + " erros." );
    }
    
}
