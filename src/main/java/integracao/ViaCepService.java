package integracao;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {
    public ViaCepResponse buscarCEP(String cep) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/"  + cep + "/json/"))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            return new Gson().fromJson(json, ViaCepResponse.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
