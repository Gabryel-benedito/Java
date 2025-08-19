package empregadoteste;
import java.util.Scanner;


public class EmpregadoTeste {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int q;
        
        System.out.println("Digite quantos empregados serão");
        q = scanner.nextInt();
        
        Empregado[] empregados = new Empregado[q]; 
        
        for(int i = 0; i < empregados.length; i++){
            empregados[i] = new Empregado();
        
            System.out.println("Digite o codigo do(a) empregado ");
            empregados[i].setCodigo(scanner.nextInt());
            scanner.nextLine();
            
            
            System.out.println("Digite o nome do(a) empregado com o codigo " + empregados[i].getCodigo());
            empregados[i].setNome(scanner.nextLine());
            
            System.out.println("Digite também o sobrenome");
            empregados[i].setSobrenome(scanner.nextLine());
            
            System.out.println("Digite o salario mensal de " + empregados[i].getNome() + " " + empregados[i].getSobrenome());
            empregados[i].setSalarioMensal(scanner.nextDouble());
            
        
        }
        
        
         for(int i = 0; i < empregados.length; i++ ){
             
                System.out.println("\n\n\n Infomações dos empregados: \n\n"
                        + "nome: " + empregados[i].getNome() + " " + empregados[i].getSobrenome() + "\n"
                        + "código do empregado: " + empregados[i].getCodigo() + "\n"
                        + "salárioc mensal: " + empregados[i].getSalarioMensal() + "\n"
                        + "Salário anual: " + empregados[i].getSalarioMensal()*12 + "\n\n"
                );
         }
        
    }  
}
