import java.util.Scanner;

/**
 * Classe principal que instancia quatro objetos da classe Computador.
 * Dois objetos são criados com o construtor default e dois com o construtor parametrizado.
 * Solicita dados ao usuário para preencher os atributos e exibe os valores com o método imprimir.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando quatro objetos de Computador
        Computador[] computadores = new Computador[4];

        // Preenchendo dados de dois computadores usando o construtor default
        for (int i = 0; i < 2; i++) {
            computadores[i] = new Computador();
            System.out.println("\n [" + (i + 1) + "] Preencha os dados do computador " + (i + 1) + " (Default):");
            System.out.print(" Marca: ");
            computadores[i].setMarca(scanner.nextLine());
            
            System.out.print(" Processador: ");
            computadores[i].setCpu(scanner.nextLine());
            
            System.out.print(" Memória RAM (em GB): ");
            computadores[i].setRam(scanner.nextInt());
            
            System.out.print(" Armazenamento (em GB): ");
            computadores[i].setDisk(scanner.nextInt());
            scanner.nextLine();

            System.out.print(" Sistema Operacional: ");
            computadores[i].setOS(scanner.nextLine());
        }

        for (int i = 2; i < 4; i++) {
            System.out.println(
                "\n [" + (i + 1) + "] Preencha os dados do computador " + (i + 1) + " (Parametrizado):");
            
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            
            System.out.print("Processador: ");
            String cpu = scanner.nextLine();
            
            System.out.print("Memória RAM (em GB): ");
            int ram = scanner.nextInt();
            
            System.out.print("Armazenamento (em GB): ");
            int disk = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Sistema Operacional: ");
            String OS = scanner.nextLine();

            computadores[i] = new Computador(marca, cpu, ram, disk, OS);
        }

        System.out.println("\n-------------------\n[*] Dados dos Computadores \n");
        for (int i = 0; i < 4; i++) {
            System.out.println(" [" + (i + 1) + "] Computador " + (i + 1));
            computadores[i].imprimir();
            System.out.println();
        }

        scanner.close();
    }
}
