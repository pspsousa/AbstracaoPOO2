package criacao;
public class Bicicleta2 {

//Crie em uma Classe externa com a abstração de um bicicleta com todos os seus atributos e exiba os seus atributos.

    private String marca;
    private String modelo;
    private int numeroMarchas;
    private boolean possuiFreioDisco;
    private String cor;

    public Bicicleta(String marca, String modelo, int numeroMarchas, boolean possuiFreioDisco, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroMarchas = numeroMarchas;
        this.possuiFreioDisco = possuiFreioDisco;
        this.cor = cor;
    }

    public void exibirAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de marchas: " + numeroMarchas);
        System.out.println("Possui freio a disco? " + (possuiFreioDisco ? "Sim" : "Não"));
        System.out.println("Cor: " + cor);
    }

    public static void main(String[] args) {
        Bicicleta minhaBicicleta = new Bicicleta("Caloi", "Explorer", 21, true, "Vermelha");
        minhaBicicleta.exibirAtributos();
    }
}