package ProjetoEnergiaLimpa;

public class Juridica extends Cliente implements Interface{

	private String cnpj;
	private float  renda;
	
	//Construtor 
	public Juridica( String nome, String telefone, String endereco, String numeroInstalacao,
			double valorConta, String cpf, float renda, double kgLixo)

	
	{	
		super(nome, telefone, endereco, numeroInstalacao,
        valorConta, kgLixo);
		
		this.cnpj= cnpj;
		this.renda= renda;
	}

	public String getCpf() {
		return cnpj;
	}

	public void setCpf(String cpf) {
		this.cnpj = cnpj;
	}

	public float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		this.renda = renda;
	}

	@Override
	public double reducaoValor() 
	{
		getKgLixo();	
		double desconto = valorConta - pesoLixo(kgLixo);
					return desconto;
	}
	
	public void imprimirInfo() {
		System.out.printf("Cliente: "+ nome + "\n Telefone: "+telefone+"\n Endereco: "+endereco
				+"\nNúmero da instalação: "+numeroInstalacao+"\n Valor da conta R$%2.2f",valorConta);
		
	}

	
}
