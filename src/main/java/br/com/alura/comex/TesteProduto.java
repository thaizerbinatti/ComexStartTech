package br.com.alura.comex;

import modelo.Pedido;
import  modelo.Cliente;
import modelo.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();
        novoCliente.nome = "Patricia";
        novoCliente.cpf = "123.456.789-5";
        novoCliente.email = "juliane@gmail.com";
        novoCliente.profissao = "Contadora";
        novoCliente.telefone = "(11)3232-3434";
        novoCliente.endereco = null;

        Produto novoProduto = new Produto();
        novoProduto.setNome("Detergente");
        novoProduto.setDescricao("Produto usado para lavar louças");
        novoProduto.setPrecoUnitario(2.99);
        novoProduto.setQuantidade(8);

        Pedido novoPedido = new Pedido();
        novoPedido.setId(1);
        novoPedido.setCliente(novoCliente);
        novoPedido.setPreco(2.99);
        novoPedido.setQuantidade(8);

        System.out.println(novoPedido);
    }
}
