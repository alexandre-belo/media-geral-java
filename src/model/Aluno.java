package model;

import java.util.List;
import java.util.ArrayList;

public class Aluno {

    private List<Double> notas;
    private int frequencia;

    public Aluno() {
        this.notas = new ArrayList<>();
    }

    public Aluno(int frequencia) {
        this();
        this.frequencia = frequencia;
    }

    // Adiciona nota a lista
    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    // Calcula a media das notas
    public double calcularMedia() {
        double soma = 0;

        if (notas.size() == 0) {
            return 0;
        }

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.size();
        return media;
    }

    // Verifica se o aluno foi aprovado
    public boolean estaAprovado(double mediaCorte, int frequenciaCorte) {
        double media = calcularMedia();
        return media >= mediaCorte && frequencia >= frequenciaCorte;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public int getFrequencia() {
        return frequencia;
    }
}

