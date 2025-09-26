package com.exercicios.poo;

import com.exercicios.poo.estoque.Estoque;
import com.exercicios.poo.estoque.Produto;
import com.exercicios.poo.funcionario.Funcionario;
import com.exercicios.poo.funcionario.RegistroFuncionarios;
import com.exercicios.poo.biblioteca.Livro;
import com.exercicios.poo.biblioteca.Biblioteca;

public class Main {
    public static void main(String[] args) {
        // Estoque
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(new Produto("Notebook", 3500.0, 5));
        estoque.adicionarProduto(new Produto("Mouse", 50.0, 10));
        estoque.listarProdutos();

        System.out.println();

        // Funcionários
        RegistroFuncionarios registro = new RegistroFuncionarios();
        registro.adicionarFuncionario(new Funcionario("Alice", 28, "Analista"));
        registro.adicionarFuncionario(new Funcionario("Bob", 35, "Gerente"));
        registro.listarFuncionarios();

        System.out.println();

        // Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes"));
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        biblioteca.listarLivros();
    }
}
