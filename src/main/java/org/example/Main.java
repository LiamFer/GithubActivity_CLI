package org.example;


import picocli.CommandLine;
import picocli.CommandLine.Command;


@Command(
        name = "github-activity",
        mixinStandardHelpOptions = true,
        version = "github-activity 1.0",
        description = "Aplicativo de atividades do Github no terminal.",
        subcommands = {FetchInfo.class}
)
public class Main implements Runnable {
    @Override
    public void run() {
        System.out.println("Use um comando!");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Main()).execute(args);
        System.exit(exitCode);
    }
}




