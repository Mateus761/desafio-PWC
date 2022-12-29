package com.application;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Endereco endereco = new Endereco();

        // Desafio 1 A

        System.out.println("Desafio 1 A");

        System.out.println(endereco.desafio1AB("Miritiba 339"));

        System.out.println("Desafio 1A) Digite um endereço:");

        String endereco1A = sc.nextLine();

        endereco.setNomeENumeroRua(endereco1A);

        System.out.println(endereco.desafio1AB(endereco.getNomeENumeroRua()));

        // Desafio 1 B

        System.out.println();

        System.out.println("Desafio 1 B");

        System.out.println(endereco.desafio1AB("Babaçu 500"));

        System.out.println("Desafio 1B) Digite um endereço:");

        String endereco1B = sc.nextLine();

        endereco.setNomeENumeroRua(endereco1B);

        System.out.println(endereco.desafio1AB(endereco.getNomeENumeroRua()));

        // Desafio 1 C

        System.out.println();

        System.out.println("Desafio 1 C");

        System.out.println(endereco.desafio1C("Cambuí 804B"));

        System.out.println("Desafio 1C) Digite um endereço:");

        String endereco1C = sc.nextLine();

        endereco.setNomeENumeroRua(endereco1C);

        System.out.println(endereco.desafio1C(endereco.getNomeENumeroRua()));

        // Desafio 2 A

        System.out.println();

        System.out.println("Desafio 2 A");

        System.out.println(endereco.desafio2A("Rio Branco 23"));

        System.out.println("Desafio 2A) Digite um endereço:");

        String endereco2A = sc.nextLine();

        endereco.setNomeENumeroRua(endereco2A);

        System.out.println(endereco.desafio2A(endereco.getNomeENumeroRua()));

        // Desafio 2 B

        System.out.println();

        System.out.println("Desafio 2 B");

        System.out.println(endereco.desafio2B("Quirino dos Santos 23 b"));

        System.out.println("Desafio 2B) Digite um endereço:");

        String endereco2B = sc.nextLine();

        endereco.setNomeENumeroRua(endereco2B);

        System.out.println(endereco.desafio2B(endereco.getNomeENumeroRua()));

        // Desafio 3 A

        System.out.println();

        System.out.println("Desafio 3 A");

        System.out.println(endereco.desafio3A("4, Rue de La République"));

        System.out.println("Desafio 3A) Digite um endereço:");

        String endereco3A = sc.nextLine();

        endereco.setNomeENumeroRua(endereco3A);

        System.out.println(endereco.desafio3A(endereco.getNomeENumeroRua()));

        // Desafio 3 B

        System.out.println();

        System.out.println("Desafio 3 B");

        System.out.println(endereco.desafio3B("100 Broadway Av"));

        System.out.println("Desafio 3B) Digite um endereço:");

        String endereco3B = sc.nextLine();

        endereco.setNomeENumeroRua(endereco3B);

        System.out.println(endereco.desafio3B(endereco.getNomeENumeroRua()));

        // Desafio 3 C

        System.out.println();

        System.out.println("Desafio 3 C");

        System.out.println(endereco.desafio3C("Calle Sagasta, 26"));

        System.out.println("Desafio 3C) Digite um endereço:");

        String endereco3C = sc.nextLine();

        endereco.setNomeENumeroRua(endereco3C);

        System.out.println(endereco.desafio3C(endereco.getNomeENumeroRua()));

        // Desafio 3 D

        System.out.println();

        System.out.println("Desafio 3 D");

        System.out.println(endereco.desafio3D("Calle 44 No 1991"));

        System.out.println("Desafio 3D) Digite um endereço:");

        String endereco3D = sc.nextLine();

        endereco.setNomeENumeroRua(endereco3D);

        System.out.println(endereco.desafio3D(endereco.getNomeENumeroRua()));
    }

}
