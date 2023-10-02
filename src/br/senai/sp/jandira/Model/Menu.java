package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    public void controleAnimais (){
        System.out.println("'-'-'--'-'-'--'-'-'--'-'-'--'-'-'");
        System.out.println("1 cadastar animais");
        System.out.println("2  listar animais");
        System.out.println("3  visitas");

        int optionUser = scanner.nextInt();
        switch (optionUser){
            case 1:
                Animail animail = new Animail();
                animail.cadastrarAnimais();
                break;
            case 2:

                break;
        }
    }
}
