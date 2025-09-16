package loja;
import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe quantos registros irão ser feitos");
        
        
        Venda[] notas = new Venda[sc.nextInt()];
        
      
        
        
        for(int i = 0; i < notas.length; i++){
        
            double val, quant;
            String desc;
            int cod;
            
            System.out.println("Informe o código do produto: ");
            cod = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Informe a descricão do produto: ");
            desc = sc.nextLine();
            
            System.out.println("Informe o valor do produto: ");
            val = sc.nextDouble();
           
            System.out.println("Informe a quantidade à ser adquirida do produto: ");
            quant = sc.nextDouble();
            
            notas[i] = new Venda(cod, desc, val, quant);
            
        }
        
        double mediaVal, mediaQuant, somaV = 0, somaQ = 0;
        int maiorVal = 0, menorQ = 0;
        
        for(int i = 0; i < notas.length; i++){
        
            somaV += notas[i].getValor();
            somaQ += notas[i].getQuantidade() ;
            
            
            if(notas[i].getValor() > notas[maiorVal].getValor()){
                maiorVal = i;
            
            }
            
            if(notas[i].getQuantidade() < notas[menorQ].getQuantidade()){
                menorQ = i;
            
            }
        }
        
        mediaQuant = somaQ / notas.length;
        mediaVal = somaV / notas.length;
        
        System.out.println("A média de quantidades adquiridas é de: " + mediaQuant);
        System.out.println("A média de preços dos produtos é de: " + mediaVal);
        System.out.println("O código do produto de maior valor é: " + notas[maiorVal].getCodigo());
        System.out.println("A descrição do produto de menor Quantidade é: " + notas[menorQ].getDescricao());
        
        
        
    }
    
}

