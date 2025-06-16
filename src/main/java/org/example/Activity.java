package org.example;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Activity (String type,Repo repo){
    public String getRepo() {
        return repo.name();
    }

    public void report(int times){
        switch (type){
            case "PushEvent" -> System.out.printf("Fez %d pushes no repositório %s!\n",times,getRepo());
            case "CreateEvent" -> System.out.printf("Criou %d item(s) no repositório %s!\n",times,getRepo());
            case "PublicEvent" -> System.out.printf("Tornou o repositório %s público (evento registrado %d vezes)!\n",getRepo(),times);
            case "IssuesEvent" -> System.out.printf("Interagiu com %d issues no repositório %s!\n",times,getRepo());
            case "WatchEvent" -> System.out.printf("Deu %d estrela no repositório %s!\n",times,getRepo());
            case "ForkEvent" -> System.out.printf("Fez %d fork(s) do repositório %s!\n",times,getRepo());
        }
    }

}
