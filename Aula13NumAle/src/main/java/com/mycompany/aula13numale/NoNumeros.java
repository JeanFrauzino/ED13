package com.mycompany.aula13numale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1jean
 */
public class NoNumeros {
    int valor;
    NoNumeros proximo;
    NoNumeros anterior;

    public NoNumeros(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}