import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu.menu(scanner);
        // o metodo main só está servindo pra puxar a execução do Arquivo.java
        // note que o scanner foi iniciado antes de puxar a classe Arquivo e a variável scanner foi instanciada na chamada da classe
    }
}
