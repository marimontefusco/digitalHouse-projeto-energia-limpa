package ProjetoEnergiaLimpa;

public class Juridica extends Cliente implements Interface{
	
	private String cnpj;
	private float renda;
	
	//CONSTRUTOR
	public Juridica(String nome, String telefone, String endereco, String numeroInstalacao, double valorConta,
			double kgLixo, String cnpj, float renda) {
		super(nome, telefone, endereco, numeroInstalacao, valorConta, kgLixo);
		this.cnpj = cnpj;
		this.renda = renda;
	}
	
	
	//GETTER AND SETTER --> GET = ACESSA E SET = MODIFICA -- S�O M�TODOS PARA PODER MANIPULAR OS ATRIBUTOS EM OUTRA CLASS
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}

	
	
	//M�TODOS DA INTERFACE
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
		System.out.printf("\n\n Cliente: "+nome+"\n Telefone: "+telefone+"\n Endere�o: "+endereco
				+ "\n N�mero de instala��o: "+numeroInstalacao+"\n Valor da fatura: R$%2.2f", valorConta);
		
	}
	
	
}//END


