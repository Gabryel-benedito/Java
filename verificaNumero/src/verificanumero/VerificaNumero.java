package verificanumero;
    import java.util.Scanner;

    public class VerificaNumero {

        public static void main(String[] args) {
            int dado, v;
            Scanner teclado = new Scanner(System.in);

            do{
                v = 0;
                System.out.println("Digite um número inteiro (digite zero para encerrar)");
                dado = teclado.nextInt();


                if(dado % 2 == 0){
                    System.out.println("O número " + dado + " é par ");

                }else{
                    System.out.println("O número " + dado + " é impar ");

                }



                for(int i = dado; i >= 1; i--){
                        

                        if(dado % i == 0){
                            v++ ; 

                            if(v >= 3){
                                System.out.println("O número não é primo");

                                i = 0;
                            }
                        }
                    }

                
                
                if(v <= 2){
                    System.out.println("O número " + dado + " é primo");
                }


            }while( dado != 0);
        }

    }
