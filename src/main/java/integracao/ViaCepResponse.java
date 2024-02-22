package integracao;

public class ViaCepResponse {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    @Override
    public String toString() {
        return "Endereço:{" +
                "CEP:'" + cep + '\n' +
                ", Logradouro:'" + logradouro + '\n' +
                ", Complemento:'" + complemento + '\n' +
                ", Bairro:'" + bairro + '\n' +
                ", Localidade:'" + localidade + '\n' +
                ", UF:" + uf +
                '}';
    }
}
