package loja;


public class Venda {
    private int codigo;
    private String descricao;
    private double valor;
    private double quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Venda(int codigo, String descricao, double valor, double quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    
    
}
