import java.util.Scanner;

public class Menu {
    public static void menu(Scanner scanner) {
        int opcao;
        do {
            // menu simples feito a partir de um loop do-while... fica em loop enquanto a opção que o usuário digitar for diferente que 5
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
                    // chama a execução do Script que cria a assinatura padrão com todos os dados
                    Variaveis vars1 = new Variaveis();
                    Script1.script(vars1);
                    break;

                case 2:
                    // executa o script que cria a assinatura sem o ramal
                    Variaveis vars2 = new Variaveis();
                    Script2.script(vars2);
                    break;

                case 3:
                    // executa o script que cria a assinatura sem telefone
                    Variaveis vars3 = new Variaveis();
                    Script3.script(vars3);
                    break;

                case 4:
                    // executa o script que cria a assinatura sem ramal/telefone
                    Variaveis vars = new Variaveis();
                    Script.script(vars);
                    break;

                case 5:
                    //entra no parametro do while que encerra o loop quando o usuário digita o 5
                    System.out.println("\nEncerrando...");
                    break;

                default:
                    System.out.println("\nOPCAO  INVÁLIDA.");
                }
            } while (opcao != 5);
            // esse while é quem diz como o loop vai funcionar, nesse caso ficará em loop enquanto a opcao for diferente que 5 (opcao != 5)... quando a opcao for 5 (opcao = 5) o loop se encerra
    }
}
