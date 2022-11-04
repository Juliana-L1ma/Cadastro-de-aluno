package array;

import java.util.Scanner;

public class CriarCursos {
	
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		Alunos alunosM1P = new Alunos();
        Curso nomeDoCurso = new Curso ();
        
        for(int x=0; x<alunosM1P.getCadastroDeAlunos().length; x++) {
        	for(int y=0; y<2; y++) {
        		System.out.println("Digite os dados do aluno");
        		alunosM1P.getCadastroDeAlunos()[x][y]=in.nextLine();
        	}
        }
        
        for(int x=0; x<alunosM1P.getCadastroDeAlunos().length; x++) {
        	for(int y=0; y<2; y++) {
        		System.out.print(alunosM1P.getCadastroDeAlunos()[x][y] + " __ ");
        	}
        	System.out.println(" ");
        }
        
	}
}

