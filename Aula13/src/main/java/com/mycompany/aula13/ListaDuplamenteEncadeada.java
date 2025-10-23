/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13;

/**
 *
 * @author 1jean
 */
public class ListaDuplamenteEncadeada {
    private NoSimpsons cabeca;
    private NoSimpsons cauda;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public int size() { return this.tamanho; }
    public boolean isEmpty() { return this.tamanho == 0; }

    public void addFirst(String nome) {
        NoSimpsons novoNo = new NoSimpsons(nome);
        if (isEmpty()) {
            cabeca = novoNo;
            cauda = novoNo;
        } else {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
        }
        tamanho++;
    }

    public void addLast(String nome) {
        if (isEmpty()) {
            addFirst(nome);
            return;
        }
        NoSimpsons novoNo = new NoSimpsons(nome);
        cauda.proximo = novoNo;
        novoNo.anterior = cauda;
        cauda = novoNo;
        tamanho++;
    }

    // "add" por padrão adiciona no final
    public void add(String nome) {
        addLast(nome);
    }

    public void add(int index, String nome) {
        if (index < 0 || index > tamanho) {
            System.out.println("Erro: Índice inválido para inserção.");
            return;
        }
        if (index == 0) {
            addFirst(nome);
        } else if (index == tamanho) {
            addLast(nome);
        } else {
            NoSimpsons novoNo = new NoSimpsons(nome);
            NoSimpsons atual = cabeca;
            for (int i = 0; i < index; i++) {
                atual = atual.proximo;
            }
            NoSimpsons noAnterior = atual.anterior;
            
            // Reorganiza os ponteiros
            noAnterior.proximo = novoNo;
            novoNo.anterior = noAnterior;
            novoNo.proximo = atual;
            atual.anterior = novoNo;
            
            tamanho++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) return;
        if (tamanho == 1) {
            cabeca = null;
            cauda = null;
        } else {
            cabeca = cabeca.proximo;
            cabeca.anterior = null;
        }
        tamanho--;
    }

    public void removeLast() {
        if (isEmpty() || tamanho == 1) {
            removeFirst();
            return;
        }
        cauda = cauda.anterior;
        cauda.proximo = null;
        tamanho--;
    }

    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= tamanho) return;
        if (index == 0) {
            removeFirst();
        } else if (index == tamanho - 1) {
            removeLast();
        } else {
            NoSimpsons atual = cabeca;
            for (int i = 0; i < index; i++) {
                atual = atual.proximo;
            }
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
            tamanho--;
        }
    }

    public boolean contains(String nome) {
        NoSimpsons atual = cabeca;
        while (atual != null) {
            if (atual.nome.equals(nome)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void clear() {
        cabeca = null;
        cauda = null;
        tamanho = 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        NoSimpsons atual = cabeca;
        while (atual != null) {
            sb.append(atual.nome);
            if (atual.proximo != null) {
                sb.append(", ");
            }
            atual = atual.proximo;
        }
        sb.append("]");
        return sb.toString();
    }
}