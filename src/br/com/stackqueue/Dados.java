package br.com.stackqueue;

import java.util.ArrayList;
import java.util.Scanner;

public class Dados {
    ArrayList array = new ArrayList<String>();
    Scanner in = new Scanner(System.in);

    private int set;

    void cli(int set) {
        if (set == 1) {
            System.out.println("[MODO STACK]\n\n" +
                    "=========COMANDOS=========\n" +
                    "exit   - Voltar ao menu\n" +
                    "show   - Exibir items da pilha\n" +
                    "remove - Desempilhar\n" +
                    "size   - Tamanho\n" +
                    "clear  - Limpar pilha (stack)\n");
        } else if (set == 2) {
            System.out.println("[MODO QUEUE]\n\n" +
                    "=========COMANDOS=========\n" +
                    "exit   - Voltar ao menu\n" +
                    "show   - Exibir items da fila\n" +
                    "remove - Desenfileirar\n" +
                    "size   - Tamanho\n" +
                    "clear  - Limpar fila (queue)\n");
        }

        String opt = "";

        while(!opt.equals("exit")) {
            System.out.print("Item > ");
            opt = in.next();

            array.add(opt);

            this.set = set;
            opcoes(opt);
        }
        array.remove(array.size() - 1);
    }

    void opcoes(String opt) {
        if (opt.equals("size")) {
            tamanhoArray();
        } else if (opt.equals("show")) {
            exibirArray();
        } else if (set == 1 && opt.equals("remove")) {
            desenpilhar();
        } else if (set == 2 && opt.equals("remove")) {
            desenfileirar();
        } else if (opt.equals("clear")) {
            array.clear();
        }
    }

    void tamanhoArray() {
        array.remove(array.size() - 1);
        System.out.println("Tamanho do array: " + array.size());
    }

    void exibirArray() {
        array.remove(array.size() - 1);
        String pilha = this.set == 1 ? "[STACK]" : "[QUEUE]";
        System.out.println(pilha);

        for (int i = array.size() - 1; i >= 0; i--) {
            System.out.println(array.get(i));
        }
    }

    void desenpilhar() {
        array.remove(array.size() - 1);
        array.remove(array.size() - 1);
    }

    void desenfileirar(){
        array.remove(array.size() - 1);
        array.remove(0);
    }
    //Não coloquei modificador de acesso, pois o default é public for package
}
