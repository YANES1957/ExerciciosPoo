package com.exercicios.poo.funcionario;

import java.util.ArrayList;
import java.util.List;

public class RegistroFuncionarios {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários cadastrados:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
