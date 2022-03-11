package ProjetoEnergiaLimpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);
        
        int verifica =0;
        
       do {

        String cpf = null, cnpj = null; 

        int tipoPessoa;
        
        double novoValor =0;

        System.out.println("\n Informe o tipo de cliente:"
                + "\n 1 - Pessoa Fisica"
                + "\n 2 - Pessoa Jurídica");
        tipoPessoa = scan.nextInt();

        if(tipoPessoa == 1) {
            System.out.println("\n Informe o CPF do cliente: ");
            cpf= scan.next();

        }else {
            System.out.println("\n Informe o CNPJ do cliente: ");
            cnpj= scan.next();

        } 

        leia = new Scanner(System.in);
        System.out.println("\n Nome do cliente: "); 
        scan.nextLine();
        String nome= leia.nextLine();
        
        System.out.println("\n Informe o número do telefone: ");
        String telefone= leia.next();
        
        System.out.println("\n Informe o endereço: ");        
        String endereco = scan.nextLine();

        System.out.println("\n Informe o número de instalação: ");
        String numeroInstalacao = leia.next();


        System.out.println("\n Informe o valor da fatura: ");
        double valorConta = leia.nextDouble();


        System.out.println("\n Informe a renda do cliente: ");
        float renda = leia.nextFloat();

        System.out.println("\n Informe o peso do lixo: ");
        double kgLixo = leia.nextDouble();
        
        
        Fisica fisica = new Fisica(nome, telefone, endereco, 
                numeroInstalacao, valorConta, cpf, renda, kgLixo);
        
        Juridica juridica = new Juridica(nome, telefone, endereco, 
                numeroInstalacao, valorConta,cnpj, renda, kgLixo);
        
        
        switch(tipoPessoa) {
        case 1:
        	if(renda <= 1212) {
        		novoValor = (fisica.reducaoValor() - (fisica.reducaoValor()*0.05));        		
        	}else {
        		novoValor = fisica.reducaoValor();
        	}
        	break;
        case 2:
        	novoValor = juridica.reducaoValor();
        	break;
        default:
        	System.out.println("Opção inválida");
        	
        }
        System.out.println("\n Selecione uma região para realizar a entrega do lixo: " + "\n 1 - Zona Sul"
				+ "\n 2 - Zona Norte" + "\n 3 - Zona Leste" + "\n 4 - Zona Oeste");
		int regiao = leia.nextInt();
		
		System.out.println("\n Pontos de coleta na sua região: ");
		System.out.printf("\n--------------------------------------------------------------------------");
		
		if (regiao == 4) {
			List<String> ZonaOeste = new ArrayList<String>();

			ZonaOeste.add("\n Av. Antártica (Baixo do Viaduto Antártica)");
			ZonaOeste.add("\n Rua Agrestina X Av. Marginal Direita do Tietê");
			ZonaOeste.add("\n Rua Sales Gomes, n. 415");
			ZonaOeste.add("\n Praça. do Cancioneiro, n. 15");

			for (String oeste : ZonaOeste) {
				System.out.println(oeste);
			}

		}

		if (regiao == 3) {
			List<String> ZonaLeste = new ArrayList<String>();

			ZonaLeste.add("\n Rua Manuel Alves da Rocha, n. 584");
			ZonaLeste.add("\n Av. Osvaldo Valle Cordeiro, n. 420");
			ZonaLeste.add("\n Rua Amélia Vanso Magnoli x Acácio Antunes");
			ZonaLeste.add("\n Av. Aricanduva, n. 200");

			for (String leste : ZonaLeste) {
				System.out.println(leste);
			}

		}

		if(regiao == 1) {
		List<String> ZonaSul = new ArrayList<String>();

		ZonaSul.add("\n Estrada do Alvarenga, n. 2475");
		ZonaSul.add("\n Rua Tereza Cristina, n. 10");
		ZonaSul.add("\n Av. Casemiro da Rocha, n. 1220");
		ZonaSul.add("\n Rua Mary Baida Salem, n. 01");
		
		for(String sul:ZonaSul) {
			System.out.println(sul);
		}
		
		}

		if(regiao == 2) {
		List<String> ZonaNorte = new ArrayList<String>();

		ZonaNorte.add("\n Rua José Bernardo Pinto, n. 1480");
		ZonaNorte.add("\n Rua Eduardo Vicente Nasser, n. 519");
		ZonaNorte.add("\n Avenida Paulo Lincoln do Valle Pontin, n. 550");
		ZonaNorte.add("\n Rua Itaiquara, n. 237");
		
		for(String norte:ZonaNorte) {
			System.out.println(norte);
		}
		
		}
        
        System.out.printf("\n--------------------------------------------------------------------------");
        fisica.imprimirInfo();
        System.out.printf("\n Valor de desconto ganho com a entregado do lixo foi de: R$%2.2f",fisica.pesoLixo(kgLixo));
        System.out.printf("\n O novo valor da fatura de energia será de: R$%2.2f", novoValor);
        System.out.println();
        
        System.out.printf("\n--------------------------------------------------------------------------");
        System.out.println();
        System.out.println("\n Deseja inserir um novo cliente?"
        		+ "\n 1 - Sim"
        		+ "\n 2 - Não");
        verifica = scan.nextInt();

        }while(verifica != 2);
        System.out.println("\n Obrigada por usar nosso sistema!");
        
	}

}
