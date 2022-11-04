package exemploProfessor;

import java.util.Scanner;

public class CriarCursos {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			Alunos cadastroM1P = new Alunos();
			Alunos dadosAluno = new Alunos();
			UnidadeCurricular unidadeM1P = new UnidadeCurricular();
			Cursos cursoM1P = new Cursos();
			
			System.out.println("o que você deseja inserir ?");
			
			dadosAluno.getDadosDoAluno()[0]= in.nextLine();
			dadosAluno.getDadosDoAluno()[1]= in.nextLine();
			dadosAluno.getDadosDoAluno()[2]= in.nextLine();
			
			System.out.println("Digite o nome do curso.");
			cursoM1P.setCurso(in.nextLine());
			
			for(int x = 0; x < unidadeM1P.getUnidadeCurricular().length; x++) {
				
				System.out.println("O nome do professor e a unidade Curricular");
					unidadeM1P.getUnidadeCurricular()[x] = in.nextLine();
			}

			for(int x = 0; x < cadastroM1P.getCadastro().length; x++) {
				for(int y = 0; y < 3; y++) {
					System.out.println(dadosAluno.getDadosDoAluno()[y]);
					cadastroM1P.getCadastro()[x][y] = in.nextLine();
					
				}
			}

			cursoM1P.alunos = cadastroM1P;
			cursoM1P.uC = unidadeM1P;
			
			System.out.println("----------------------------------------");
			System.out.print("Curso: " + cursoM1P.getCurso());
			System.out.println("_______________________________________");
			
			for(int x = 0; x < cursoM1P.uC.getUnidadeCurricular().length; x++) {
				if(cursoM1P.uC.getUnidadeCurricular()[x] == "") {
					break;
				}else {
					System.out.println("Prof/UC: " + cursoM1P.uC.getUnidadeCurricular()[x]);
				}
					
			}
			System.out.println();
			
			for(int x = 0; x < cursoM1P.alunos.getCadastro().length; x++) {
				
				System.out.println(dadosAluno.getDadosDoAluno()[0] + ": " + cursoM1P.alunos.getCadastro()[x][0] +  " | " );
				System.out.println(dadosAluno.getDadosDoAluno()[1] + ": " + cursoM1P.alunos.getCadastro()[x][0] +  " | " );
				System.out.println(dadosAluno.getDadosDoAluno()[2] + ": " + cursoM1P.alunos.getCadastro()[x][0] +  " | " );
				/*	
				System.out.print(" " + cursoM1P.alunos.getCadastro()[x][0] + " | ");	
				System.out.print(" " + cursoM1P.alunos.getCadastro()[x][1] + " | ");
				System.out.print(" " + cursoM1P.alunos.getCadastro()[x][2] + " ");
				System.out.println();*/
			}
		}

	}


