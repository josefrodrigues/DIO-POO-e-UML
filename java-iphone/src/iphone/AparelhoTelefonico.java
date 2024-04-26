package iphone;

import java.util.Scanner;

public class AparelhoTelefonico implements Iphone{

    @Override
    public void menu() {
        System.out.println("Selecione a função: ");
        System.out.println("1. Realizar Ligação\n2. Atender Ligação\n3. Iniciar Correio de Voz");
        Scanner scanner = new Scanner(System.in);
        int funcaoSelecionada = scanner.nextInt();

        switch (funcaoSelecionada) {
            case 1:
                ligar();
            case 2:
                atender();
            case 3:
                iniciarCorreioDeVoz();
        }
    }

    void ligar(){
        System.out.println("Realizando ligação...");
        System.exit(0);
    }

    void atender() {
        System.out.println("Atendendo ligação.");
        System.exit(0);
    }

    void iniciarCorreioDeVoz() {
        System.out.println("Iniciando serviço de correio de voz.");
        System.exit(0);
    }
}
