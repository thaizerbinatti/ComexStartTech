package br.com.alura.comex;
import java.time.LocalTime;
import java.util.ArrayList;

public class TestAula {
    public static void main(String[] args) {
        boolean despertador = true;
        LocalTime horararioCerto = LocalTime.of(6,0);
        LocalTime horarioAtual = LocalTime.now();
        String transporte = "onibus";

        while (despertador) {
            if (horarioAtual.equals(horararioCerto)) {
                System.out.println("Levantar e se arrumar");
            } else {
                System.out.println("Continuar dormindo");
            } break;
        }

//        while (itensVerificados) {
//            if (itensVerificados) {
//                System.out.println("Escolher meio de transporte");
//            } else if (itensNaoVerificados) {
//                System.out.println("Verifique se pegou todos os itens");
//            } break;
//        }
    }




}
