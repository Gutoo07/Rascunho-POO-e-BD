package model;
/*Entidade Produto, correspondente a tabela Produto no DB*/
public class Produto {
    private int id;
    private double valor = 0.0;
    private String nome = "";

    public Produto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
