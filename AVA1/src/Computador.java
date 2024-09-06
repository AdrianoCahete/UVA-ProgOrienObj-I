/**
 * Classe que representa um Computador.
 * Possui cinco atributos: marca, cpu, ram, disk, e os.
 * Contém dois construtores e métodos de acesso (setters e getters), além de um método para imprimir os atributos.
 */

public class Computador {
    
    // Atributos
    private String marca;
    private String cpu;
    private int ram;
    private int disk;
    private String OS;

    // Construtor default (sem parâmetros)
    public Computador() {
        this.marca = "Desconhecida";
        this.cpu = "Desconhecido";
        this.ram = 0;
        this.disk = 0;
        this.OS = "Desconhecido";
    }

    // Construtor com parâmetros
    public Computador(String marca, String cpu, int ram, int disk, String OS) {
        this.marca = marca;
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
        this.OS = OS;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    // Método para imprimir os atributos
    public void imprimir() {
        System.out.println(" Marca: " + this.marca);
        System.out.println(" CPU: " + this.cpu);
        System.out.println(" RAM: " + this.ram + " GB");
        System.out.println(" Disk: " + this.disk + " GB");
        System.out.println(" Sistema Operacional: " + this.OS);
    }
}
