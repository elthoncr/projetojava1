package cursojava.executavel;

import cursojava.classes.Aluno;

public class ExecutavelAluno {

	public static void main(String[] args) {
		
		/* new Aluno() é uma instancia (Criação de Objeto) */
		/* aluno1 é uma referência para o objeto aluno */
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("João",25);
		
		aluno1.setNome("Ethon");
		
		System.out.println("Nome aluno 1: " + aluno1.getNome());
		
	}

}
