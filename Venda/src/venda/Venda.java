package venda;
import java.util.Scanner;

public class Venda {


    public static void main(String[] args) {
        Produto
                item1 = new Produto() ,
                item2 = new Produto() ,
                item3 = new Produto() ,
                item4 = new Produto() ,
                item5 = new Produto() ;
        
        double valorFinal;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a descrição do produto 1");
        item1.setDescricao(scanner.nextLine());
        
        System.out.println("Informe o preço do produto");
        item1.setPreco(scanner.nextDouble());
        
        System.out.println("Informe a quantidade que será comprada desse produto");
        item1.setNumero(scanner.nextInt());
        scanner.nextLine();
        
        System.out.println("Informe a descrição do produto 2");
        item2.setDescricao(scanner.nextLine());

        System.out.println("Informe o preço do produto 2");
        item2.setPreco(scanner.nextDouble());

        System.out.println("Informe a quantidade que será comprada desse produto 2");
        item2.setNumero(scanner.nextInt());
        scanner.nextLine();

        
        System.out.println("Informe a descrição do produto 3");
        item3.setDescricao(scanner.nextLine());

        System.out.println("Informe o preço do produto 3");
        item3.setPreco(scanner.nextDouble());

        System.out.println("Informe a quantidade que será comprada desse produto 3");
        item3.setNumero(scanner.nextInt());
        scanner.nextLine();

        
        System.out.println("Informe a descrição do produto 4");
        item4.setDescricao(scanner.nextLine());

        System.out.println("Informe o preço do produto 4");
        item4.setPreco(scanner.nextDouble());

        System.out.println("Informe a quantidade que será comprada desse produto 4");
        item4.setNumero(scanner.nextInt());
        scanner.nextLine();

        
        System.out.println("Informe a descrição do produto 5");
        item5.setDescricao(scanner.nextLine());

        System.out.println("Informe o preço do produto 5");
        item5.setPreco(scanner.nextDouble());

        System.out.println("Informe a quantidade que será comprada desse produto 5");
        item5.setNumero(scanner.nextInt());
        scanner.nextLine();
        
        
        
        valorFinal = (item1.getNumero()* item1.getPreco() ) + (item2.getNumero() * item2.getPreco() )  + (item3.getNumero() * item3.getPreco()) +
                (item4.getNumero() * item4.getPreco()) + (item5.getNumero() * item5.getPreco()) ;
                
        
       System.out.printf("O valor total da compra é de R$ %.2f\n", valorFinal);
    }
    
}
