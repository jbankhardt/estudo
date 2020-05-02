package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNotas() {
		return nota1 + nota2 + nota3;
	}
	
	public void verificaMedia() {
		double soma = somaNotas();
		if (soma >= 60) {
			System.out.println("PASSOU");
		} else {
			System.out.println("REPROVOU");
			System.out.printf("FALTOU %.2f PONTOS.",60-soma);
		}
	}
}
