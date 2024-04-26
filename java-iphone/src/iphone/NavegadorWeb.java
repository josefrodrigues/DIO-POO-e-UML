package iphone;

import java.util.Scanner;

public class NavegadorWeb implements Iphone{
    public void menu(){
        System.out.println("Selecione a função: ");
        System.out.println("1. Exibir Página\n2. Adicionar Nova Aba\n3. Atualizar Página");
        Scanner scanner = new Scanner(System.in);
        int funcaoSelecionada = scanner.nextInt();

        switch (funcaoSelecionada) {
            case 1:
                exibirPagina();
            case 2:
                addNovaAba();
            case 3:
                atualizarPagina();
        }
    }

    void exibirPagina(){
        System.out.println("Exibindo Página");
        System.exit(0);
    }

    void addNovaAba() {
        System.out.println("Adicionando nova Aba");
        System.exit(0);
    }

    void atualizarPagina() {
        System.out.println("Atualizando página");
        System.exit(0);
    }
}
