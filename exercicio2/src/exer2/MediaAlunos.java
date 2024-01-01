package exer2;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int totAlunosTurmaA = 0;
		int totAlunosTurmaB = 0;
		double notaAluno;
		int aprovadoTurmaA = 0;
		int reprovadoTurmaA = 0;
		int recuperacaoTurmaA = 0;
		int aprovadoTurmaB = 0;
		int reprovadoTurmaB = 0;
		int recuperacaoTurmaB = 0;

		System.out.println("Médias Turma A: ");
		System.out.println("Entre com as notas: ");

		while (totAlunosTurmaA < 20) {
			notaAluno = scan.nextDouble();

			if (notaAluno >= 6) {
				aprovadoTurmaA++;
			} else if (notaAluno > 4 && notaAluno < 6) {
				recuperacaoTurmaA++;
			} else {
				reprovadoTurmaA++;
			}

			totAlunosTurmaA++;

		}

		System.out.println("Médias Turma B: ");
		System.out.println("Entre com as notas: ");

		while (totAlunosTurmaB < 20) {
			notaAluno = scan.nextDouble();

			if (notaAluno >= 6) {
				aprovadoTurmaB++;
			} else if (notaAluno > 4 && notaAluno <= 5) {
				recuperacaoTurmaB++;
			} else {
				reprovadoTurmaB++;
			}

			totAlunosTurmaB++;

		}

		scan.close();

		System.out.println("Resultados: ");
		System.out.println("Total de aprovados na Turma A: " + aprovadoTurmaA);
		System.out.println("Total de aprovados na Turma B: " + aprovadoTurmaB);
		System.out.println("Total de reprovados na Turma A: " + reprovadoTurmaA);
		System.out.println("Total de reprovados na Turma B: " + reprovadoTurmaB);
		System.out.println("Total em recuperação na Turma A: " + recuperacaoTurmaA);
		System.out.println("Total em recuperação na Turma B: " + recuperacaoTurmaB);

	}
}
