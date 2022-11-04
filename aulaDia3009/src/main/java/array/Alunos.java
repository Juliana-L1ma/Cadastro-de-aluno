package array;

public class Alunos {
	private String [] [] cadastroDeAlunos = new String [2] [2];
    private String [] dadosDoAluno = new String [3];
    
	public String[][] getCadastroDeAlunos() {
		return cadastroDeAlunos;
	}
	public void setCadastroDeAlunos(String[][] cadastroDeAlunos) {
		this.cadastroDeAlunos = cadastroDeAlunos;
	}
	public String[] getDadosDoAluno() {
		return dadosDoAluno;
	}
	public void setDadosDoAluno(String[] dadosDoAluno) {
		this.dadosDoAluno = dadosDoAluno;
	}
    
	
	

}
