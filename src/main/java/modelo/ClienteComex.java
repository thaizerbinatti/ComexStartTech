package modelo;

public class ClienteComex {
    public String nome;
    public String cpf;
    public String email;
    public String profissao;
    public String telefone;

    public ClienteComex(String nome, String cpf, String email, String profissao, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.profissao = profissao;
        this.telefone = telefone;
    }
}