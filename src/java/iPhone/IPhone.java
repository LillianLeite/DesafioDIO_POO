package java.iPhone;

public class IPhone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{

        public void ligar () {
                System.out.println("REALIZANDO LIGAÇÃO.");
        }
        public void atender () {
                System.out.println("ATENDENDO LIGAÇÃO.");
        }
        public void iniciarCorreioVoz () {
                System.out.println("CORREIO DE VOZ INICIADO.");
        }
        public void exibirPagina () {
                System.out.println("EXIBIMDO PÁGINA WEB.");
        }
        public void adicionarNovaAba () {
                System.out.println("ABRINDO NOVA ABA WEB.");
        }
        public void atualizarPagina () {
                System.out.println("ATUALIZANDO PÁGINA.");
        }
        public void tocarMusica () {
                System.out.println("REPRODUZINDO ÁUDIO.");
        }
        public void pausarMusica () {
                System.out.println("PAUSANDO REPRODUÇÃO DE ÁUDIO.");
        }
        public void selecionarMusica () {
                System.out.println("SELECIONE UMA MÚSICA DA FAIXA DE ÁUDIO.");
        }

        public static void main(String[] args) {
                IPhone iphone = new IPhone();

                iphone.ligar();
                iphone.atender();
                iphone.iniciarCorreioVoz();
                iphone.exibirPagina();
                iphone.adicionarNovaAba();
                iphone.atualizarPagina();
                iphone.selecionarMusica();
                iphone.tocarMusica();
                iphone.pausarMusica();
        }
}