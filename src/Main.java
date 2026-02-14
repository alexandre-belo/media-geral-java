import model.Aluno;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de média de alunos");

        int frequencia;

        do {
            System.out.print("Digite a frequência do aluno: ");
            frequencia = scanner.nextInt();

            if (frequencia < 0 || frequencia > 100) {
                System.out.println("Frequência inválida digite um valor entre 0 e 100.");
            }

        } while (frequencia < 0 || frequencia > 100);

        Aluno aluno = new Aluno(frequencia);
        System.out.print("Quantas notas deseja inserir para o calculo da media? ");

        int quantidadeNotas = scanner.nextInt();

        for (int i = 0; i < quantidadeNotas; i++) {

            double nota;

            do {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                nota = scanner.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida digite um valor entre 0 e 10.");
                }

            } while (nota < 0 || nota > 10);

            aluno.adicionarNota(nota);
        }

        double mediaCorte;

        do {
            System.out.print("Digite a média de corte: ");
            mediaCorte = scanner.nextDouble();

            if (mediaCorte < 0 || mediaCorte > 10) {
                System.out.println("Nota inválida digite um valor entre 0 e 10.");
            }

        } while (mediaCorte < 0 || mediaCorte > 10);

        int frequenciaCorte;

        do {
            System.out.print("Digite a frequência de corte: ");
            frequenciaCorte = scanner.nextInt();

            if (frequenciaCorte < 0 || frequenciaCorte > 100) {
                System.out.println("Valor inválido digite um valor entre 0 e 100.");
            }

        } while (frequenciaCorte < 0 || frequenciaCorte > 100);

        double media = aluno.calcularMedia();
        boolean aprovado = aluno.estaAprovado(mediaCorte, frequenciaCorte);

        System.out.println("\n Resultado final = ");
        System.out.println("Notas: " + aluno.getNotas());
        System.out.println("Média: " + media);
        System.out.println("Frequência: " + aluno.getFrequencia());

        if (aprovado) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        scanner.close();
    }
}
