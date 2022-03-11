package ProjetoEnergiaLimpa;

public class Fisica extends Cliente implements Interface{
	
	private String cpf;
	private float  renda;
	
	//Construtor 
	public Fisica( String nome, String telefone, String endereco, String numeroInstalacao,
			double valorConta, String cpf, float renda, double kgLixo)

	
	{	
		super(nome, telefone, endereco, numeroInstalacao,
         valorConta, kgLixo);
		
		this.cpf = cpf;
		this.renda= renda;
	}

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

	@Override
	public double reducaoValor() 
	{	getKgLixo();	
		double desconto = valorConta - pesoLixo(kgLixo);
						return desconto;
								
	}
	public void imprimirInfo() {
		System.out.printf("\n Cliente: "+ nome + "\n Telefone: "+telefone+"\n Endereco: "+endereco
				+"\n Número da instalação: "+numeroInstalacao+"\n Valor da conta R$%2.2f",valorConta);
		
	}

	

}
