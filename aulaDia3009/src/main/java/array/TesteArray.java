package array;

import java.util.Scanner;

public class TesteArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        Instancia cadastro = new Instancia();
        cadastro.getCadastro()[0] = "Ismael";
        System.out.println("digite o nome");
        System.out.println(cadastro.getCadastro()[0] = in.nextLine());
       
	}

}
