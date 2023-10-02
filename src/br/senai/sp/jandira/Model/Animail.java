package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Animail {
    // nesta classe animal eu vou cadastra os animais.
    // fazer um sistema  de auto incremente na id
     // fazer herança e polimorfirmos no projeto
    String nome, sexo, especie;
    int id, idade; // indentificador unico do animal;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarAnimais(){
        System.out.println("---------- cadastar animais -------");
        System.out.println("qual nome do animal?");
        nome = scanner.next();
        System.out.println("qual e a idade do animal");
        idade = scanner.nextInt();
        System.out.println("qual especie do animal?");
        especie = scanner.next();
        System.out.println("qual sexo do animal?");
        sexo = scanner.next();
    }

    public void listarAnimais(){
        System.out.println("lista de animais");
        System.out.println("especie: " + especie);
        System.out.println("Nome: " + nome);
        System.out.println("sexo: " + sexo);
        System.out.println("idade: " + idade);
    }



}
