package ProjetoEnergiaLimpa;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     Scanner leia = new Scanner(System.in);

	     String cpf; 

	     int tipoPessoa;

	     System.out.println("\n Informe o tipo de usuário:"
	                + "\n 1 - Pessoa Fisica"
	                + "\n 2 - Pessoa Jurídica"
	                + "\n 3 - Instituição");
	     tipoPessoa = scan.nextInt();

	     if(tipoPessoa == 1) {
	         System.out.println("\n Informe o CPF do usuário: ");
	         cpf= scan.next();

	     } else {
	         System.out.println("\n Informe o CNPJ do usuário: ");
	         cpf= scan.next();

	     }

	     System.out.println("\n Informe o usuário: ");
	     String nome= scan.next();

	     System.out.println("\n Informe o número do telefone: ");       
	     String telefone= leia.next();

	     System.out.println("\n Informe o endereço: ");
	     String endereco = scan.next();

	     System.out.println("\n Informe o número de instalação: ");
	     String numeroInstalacao = leia.next();

	     System.out.println("\n Informe o consumo Kwh: ");
	     float consumoKwh = scan.nextFloat();

	     System.out.println("\n Informe o valor da conta: ");
	     double valorConta = leia.nextDouble();

	     System.out.println("\n Informe a renda do usuário: ");
	     float renda = scan.nextFloat();


	     Fisica fisica = new Fisica(nome, telefone, endereco, 
	                numeroInstalacao, consumoKwh, valorConta,cpf, renda);


	     fisica.imprimirInfo();
	     System.out.println("\nO novo valor da conta de energia será de: R$"+ fisica.reducaoValor());
	     System.out.println();
	     
	}

}
