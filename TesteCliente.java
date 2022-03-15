package ProjetoEnergiaLimpa;//TESTE


//CÓDIGO AJUSTADO
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteCliente {
	
	public static void main (String[] args) {
		
		//CRIANDO DUAS TIPOS DE SCANNER PARA IMPRIMIR 
		Scanner scan = new Scanner(System.in);

		
		//VARIÁVEIS
		int verifica = 0;
		double novoValor = 0;
		String cpf = null, cnpj = null;
		int tipoPessoa;


		//FAZENDO 'DO' PARA IMPRIMIR 
		do
		{
				//DADOS
			
				//INICIANDO O TRY PARA TRATAR O ERRO
				try

				{
					//ESCOLHER O TIPO DE CLIENTE
					System.out.println("\n Informe o tipo de cliente: "
									 + "\n 1 - Pessoa Física"
									 + "\n 2 - Pessoa Jurídica");
					tipoPessoa = scan.nextInt();

					
					//CPF OU CNPJ
					while(tipoPessoa > 2)
					{
						System.err.println("\n Opção inválida!\n");
						System.out.println("\n Informe novamente o tipo de cliente: "
										 + "\n 1 - Pessoa Física"
										 + "\n 2 - Pessoa Jurídica");
						tipoPessoa = scan.nextInt();
					}
					if (tipoPessoa == 1)
					{
						System.out.println("\n Informe o CPF do cliente: ");
						cpf = scan.next();
						
						for(int i = 0; i < cpf.length(); i++)
						{
							Character num = cpf.charAt(i);//a classe Character em Java 
							if (Character.isLetter(num))//retorna verdadeiro se o caractere "ch" é um caractere alfabético e falso caso contrário
							{
								throw new Exception();
							}
						}
					}
					else if (tipoPessoa == 2)
					{
						System.out.println("\n Informe o CNPJ do cliente: ");
						cnpj = scan.next();
						
						for(int i = 0; i < cnpj.length(); i++)
						{
							Character num = cnpj.charAt(i);//a classe Character em Java 
							if (Character.isLetter(num))//retorna verdadeiro se o caractere "ch" é um caractere alfabético e falso caso contrário
							{
								throw new Exception();
							}
						}
					}
					else
					{
						System.err.println("\n Opção inválida!");
						break;
					}

					
					//NOME
					System.out.println("\n Nome do cliente: ");
					scan.nextLine();
					String nome = scan.nextLine();
				
					for(int i = 0; i < nome.length(); i++)
					{
						Character letra = nome.charAt(i);//a classe Character em Java
						if (Character.isDigit(letra))//retorna verdadeiro se o caractere "ch" é um caractere numérico e falso caso contrário
						{
							throw new Exception();
						}
					}
			
					//TELEFONE
					System.out.println("\n Informe o número de telefone: ");
					String telefone = scan.nextLine();
				
					for(int i = 0; i < telefone.length(); i++)
					{
						Character num = telefone.charAt(i);//a classe Character em Java
						if (Character.isLetter(num))//retorna verdadeiro se o caractere "ch" é um caractere alfabético e falso caso contrário
						{
							throw new Exception();
						}
					}
					
					//ENDEREÇO
					System.out.println("\n Informe o endereço: ");
					String endereco = scan.nextLine();
					
					//INSTALAÇÃO
					System.out.println("\n Informe o número de Instalação: ");
					String numeroInstalacao = scan.nextLine();
					
					//VALOR FATURA
					System.out.println("\n Informe o valor da fatura atual: ");
					double valorConta = scan.nextDouble();
			
					//RENDA MENSAL	
					System.out.println("\n Informe a renda mensal do cliente: ");
					float renda = scan.nextFloat();
			
					//LIXO ORGÂNCO	
					System.out.println("\n Informe o peso do lixo Orgânico: ");
					double kgLixo = scan.nextDouble();
			
					//ATRIBUIR OS VALORES PARA CADA SUBLCASSE
					Fisica fisica = new Fisica (nome, telefone, endereco, 
												numeroInstalacao, valorConta, kgLixo, cpf, renda);
			
					Juridica juridica = new Juridica (nome, telefone, endereco, 
												numeroInstalacao, valorConta, kgLixo, cnpj, renda);
					
					//CALCULANDO O DESCONTO POR RENDA
					switch (tipoPessoa)
					{
					case 1:
						if(renda <= 1212)
						{
							novoValor = fisica.reducaoValor() - (fisica.reducaoValor()*0.05);
						}
						else
						{
							novoValor = fisica.reducaoValor();
						}
						break;
				
					case 2:
						novoValor = juridica.reducaoValor();
						break;
				
					default:
						System.out.print("\n Opção inválida!");
					}
					
					//ESCOLHENDO A REGIÃO PARA DESCARTE DO LIXO
					System.out.println("\n Selecione uma região para realizar a entrega do lixo: " + 
							"\n 1 - Zona Sul"
						  + "\n 2 - Zona Norte" 
						  + "\n 3 - Zona Leste" 
						  + "\n 4 - Zona Oeste");
					int regiao = scan.nextInt();
					
					
					while(regiao > 4)
					{
						System.err.println("\n Opção inválida!");
						System.out.println("\n Selecione novamente uma região para realizar a entrega do lixo: " + 
								"\n 1 - Zona Sul"
							  + "\n 2 - Zona Norte" 
							  + "\n 3 - Zona Leste" 
							  + "\n 4 - Zona Oeste");
						regiao = scan.nextInt();
					}
			
						//FAZENDO COLLECTION COM STRING PARA CADA REGIÃO
						System.out.println("\n Pontos de coleta na sua região: ");
						System.out.print("\n--------------------------------------------------------------------------------\n");
						
						if(regiao == 4)
						{
							List<String> ZonaOeste = new ArrayList<String>();
				
							ZonaOeste.add("\n Av. Antártica (Baixo do Viaduto Antártica)");
							ZonaOeste.add("\n Rua Agrestina X Av. Marginal Direita do Tietê");
							ZonaOeste.add("\n Rua Sales Gomes, n. 415");
							ZonaOeste.add("\n Praça. do Cancioneiro, n. 15");
				
							for (String oeste : ZonaOeste)
							{
								System.out.print(oeste);
							}
						}
				
						if(regiao == 3)
						{
							List<String> ZonaLeste = new ArrayList<String>();
					
							ZonaLeste.add("\n Rua Manuel Alves da Rocha, n. 584");
							ZonaLeste.add("\n Av. Osvaldo Valle Cordeiro, n. 420");
							ZonaLeste.add("\n Rua Amélia Vanso Magnoli x Acácio Antunes");
							ZonaLeste.add("\n Av. Aricanduva, n. 200");
					
							for (String leste : ZonaLeste)
							{
								System.out.print(leste);
							}
						}
					
						if(regiao == 2)
						{
							List<String> ZonaNorte = new ArrayList<String>();
						
							ZonaNorte.add("\n Rua José Bernardo Pinto, n. 1480");
							ZonaNorte.add("\n Rua Eduardo Vicente Nasser, n. 519");
							ZonaNorte.add("\n Avenida Paulo Lincoln do Valle Pontin, n. 550");
							ZonaNorte.add("\n Rua Itaiquara, n. 237");
						
							for (String norte : ZonaNorte)
							{
								System.out.print(norte);
							}
						}
				
						if(regiao == 1)
						{
							List<String> ZonaSul = new ArrayList<String>();
						
							ZonaSul.add("\n Estrada do Alvarenga, n. 2475");
							ZonaSul.add("\n Rua Tereza Cristina, n. 10");
							ZonaSul.add("\n Av. Casemiro da Rocha, n. 1220");
							ZonaSul.add("\n Rua Mary Baida Salem, n. 01");
							
							for (String sul : ZonaSul)
							{
								System.out.print(sul);
							}
						}
						
						if(regiao>4)
						{
							System.err.println("\n Opção inválida!");
						}
						

					//IMPRESSÃO RESUMO
					if (tipoPessoa == 1)
					{
						System.out.print("\n\n--------------------------------------------------------------------------------");
						fisica.imprimirInfo();
						System.out.printf("\n Valor de desconto ganho com a entrega do lixo foi de: R$%2.2f", fisica.pesoLixo(kgLixo));
						System.out.printf("\n O novo valor da fatura de energia será de: R$%2.2f", novoValor);
					}
					else if (tipoPessoa == 2)
					{
						System.out.print("\n\n--------------------------------------------------------------------------------");
						juridica.imprimirInfo();
						System.out.printf("\n Valor de desconto ganho com a entrega do lixo foi de: R$%2.2f", juridica.pesoLixo(kgLixo));
						System.out.printf("\n O novo valor da fatura de energia foi de: R$%2.2f", novoValor);
					}
			
						System.out.print("\n\n--------------------------------------------------------------------------------\n");
						System.out.println("\n Deseja inserir um novo cliente?"
										 + "\n 1 - Sim"
										 + "\n 2 - Não");
						verifica = scan.nextInt();
				}
				
				//TRATANDO O ERRO COM CATCH
				catch (Exception e)
				{
					System.err.println("\n Exception: "+e
									  +"\n"	
							          +"\n Campo preechindo incorretamente!!!"
									  +"\n Para o campo 'cpf' ou 'cnpj' é válido somente caracteres numéricos, por exemplo: 54321."
									  +"\n Para o campo 'nome' é válido somente caracteres alfabéticos, por exemplo: Maria."
									  +"\n Para o campo 'telefone' é válido somente caracteres numéricos, por exemplo: 12345.");
				}
		}
		while(verifica !=2);
		
		System.out.print("\n Obrigado por usar nosso sistema!\n\n Até a próxima!");
		
	}
	
}//END

