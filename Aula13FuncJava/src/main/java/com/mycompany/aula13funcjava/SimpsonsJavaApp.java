/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13funcjava;

/**
 *
 * @author 1jean
 */
import java.util.LinkedList;

public class SimpsonsJavaApp {
    public static void main(String[] args) {
        // Usando a classe LinkedList nativa do Java [cite: 574]
        LinkedList<String> lista = new LinkedList<>();

        System.out.println("--- Iniciando Atividade: Família Simpson (Versão Funções Java) ---");

        // Os 18 passos da atividade
        System.out.println("\n----- Passo 1 -----");
        lista.add("Homer"); // Adiciona ao final da lista [cite: 584]
        lista.add("Marge");
        imprimirLista(lista);

        System.out.println("\n----- Passo 2 -----");
        lista.clear(); // Remove todos os elementos [cite: 638]
        imprimirLista(lista);

        System.out.println("\n----- Passo 3 -----");
        lista.add("Homer");
        lista.add(0, "Bart"); // Insere em uma posição específica [cite: 588]
        lista.add(1, "Moll");
        imprimirLista(lista);

        System.out.println("\n----- Passo 4 -----");
        lista.clear();
        System.out.println("Lista esvaziada.");

        System.out.println("\n----- Passo 5 -----");
        lista.add("Homer");
        lista.add("Bart");
        lista.addFirst("Lisa"); // Adiciona no início da lista [cite: 593]
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
        System.out.println("A lista contém 'Lisa'? " + lista.contains("Lisa")); // Verifica se a lista contém o elemento [cite: 617]

        System.out.println("\n----- Passo 8 -----");
        lista.clear();
        System.out.println("Lista esvaziada.");

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
        lista.remove(1); // Remove o elemento na posição especificada [cite: 603]
        imprimirLista(lista);

        System.out.println("\n----- Passo 15 -----");
        System.out.println("Verificando personagens novamente:");
        System.out.println("- Contém 'Marge'? " + lista.contains("Marge"));
        System.out.println("- Contém 'Homer'? " + lista.contains("Homer"));
        System.out.println("- Contém 'Bart'? " + lista.contains("Bart"));
        System.out.println("- Contém 'Maggie'? " + lista.contains("Maggie"));
        imprimirLista(lista);
        
        System.out.println("\n----- Passo 16 -----");
        lista.removeFirst(); // Equivalente a remove() [cite: 598]
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

    public static void imprimirLista(LinkedList<String> lista) {
        System.out.println("Estado atual da lista: " + lista);
        System.out.println("Tamanho da lista: " + lista.size()); // Retorna o número de elementos na lista [cite: 627]
    }
}
