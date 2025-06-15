package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

@Command(name = "github-activity", mixinStandardHelpOptions = true, version = "github-activity 1.0",
        description = "Busca as atividades do Usuário.")
public class FetchInfo implements Callable<Integer> {
    @Parameters(index = "0", description = "Nome do usuário.")
    private String username;

    @Override
    public Integer call() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI(String.format("https://api.github.com/users/%s/events",username))).build();
        System.out.println("Buscando Dados do " + username + "!");
        HttpResponse<String> response = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        ArrayList<Activity> activities = mapper.readValue(response.body(),new TypeReference<ArrayList<Activity>>(){});
        Set<Activity> c = new HashSet<>(activities);
        c.forEach(k -> System.out.println(k.getType() + " to" + k.getRepo()));
//        activities.forEach(a -> );
        return 0;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new FetchInfo()).execute(args);
        System.exit(exitCode);
    }
}