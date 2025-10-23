    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13;

/**
 *
 * @author 1jean
 */
public class NoSimpsons {
    String nome;
    NoSimpsons proximo;
    NoSimpsons anterior; // A grande diferença: a referência para o nó anterior

    public NoSimpsons(String nome) {
        this.nome = nome;
        this.proximo = null;
        this.anterior = null;
    }
}
