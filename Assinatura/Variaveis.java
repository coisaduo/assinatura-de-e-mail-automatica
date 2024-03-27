import java.util.Scanner;

public class Variaveis {
    public String nome;
    public String cargo;
    public String numero;
    public String ramal;
    public String html;

    public Variaveis(){
        this.nome = solicitarValor("nome");
        this.cargo = solicitarValor("cargo");
        this.numero = solicitarValor("numero");
        this.ramal = solicitarValor("ramal");
        this.html = solicitarValor("html");
        // fazendo com que o metodo solicitarValor defina o valor das variáveis
    }

    private String solicitarValor(String nomeVariavel){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o " + nomeVariavel + " do colaborador: ");
        return scanner.nextLine();
    }
}
