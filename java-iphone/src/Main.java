import iphone.AparelhoTelefonico;
import iphone.Iphone;
import iphone.NavegadorWeb;
import iphone.ReprodutorMusical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorWeb navegador = new NavegadorWeb();


        System.out.println("Bem vindo ao seu iPhone, selecione qual função usar: ");
        System.out.println("1. Reprodutor Musical.\n2. Aparelho Telefonico.\n3. Navegador Web.");
        Scanner scanner = new Scanner(System.in);
        int funcaoSelecionada = scanner.nextInt();

        switch (funcaoSelecionada) {
            case 1:
                ((Iphone) reprodutor).menu();
            case 2:
                ((Iphone) telefone).menu();
            case 3:
                ((Iphone) navegador).menu();
        }
    }
}