package modelo;

public class Cliente extends Endereco {
    public String nome;
    public String cpf;
    public String email;
    public String profissao;
    public String telefone;
    public Endereco endereco;

    public void imprimirCliente() {
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nEmail: " + email + "\nProfissão: " + profissao
        + "\nTelefone: " + telefone + "\nEndereco: " + endereco + "\n");
    }
}
