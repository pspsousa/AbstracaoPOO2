package criacao;
abstract class Computador2 {

//Crie em uma Classe externa com a abstração de um computador com todos os seus atributos e exiba os seus atributos.

    private String marca;
    private String modelo;
    private int capacidadeRAM;
    private int capacidadeArmazenamento;
    private boolean possuiSSD;

    public Computador(String marca, String modelo, int capacidadeRAM, int capacidadeArmazenamento, boolean possuiSSD) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeRAM = capacidadeRAM;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.possuiSSD = possuiSSD;
    }

    public void exibirAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade de RAM: " + capacidadeRAM + " GB");
        System.out.println("Capacidade de Armazenamento: " + capacidadeArmazenamento + " GB");
        System.out.println("Possui SSD? " + (possuiSSD ? "Sim" : "Não"));
    }

    public abstract void ligar();
    public abstract void desligar();
}

class Desktop extends Computador {
    public Desktop(String marca, String modelo, int capacidadeRAM, int capacidadeArmazenamento, boolean possuiSSD) {
        super(marca, modelo, capacidadeRAM, capacidadeArmazenamento, possuiSSD);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o desktop...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o desktop...");
    }

    public static void main(String[] args) {
        Desktop meuDesktop = new Desktop("Dell", "Inspiron", 8, 1000, true);
        meuDesktop.exibirAtributos();
        meuDesktop.ligar();
        meuDesktop.desligar();
    }
}