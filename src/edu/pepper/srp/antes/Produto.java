package edu.pepper.srp.antes;

public class Produto {

    private Integer id;
    private String nome;
    private Double peso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void salvar() {
        /*
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa?useSSL=false", "root", "");
        Statement stmt = this.connection.createStatement();
        ...
        */
    }
}
