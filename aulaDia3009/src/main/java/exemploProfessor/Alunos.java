package exemploProfessor;

public class Alunos {
	private String [][]cadastro = new String[2][3];
	private String []dadosDoAluno = new String[3];

	public String[] getDadosDoAluno() {
		return dadosDoAluno;
	}

	public void setDadosDoAluno(String[] dadosDoAluno) {
		this.dadosDoAluno = dadosDoAluno;
	}

	public String[][] getCadastro() {
		return cadastro;
	}

	public void setCadastro(String[][] cadastro) {
		this.cadastro = cadastro;
	}

}
