package cadastro;
import java.util.Scanner;


public class Cadastro {


    public static void main(String[] args) {
        Pessoa 
               registro1= new Pessoa(),
               registro2 = new Pessoa(),
               registro3 = new Pessoa();
        
        Scanner scanner = new Scanner(System.in);
       
            
        System.out.println("Digite o código do registro 1");
        registro1.setCodigo(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o nome da pessoa do registro 1");
        registro1.setNome(scanner.nextLine());

        System.out.println("Digite a idade da pessoa do registro 1");
        registro1.setIdade(scanner.nextInt());
            
            
            
                   
        System.out.println("\n\n Digite o código do registro 2");
        registro2.setCodigo(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o nome da pessoa do registro 2");
        registro2.setNome(scanner.nextLine());

        System.out.println("Digite a idade da pessoa do registro 2");
        registro2.setIdade(scanner.nextInt());
        scanner.nextLine();


        System.out.println("\n\n Digite o código do registro 3");
        registro3.setCodigo(scanner.nextInt());
        scanner.nextLine(); 

        System.out.println("Digite o nome da pessoa do registro 3");
        registro3.setNome(scanner.nextLine());

        System.out.println("Digite a idade da pessoa do registro 3");
        registro3.setIdade(scanner.nextInt());
        scanner.nextLine();
        
        
        if (registro1.getIdade() >= registro2.getIdade() && registro1.getIdade() >= registro3.getIdade()) {
            
            System.out.println(registro1.getNome() + " é a pessoa com maior idade dentre os 3 registros com " + registro1.getIdade() + " anos de idade");
               
        } else if (registro2.getIdade() >= registro1.getIdade() && registro2.getIdade() >= registro3.getIdade()) {
           
            System.out.println(registro2.getNome() + " é a pessoa com maior idade dentre os 3 registros com " + registro2.getIdade() + " anos de idade");
        
        } else {
            
            System.out.println(registro3.getNome() + " é a pessoa com maior idade dentre os 3 registros com " + registro3.getIdade() + " anos de idade");
        
        }

        
    }
    
}
