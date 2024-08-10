package iphone;

public class Main {
    public static void main(String[] args) {
        Iphone smartphone = new Iphone();

        smartphone.selecionarMusica("Farol das Estrelas");
        smartphone.tocar();
        smartphone.pausar();
        System.out.println("*************************");

        smartphone.ligar("9123456789");
        smartphone.tocar();
        smartphone.atender();
        System.out.println("*************************");

        smartphone.adicionarNovaAba();
        smartphone.exibirPagina("web.dio.ne");
        smartphone.atualizarPagina();
    }
}
