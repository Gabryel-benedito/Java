package controle;
import java.util.Scanner;


public class Controle {


    public static void main(String[] args) {
        
        Documento[] doc = new Documento[5];
        Scanner sc = new Scanner(System.in);
        
        
        
        for(int i = 0; i < doc.length; i++){
            
            System.out.println("Digite o número, o título e o valor: ");
        
            int n = sc.nextInt();
            sc.nextLine();
            String titulo = sc.nextLine();
            double valor = sc.nextDouble();
            sc.nextLine();
            
            doc[i] = new Documento(n, titulo, valor);
        }
        
        int maior = 0 , menor = 0;
        
        double  Vtotal = 0, media;
        
        for(int i = 1; i < doc.length; i++){
        
            if(doc[i].getValor() > doc[i - 1 ].getValor()){
            
                maior = i;
            
            }
            
            
            if(doc[i].getValor() < doc[i - 1 ].getValor()){
            
                menor = i;
            
            }
            
            
        
        }
        
        for(int i = 0; i < doc.length; i++){
            Vtotal += doc[i].getValor();
        }
        
        media = Vtotal / doc.length;
        
        System.out.println("O menor valor informado foi: " + " Titúlo:  \n" + doc[menor].getTitulo()+ " Valor " +doc[menor].getValor());
        
        System.out.println("O maior valor informado foi: " + " Titúlo:  \n" + doc[maior].getTitulo()+ " Valor " +doc[maior].getValor());
        
        System.out.println("A soma de todos os valores informados é: " + Vtotal);
        
        System.out.println("A média de todos os valores informados é: " + media);
    }
    
}
