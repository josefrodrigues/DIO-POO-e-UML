package iphone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReprodutorMusical implements Iphone{

    @Override
    public void menu() {
        System.out.println("Selecione a função: ");
        System.out.println("1. Tocar Música\n2. Pausar Música\n3. Selecionar Música");
        Scanner scanner = new Scanner(System.in);
        int funcaoSelecionada = scanner.nextInt();

        switch (funcaoSelecionada) {
            case 1:
                tocar();
            case 2:
                pausar();
            case 3:
                selecionarMusica();
        }
    }

    public void tocar() {
        System.out.println("Tocando música");
        System.exit(0);
    }

    public void pausar() {
        System.out.println("Música pausada.");
        System.exit(0);
    }

    public void selecionarMusica() {

        String[] nomesDasMusicas = {
                "1. Smoke In The Water",
                "2. Sultans of Swing",
                "3. Chove Chuva",
                "4. Sou + Você",
                "5. Oba, Lá Vem Ela",
                "6. Ms. Jackson",
        };

        List<String> listaMusicas = new ArrayList<>(Arrays.asList(nomesDasMusicas));
        System.out.println("Selecione uma música: ");
        listaMusicas.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        int musicaSelecionada = scanner.nextInt() - 1;

        if(musicaSelecionada >= 1 && musicaSelecionada <= listaMusicas.size()){
            System.out.println("Você selecionou: " + listaMusicas.get(musicaSelecionada));
            System.exit(0);
        } else {
            System.out.println("Número inválido, Por favor selecione um número existente na lista.");
        }
    }
}
