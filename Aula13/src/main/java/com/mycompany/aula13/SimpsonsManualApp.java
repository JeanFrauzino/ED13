/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13;

/**
 *
 * @author 1jean
 */
public class SimpsonsManualApp {
    public static void main(String[] args) {
        // Usando a nossa classe manual
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("--- Iniciando Atividade: Família Simpson (Versão Manual) ---");

        // Os 18 passos da atividade são executados aqui
        // O código é IDÊNTICO ao da versão Java, mas chama nossos métodos.
        
        System.out.println("\n----- Passo 1 -----");
        lista.add("Homer");
        lista.add("Marge");
        imprimirLista(lista);

        System.out.println("\n----- Passo 2 -----");
        lista.clear();
        imprimirLista(lista);

        System.out.println("\n----- Passo 3 -----");
        lista.add("Homer");
        lista.add(0, "Bart");
        lista.add(1, "Moll");
        imprimirLista(lista);

        System.out.println("\n----- Passo 4 -----");
        lista.clear();
        System.out.println("Lista esvaziada.");

        System.out.println("\n----- Passo 5 -----");
        lista.add("Homer");
        lista.add("Bart");
        lista.addFirst("Lisa");
        imprimirLista(lista);

        System.out.println("\n----- Passo 6 -----");
        lista.clear();
        imprimirLista(lista);

        System.out.println("\n----- Passo 7 -----");
        lista.add("Homer");
        lista.add("Maggie");
        lista.add(0, "Bart");
        lista.add(1, "Marge");
        imprimirLista(lista);
        System.out.println("A lista contém 'Lisa'? " + lista.contains("Lisa"));

        System.out.println("\n----- Passo 8 -----");
        lista.clear();
        System.out.println("Lista esvaziada.");
        
        // ... (Os passos continuam exatamente como na resposta anterior)
        
        System.out.println("\n----- Passo 9 -----");
        lista.add("Homer");
        lista.add("Bart");
        imprimirLista(lista);

        System.out.println("\n----- Passo 10 -----");
        System.out.println("Verificando personagens:");
        System.out.println("- Contém 'Marge'? " + lista.contains("Marge"));
        System.out.println("- Contém 'Homer'? " + lista.contains("Homer"));
        System.out.println("- Contém 'Bart'? " + lista.contains("Bart"));
        System.out.println("- Contém 'Maggie'? " + lista.contains("Maggie"));
        imprimirLista(lista);

        System.out.println("\n----- Passo 11 -----");
        lista.clear();
        System.out.println("Lista esvaziada.");

        System.out.println("\n----- Passo 12 -----");
        lista.addFirst("Bart");
        lista.addFirst("Homer");
        lista.add("Marge");
        lista.add(1, "Maggie");
        lista.addFirst("Ned Flanders");
        lista.addLast("Sr. Burns");
        imprimirLista(lista);

        System.out.println("\n----- Passo 13 -----");
        lista.removeLast();
        imprimirLista(lista);

        System.out.println("\n----- Passo 14 -----");
        lista.remove(1);
        imprimirLista(lista);

        System.out.println("\n----- Passo 15 -----");
        System.out.println("Verificando personagens novamente:");
        System.out.println("- Contém 'Marge'? " + lista.contains("Marge"));
        System.out.println("- Contém 'Homer'? " + lista.contains("Homer"));
        System.out.println("- Contém 'Bart'? " + lista.contains("Bart"));
        System.out.println("- Contém 'Maggie'? " + lista.contains("Maggie"));
        imprimirLista(lista);
        
        System.out.println("\n----- Passo 16 -----");
        lista.removeFirst();
        imprimirLista(lista);

        System.out.println("\n----- Passo 17 -----");
        System.out.println("Verificando personagens pela última vez:");
        System.out.println("- Contém 'Marge'? " + lista.contains("Marge"));
        System.out.println("- Contém 'Homer'? " + lista.contains("Homer"));
        System.out.println("- Contém 'Bart'? " + lista.contains("Bart"));
        System.out.println("- Contém 'Maggie'? " + lista.contains("Maggie"));
        imprimirLista(lista);

        System.out.println("\n----- Passo 18 -----");
        lista.clear();
        imprimirLista(lista);
        
        System.out.println("\n--- Atividade Finalizada ---");
    }
    
    public static void imprimirLista(ListaDuplamenteEncadeada lista) {
        System.out.println("Estado atual da lista: " + lista);
        System.out.println("Tamanho da lista: " + lista.size());
    }
}
