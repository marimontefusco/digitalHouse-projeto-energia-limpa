package ProjetoEnergiaLimpa;//SUBCLASS

//EXTENDENDO DA SUPERCLAS E IMPLEMENTANDO INTERFACE --> herança multipla
public class Fisica extends Cliente implements Interface{

	//ATRIBUTOS DA PRÓRIA CLASSE
	private String cpf;
	private float renda;
	
	
	//CONSTRUTOR --> PARA COMPILAR
	public Fisica(String nome, String telefone, String endereco, String numeroInstalacao, double valorConta,
			double kgLixo, String cpf, float renda) 
	{
		super(nome, telefone, endereco, numeroInstalacao, valorConta, kgLixo);
		this.cpf = cpf;
		this.renda = renda;
	}
	
	

	//GETTER AND SETTER --> GET = ACESSA E SET = MODIFICA -- SÃO MÉTODOS PARA PODER MANIPULAR OS ATRIBUTOS EM OUTRA CLASS
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public float getRenda() {
		return renda;
	}


	public void setRenda(float renda) {
		this.renda = renda;
	}
	
	
	//MÉTODOS DA INTERFACE
	@Override
	public double reducaoValor()
	{
		getKgLixo();
		double desconto = valorConta - pesoLixo(kgLixo);
		return desconto;
	}


	@Override
	public void imprimirInfo() 
	{
		System.out.printf("\n\n Cliente: "+ nome + "\n Telefone: "+telefone+"\n Endereço: "+endereco
				+"\n Número da instalação: "+numeroInstalacao+"\n Valor da fatura: R$%2.2f",valorConta);
		
	}
	
}//END
