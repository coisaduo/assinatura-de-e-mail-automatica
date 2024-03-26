import java.util.Scanner;

public class Menu {
    public static void menu(Scanner scanner) {
        int opcao;
        do {
            System.out.println("MENU");
            System.out.println("\nQue tipo de ASSINATURA você deseja criar?");
            System.out.println("\n1 - Padrão");
            System.out.println("\n2 - Sem RAMAL");
            System.out.println("\n3 - Sem TELEFONE");
            System.out.println("\n4 - Sem RAMAL/TELEFONE");
            System.out.println("\n5 - SAIR");
            System.out.println("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // chama a execução do Script que cria a assinatura sem ramal e sem numero
                    Variaveis vars1 = new Variaveis();
                    Script1.script(vars1);
                    break;

                case 2:
                    Variaveis vars2 = new Variaveis();
                    Script2.script(vars2);
                    break;

                case 3:
                    Variaveis vars3 = new Variaveis();
                    Script3.script(vars3);
                    break;

                case 4:
                    Variaveis vars = new Variaveis();
                    Script.script(vars);
                    break;

                case 5:
                    System.out.println("\nEncerrando...");
                    break;

                default:
                    System.out.println("\nOPCAO  INVÁLIDA.");
                }
            } while (opcao != 5);
    }
}
