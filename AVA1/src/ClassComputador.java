/**
 * Classe que representa um Computador.
 * Possui cinco atributos: marca, 2, 3, 4, e 5. // TODO: Colocar os atributos corretamente
 * Contém dois construtores e métodos de acesso (setters e getters), além de um método para imprimir os atributos.
 */
public class Computador {
    
    // Atributos
    private String marca;

    // Construtor default
    public Computador() {
        this.marca = "Desconhecida";
    }

    // Construtor com parâmetros
    public Computador(String marca) {
        this.marca = marca;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método para imprimir os atributos
    public void imprimir() {
        System.out.println("Marca: " + this.marca);
    }
}
