/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13numale;

/**
 *
 * @author 1jean
 */
public class ListaOrdenadaDupla {
    private NoNumeros cabeca;
    private NoNumeros cauda;

    public ListaOrdenadaDupla() {
        this.cabeca = null;
        this.cauda = null;
    }

    
    public void inserirEmOrdem(int valor) {
        NoNumeros novoNo = new NoNumeros(valor);

        // Caso 1: A lista está vazia
        if (cabeca == null) {
            cabeca = novoNo;
            cauda = novoNo;
            return;
        }

        
        if (valor <= cabeca.valor) {
            novoNo.proximo = cabeca;
            cabeca.anterior = novoNo;
            cabeca = novoNo;
            return;
        }

        
        if (valor >= cauda.valor) {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
            return;
        }

        
        NoNumeros atual = cabeca.proximo;
        while (atual.valor < valor) {
            atual = atual.proximo;
        }

        
        NoNumeros noAnterior = atual.anterior;
        noAnterior.proximo = novoNo;
        novoNo.anterior = noAnterior;
        novoNo.proximo = atual;
        atual.anterior = novoNo;
    }

    
    public void imprimirCrescente() {
        if (cabeca == null) {
            System.out.println("Lista vazia.");
            return;
        }
        NoNumeros atual = cabeca;
        System.out.print("[");
        while (atual != null) {
            System.out.print(atual.valor + (atual.proximo != null ? ", " : ""));
            atual = atual.proximo;
        }
        System.out.println("]");
    }

    
    public void imprimirDecrescente() {
        if (cauda == null) {
            System.out.println("Lista vazia.");
            return;
        }
        NoNumeros atual = cauda;
        System.out.print("[");
        while (atual != null) {
            System.out.print(atual.valor + (atual.anterior != null ? ", " : ""));
            atual = atual.anterior;
        }
        System.out.println("]");
    }

    
    private boolean isPrimo(int n) {
        
        if (n <= 1) return false;
        
        if (n == 2) return true;
        
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    
    public void removerPrimos() {
        NoNumeros atual = cabeca;
        while (atual != null) {
            NoNumeros proximo = atual.proximo; 
            
            
            if (isPrimo(Math.abs(atual.valor))) {
                
                if (atual.anterior == null) { 
                    cabeca = atual.proximo;
                    if (cabeca != null) cabeca.anterior = null;
                } else {
                    atual.anterior.proximo = atual.proximo;
                }

                if (atual.proximo == null) { 
                    cauda = atual.anterior;
                    if (cauda != null) cauda.proximo = null;
                } else {
                    atual.proximo.anterior = atual.anterior;
                }
            }
            atual = proximo; 
        }
    }
}
