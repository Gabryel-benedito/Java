package calculadora;


public class Calculo {
    
    double numero1;
    double numero2;
    String operador;

    
    
    public double getNumero1() {
        return numero1;
    }

    
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    
    
    public double getNumero2() {
        return numero2;
    }

    
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    
    
    public String getOperador() {
        return operador;
    }

    
    
    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    
    
    
    
    public double resultado() {
        double valor = 0;
        if(this.operador.equals("+")){
            valor = this.numero1 + this.numero2;
        }
        
        if(this.operador.equals("-")){
            valor = this.numero1 - this.numero2;
        }
        
        if(this.operador.equals("x")){
            valor = this.numero1 * this.numero2;
        }
        
        if(this.operador.equals("/")){
            
            if(this.numero1 == 0 || this.numero2 == 0){
                
                System.out.println("Não pode dividir por zero");
                return valor;
            }else{
                valor = this.numero1 / this.numero2;
            }
            
          
        }
        
        
        return valor;
    }
    
    
}
