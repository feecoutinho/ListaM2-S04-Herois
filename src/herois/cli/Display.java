package herois.cli;

import herois.model.Heroi;
import herois.model.Personagem;
import herois.model.Vilao;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Display {

    public void exibirMenu() {
        System.out.println("** MENU **");
        System.out.println();
        System.out.println("1 - Cadastrar Herói");
        System.out.println("2 - Cadastrar Vilão");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");
        System.out.println();
    }

    public int obterOpcao() {
        System.out.println("Informe a opção desejada:");
        Scanner scanner = new Scanner(System.in);
        try {
            int op = scanner.nextInt();
            return op;
        } catch (InputMismatchException e) {
            return -1;
        }

    }

    public void exibirMensagem(String mensagem) {
        System.out.println();
        System.out.println("==> " + mensagem);
        System.out.println();
    }

    public Heroi obterDadosHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder: ");
        String superpoder = scanner.nextLine();
        System.out.println("Informe o nome na vida real: ");
        String nomeVidaReal = scanner.nextLine();
        return new Heroi(nome, superpoder, nomeVidaReal);
    }

    public Vilao obterDadosVilao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder: ");
        String superpoder = scanner.nextLine();
        System.out.println("Informe o tempo de prisão: ");
        int tempoPrisao = scanner.nextInt();
        return new Vilao(nome, superpoder, tempoPrisao);
    }

    public void listar(List<Personagem> personagens) {
        Collections.sort(personagens); // pode ser assim tbm: personagens.stream().sorted();
        System.out.println("Listando...");
        personagens.forEach(p -> System.out.println(p));
//        personagens.forEach(System.out::println);  // mesma coisa
        System.out.println();
    }
}
