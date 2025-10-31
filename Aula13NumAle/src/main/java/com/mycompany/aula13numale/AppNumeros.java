/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13numale;

/**
 *
 * @author 1jean
 */
import java.util.Random;
import java.util.Arrays;

public class AppNumeros {

    public static void main(String[] args) {
        final int TAMANHO = 1000;
        final int MAX_VAL = 9999;
        final int MIN_VAL = -9999;

        
        System.out.println("### 1. Gerando 1000 números aleatórios... ###");
        int[] vetor = new int[TAMANHO];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            
            vetor[i] = random.nextInt(MAX_VAL - MIN_VAL + 1) + MIN_VAL;
        }

        System.out.println("\nVetor na ordem de geração:");
        System.out.println(Arrays.toString(vetor));

        
        System.out.println("\n\n### 2. Inserindo números em ordem na lista... ###");
        ListaOrdenadaDupla lista = new ListaOrdenadaDupla();
        for (int numero : vetor) {
            lista.inserirEmOrdem(numero);
        }
        System.out.println("Inserção concluída.");

        
        System.out.println("\n\n### 3. Imprimindo a lista ordenada... ###");
        System.out.println("\nLista em ordem CRESCENTE:");
        lista.imprimirCrescente();

        System.out.println("\nLista em ordem DECRESCENTE:");
        lista.imprimirDecrescente();

        
        System.out.println("\n\n### 4. Removendo todos os números primos da lista... ###");
        lista.removerPrimos();
        System.out.println("Remoção concluída.");

        
        System.out.println("\n\n### 5. Imprimindo a lista final (sem primos)... ###");
        System.out.println("\nLista final em ordem CRESCENTE:");
        lista.imprimirCrescente();
    }
}