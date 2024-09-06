import java.util.Scanner;

/**
 * Classe instancia quatro objetos da classe Computador.
 * Dois objetos são criados com o construtor default e dois com o construtor com param.
 * Solicita dados ao usuário para preencher os atributos e exibe os valores com o método imprimir.
 */
public class Main {
    public static void main(String[] args) {

        Computador[] computadores = new Computador[4];

        for (int i = 0; i < 2; i++) {
            computadores[i] = new Computador();
            System.out.println("Preencha os dados do computador " + (i + 1) + " (Construtor Default):");

            System.out.print("Marca: ");
            computadores[i].setMarca(scanner.nextLine());
        }

        for (int i = 2; i < 4; i++) {
            System.out.println("Preencha os dados do computador " + (i + 1) + " (Construtor Parametrizado):");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            computadores[i] = new Computador(marca);
        }

        System.out.println("\nDados dos Computadores:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Computador " + (i + 1) + ":");
            computadores[i].imprimir();
            System.out.println();
        }

        scanner.close();
    }
}
