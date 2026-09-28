import java.util.Scanner;

public class ExercicioModulo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BEM VINDO AO SISTEMA! ===");

        int opcao;

        // O laço do-while garante que o menu principal se repita até o usuário decidir sair
        do {
            System.out.println("\n=== MENU DE OPÇÕES ===");
            System.out.println("1. Calcular Tabuada (Continuar)");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            // Lógica condicional para tratar a escolha do menu
            if (opcao == 1) {
                // --- CÁLCULO DA TABUADA (Executa toda vez que escolhe a opção 1) ---
                System.out.print("\nDigite um número para ver sua tabuada: ");
                int numero = scanner.nextInt();

                int multiplicador = 1; // Inicializa o contador do loop da tabuada

                // O bloco while calcula e exibe a tabuada de 1 a 10
                while (multiplicador <= 10) {
                    int resultado = numero * multiplicador;
                    System.out.println(numero + " x " + multiplicador + " = " + resultado);
                    multiplicador++;
                }

            } else if (opcao == 2) {
                System.out.println("\nObrigado por usar o programa! Até logo.");
            } else {
                System.out.println("\nOpção inválida! Tente novamente com 1 ou 2.");
            }

        } while (opcao != 2);

        scanner.close();
    }
}