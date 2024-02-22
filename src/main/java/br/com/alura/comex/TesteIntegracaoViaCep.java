package br.com.alura.comex;

import integracao.ViaCepResponse;
import integracao.ViaCepService;

public class TesteIntegracaoViaCep {
    public static void main(String[] args) {
        ViaCepService cepService = new ViaCepService();
        ViaCepResponse cepResponse = cepService.buscarCEP("02674090");
        System.out.println(cepResponse);
    }
}
