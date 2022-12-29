package com.application;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Endereco {

    private String nomeENumeroRua;

    public Endereco() {

    }

    public Endereco(String nomeENumeroRua) {
        this.nomeENumeroRua = nomeENumeroRua;
    }

    public String getNomeENumeroRua() {
        return nomeENumeroRua;
    }

    public void setNomeENumeroRua(String nomeENumeroRua) {
        this.nomeENumeroRua = nomeENumeroRua;
    }

    public String desafio1AB(String nomeENumeroRua) {

        String[] rua = nomeENumeroRua.split(" ");

        nomeENumeroRua = rua[0] + ", " + rua[1];

        return nomeENumeroRua;
    }

    public String desafio1C(String nomeENumeroRua) {

        String[] rua = nomeENumeroRua.split(" ");

        nomeENumeroRua = rua[0] + ", " + rua[1];

        return nomeENumeroRua.replace("804B", "123B");
    }

    public String desafio2A(String nomeENumeroRua) {

        String[] rua = nomeENumeroRua.split(" ");

        nomeENumeroRua = rua[0] + " " + rua[1] + ", " + rua[2];

        return nomeENumeroRua;
    }

    public String desafio2B(String nomeENumeroRua) {

        String[] rua = nomeENumeroRua.split(" ");

        nomeENumeroRua = rua[0] + " " + rua[1] + " " + rua[2] + ", " + rua[3] + " " + rua[4];

        return nomeENumeroRua;
    }

    public String desafio3A(String nomeENumeroRua) {

        String[] rua = nomeENumeroRua.split(",");

        nomeENumeroRua = rua[1] + ", " + rua[0];

        return  nomeENumeroRua;
    }

    public String desafio3B(String nomeENumeroRua) {

        String[] rua = nomeENumeroRua.split(" ");

        nomeENumeroRua = rua[1] + " " + rua[2] + ", " + rua[0];

        return  nomeENumeroRua;
    }

    public String desafio3C(String nomeENumeroRua) {

        String[] rua = nomeENumeroRua.split(",");

        nomeENumeroRua = rua[0] + ", " + rua[1];

        return  nomeENumeroRua;
    }


    public String desafio3D(String nomeENumeroRua) {

        String[] rua = nomeENumeroRua.split(" ");

        nomeENumeroRua = rua[0] + " " + rua[1] + ", " + rua[2] + " " + rua[3];

        return  nomeENumeroRua;
    }

}
