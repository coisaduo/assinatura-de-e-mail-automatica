import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
    public static void escreverArquivo(String conteudo, String caminhoDiretorio, String nomeArquivo) {
        try {
            FileWriter arquivo = new FileWriter(caminhoDiretorio + "/" + nomeArquivo + ".html");
            PrintWriter gravarArquivo = new PrintWriter(arquivo);

            gravarArquivo.println(conteudo);

            arquivo.close();
            System.out.println("Script HTML criado com sucesso em " + caminhoDiretorio + "/" + nomeArquivo + ".html!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo.");
            e.printStackTrace();
        }
    }
}
