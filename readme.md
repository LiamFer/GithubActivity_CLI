

# 📊 GitHub User Activity CLI

Projeto CLI para buscar e exibir no terminal as atividades recentes de qualquer usuário do GitHub.

> Desafio resolvido do [roadmap.sh](https://roadmap.sh/projects/github-user-activity)

## 💡 Sobre o Projeto

Este projeto consiste em um utilitário de linha de comando simples que consome a [GitHub API](https://api.github.com) para buscar as atividades públicas recentes de um usuário e exibi-las no terminal de forma organizada.

Foi desenvolvido em **Java**, utilizando as bibliotecas **Picocli** para o CLI e **Jackson** para manipulação de JSON.

---

## 🚀 Como Executar

### Pré-requisitos
- Java 11+ instalado.
- Terminal configurado com Java no `PATH`.

### 1. Clone o projeto

```bash
git clone https://github.com/seu-usuario/github-activity-cli.git
cd github-activity-cli
````

### 2. Compile o projeto

```bash
javac -cp "libs/*" -d out src/org/example/*.java
```

### 3. Rode com o script `.bat` (Windows)

Crie um arquivo chamado `g.bat` com o conteúdo abaixo:

```bat
@echo off
java -cp "out;libs/*" org.example.FetchInfo %*
```

Depois, no terminal:

```bash
g.bat github-activity "liamfer"
```

Exemplo:

```bash
g.bat github-activity "liamfer"
```

---

## 🧪 Exemplo de Saída

```
Buscando Dados do kamranahmedse!
Fez 6 pushes no repositório LiamFer/TaskTracker_CLI!
Fez 1 pushes no repositório LiamFer/LiamFer!
Tornou o repositório LiamFer/TaskTracker_CLI público (evento registrado 1 vezes)!
Fez 17 pushes no repositório LiamFer/Javapedia!
Criou 2 item(s) no repositório LiamFer/GithubActivity_CLI!
Fez 3 pushes no repositório LiamFer/GithubActivity_CLI!
```

---

## ⚙️ Tecnologias Utilizadas

* Java 17
* [Picocli](https://picocli.info/)
* [Jackson Databind](https://github.com/FasterXML/jackson-databind)
* Java HttpClient (java.net.http)

---

## 📎 Funcionalidades

* Buscar eventos públicos de qualquer usuário do GitHub.
* Contar e agrupar tipos de eventos como `PushEvent`, `CreateEvent`, `PublicEvent`, etc.
* Exibir em formato legível, como:

    * `Fez 3 pushes no repositório`
    * `Tornou repositório público`
    * `Criou uma branch`, etc.
* Trata erros como usuário inválido ou falha de conexão.

---

## 📈 Melhorias Futuras

* Filtrar por tipo de evento.
* Caching local para evitar requisições repetidas.
* Exibir data dos eventos.
* Adicionar suporte para mais endpoints da API do GitHub.

---

## 📄 Licença

Este projeto é de uso educacional e segue as diretrizes do desafio [GitHub User Activity](https://roadmap.sh/projects/github-user-activity) do Roadmap.sh.


