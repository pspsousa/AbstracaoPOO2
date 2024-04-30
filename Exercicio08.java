package criacao;
public class CadeiraGamer2 {

    // Crie em uma Classe externa com a abstração de uma cadeira gamer com todos os seus atributos e exiba os seus atributos.

    private String marca;
    private String modelo;
    private int alturaAjustavel;
    private boolean possuiApoioLombar;
    private boolean possuiApoioCabeca;

    public CadeiraGamer(String marca, String modelo, int alturaAjustavel, boolean apoioLombar, boolean apoioCabeca) {
        this.marca = marca;
        this.modelo = modelo;
        this.alturaAjustavel = alturaAjustavel;
        this.possuiApoioLombar = apoioLombar;
        this.possuiApoioCabeca = apoioCabeca;
    }

    public void exibirAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Altura Ajustável: " + alturaAjustavel + " cm");
        System.out.println("Possui Apoio Lombar: " + (possuiApoioLombar ? "Sim" : "Não"));
        System.out.println("Possui Apoio de Cabeça: " + (possuiApoioCabeca ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        CadeiraGamer minhaCadeira = new CadeiraGamer("HyperX", "HX-001", 120, true, true);
        minhaCadeira.exibirAtributos();
    }
}