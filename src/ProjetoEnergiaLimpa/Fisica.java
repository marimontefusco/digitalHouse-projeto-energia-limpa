package ProjetoEnergiaLimpa;

public class Fisica extends Cliente implements Interface {

	private String cpf;
	private float  renda;
	
	public Fisica( String nome, String telefone, String endereco, String numeroInstalacao,
			float consumoKwh, double valorConta, String cpf, float renda) {	
		super(nome, telefone, endereco, numeroInstalacao, consumoKwh, valorConta);
		
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
	{
		double desconto = valorConta - (valorConta * 0.15);
				return desconto;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome do usuário: " + nome + "\nTelefone: " + telefone + "\nEndereço: "+ endereco
				+"\nNúmero da instalação: " + numeroInstalacao + "\nConsumo em KWh: " + consumoKwh
				+"\nValor da conta " + valorConta);	
	}

}
