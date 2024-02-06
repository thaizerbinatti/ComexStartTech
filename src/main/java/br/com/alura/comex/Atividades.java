package br.com.alura.comex;

import modelo.Cliente;
import modelo.Endereco;
import modelo.Produto;

public class Atividades {
    public static void main(String[] args) {

        //Atividade 2
        Produto produto1 = new Produto();
        produto1.setNome("Detergente");
        produto1.setDescricao("Produto usado para lavar louças");
        produto1.setPrecoUnitario(2.99);
        produto1.setQuantidade(8);

        Produto produto2 = new Produto();
        produto2.setNome("Sabão em pó");
        produto2.setDescricao("Usado para lavar roupas");
        produto2.setPrecoUnitario(23.99);
        produto2.setQuantidade(6);


        // Atividade 3
        if (produto1.equals(produto2)) {
            System.out.println("Os produtos são iguais! \n");
        } else {
            System.out.println("Os produtos são diferentes! \n");
        }

        //Atividade 4
        produto1.imprimirProdutos();
        produto2.imprimirProdutos();

        // Atividade 5

        Endereco endereco1 = new Endereco();
        endereco1.bairro = "Cachoeirinha";
        endereco1.cidade = "São Paulo";
        endereco1.complemento = "Brasilândia";
        endereco1.estado = "SP";
        endereco1.rua = "Avenida Penha Brasil";
        endereco1.numero = 43;

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Juliane";
        cliente1.cpf = "123.456.789-5";
        cliente1.email = "juliane@gmail.com";
        cliente1.profissao = "Contadora";
        cliente1.telefone = "(11)3232-3434";
        cliente1.endereco = endereco1;


        cliente1.imprimirCliente();
        endereco1.imprimirEndereco();
    }
}
