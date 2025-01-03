public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }

    public void ligar (String numero) {
        System.out.println("ligando para o número "+ numero);
    }

    public void atender () {
        System.out.println("Atendendo telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Acessando o site " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página ");
    }
}
