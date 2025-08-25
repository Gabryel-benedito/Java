package array;


public class Array {

    public static void main(String[] args) {
        String[] carros = {"ferrari", "fusca", "camaro", "uno"};
        
        
        //indice do array [0] [1] [2] [3]
        
        System.out.println("Taanho do array: " + carros.length);
        
        for(int i = 0; i < carros.length; i++){
            
            System.out.println("carros [" + i + "] = " + carros[i] );
        
        }
    }
    
}
