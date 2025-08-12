
package classe.e.objetos;
import java.util.Scanner;


public class ClasseEObjetos {


    public static void main(String[] args) {

        
        Produto p= new Produto();
        Scanner teclado= new Scanner(System.in);
        
        
        
      
        
        /*System.out.println("Digite seu Id: ");
        p.setId(teclado.nextInt());
        teclado.nextLine();
        
        System.out.println("Digite o nome de um filme: ");
        p.setNome(teclado.nextLine());
        
        System.out.println("Escreva uma descrição sobre o filme");
        p.setDec(teclado.nextLine());
        
        System.out.println("O id é " + p.getId() );
        System.out.println( "O Nome do filme é" +  p.getNome());
        
        
        Produto p2 = new Produto();
        
        
        p2.setId(100);
        
        System.out.println("Digite o nome de mais um filme");
        p2.setNome(teclado.nextLine());
        
        System.out.println("Digite uma descrição desse filme");
        p2.setDec(teclado.nextLine());
        
        System.out.println("O Id é: " + p.getId());
        System.out.println("O Nome do filme é: " + p.getNome());
        System.out.println(p.getDec());
        

    */
        
        int quant;
        
        System.out.println("Sobre quantos filme você quer falar ");
        quant = teclado.nextInt();
        teclado.next();
        
        for( int i = 0; i < quant;  i++ ){
        
            p.setId(i);
            
            System.out.println("Digite o nome de um filme: " + p.getId());
            p.setNome(teclado.nextLine());

            System.out.println("Escreva uma descrição sobre o filme");
            p.setDec(teclado.nextLine());

            System.out.println("\n\n" + "O id é " + p.getId() );
            System.out.println( "O Nome do filme é" +  p.getNome());
            System.out.println( "O filme fala sobre "  + p.getDec());
        }
        
    }
    
}

    







                                                                            
