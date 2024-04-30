package criacao;
public class Celular {

//Crie dentro de uma Classe a abstração de um celular com todos os seus atributos e exiba os seus atributos.

    private String marca;
    private String modelo;
    private int capacidadeBateria;
    private boolean possuiCamera;
    private boolean suporta4G;

    public Celular(String marca, String modelo, int capacidadeBateria, boolean possuiCamera, boolean suporta4G) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.possuiCamera = possuiCamera;
        this.suporta4G = suporta4G;
    }

    public void exibirAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade da Bateria: " + capacidadeBateria + " mAh");
        System.out.println("Possui Câmera: " + (possuiCamera ? "Sim" : "Não"));
        System.out.println("Suporta 4G: " + (suporta4G ? "Sim" : "Não"));
    }

    public class DetalhesCelular {
        private String sistemaOperacional;
        private int armazenamentoInterno;

        public DetalhesCelular(String sistemaOperacional, int armazenamentoInterno) {
            this.sistemaOperacional = sistemaOperacional;
            this.armazenamentoInterno = armazenamentoInterno;
        }

        public String getSistemaOperacional() {
            return sistemaOperacional;
        }

        public int getArmazenamentoInterno() {
            return armazenamentoInterno;
        }
    }

    public static void main(String[] args) {
        Celular meuCelular = new Celular("Samsung", "Galaxy S21", 4000, true, true);
        meuCelular.exibirAtributos();

        Celular.DetalhesCelular detalhes = meuCelular.new DetalhesCelular("Android", 128);
        System.out.println("\nDetalhes Internos:");
        System.out.println("Sistema Operacional: " + detalhes.getSistemaOperacional());
        System.out.println("Armazenamento Interno: " + detalhes.getArmazenamentoInterno() + " GB");
    }
}