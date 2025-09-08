
package controle;

public class Documento {
    private int numero;
    private String titulo;
    private double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Documento(int numero, String titulo, double valor) {
        this.numero = numero;
        this.titulo = titulo;
        this.valor = valor;
    }

    
    
    
}
