package boletim;
import java.util.Scanner;


public class Boletim {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Nota
                b1 = new Nota(),
                b2 = new Nota(),
                b3 = new Nota(),
                b4 = new Nota();
        

        System.out.println("Digite o bimestre");
        b1.setBimestre(scanner.nextInt());

        System.out.println("Digite a nota do bimestre " + b1.getBimestre() );
        b1.setValorNota(scanner.nextDouble());

        System.out.println("Digite o bimestre");
        b2.setBimestre(scanner.nextInt());

        System.out.println("Digite a nota do bimestre " + b2.getBimestre());
        b2.setValorNota(scanner.nextDouble());

        System.out.println("Digite o bimestre");
        b3.setBimestre(scanner.nextInt());

        System.out.println("Digite a nota do bimestre " + b3.getBimestre());
        b3.setValorNota(scanner.nextDouble());

        System.out.println("Digite o bimestre");
        b4.setBimestre(scanner.nextInt());

        System.out.println("Digite a nota do bimestre " + b4.getBimestre());
        b4.setValorNota(scanner.nextDouble());

        System.out.println("A nota final é " + (
                b1.getValorNota() + b2.getValorNota() + b3.getValorNota() + b4.getValorNota()   )/4
        );
        
        
    }
    
}
