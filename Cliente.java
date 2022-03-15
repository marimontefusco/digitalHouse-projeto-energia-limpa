package ProjetoEnergiaLimpa;//SUPERCLASS

public class Cliente {
	
	//ATRIBUTOS --> CARACTERISTICAS
	protected String nome; //protected = acesso por herança ou pacote
	protected String telefone;
	protected String endereco;
	protected String numeroInstalacao;
	protected double valorConta;
	protected double kgLixo;
	

	//CONSTRUTOR --> INSTANCIAR A CLASSE QUE FOI DEFINIDA
	public Cliente(String nome, String telefone, String endereco, String numeroInstalacao, double valorConta,
			double kgLixo) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.numeroInstalacao = numeroInstalacao;
		this.valorConta = valorConta;
		this.kgLixo = kgLixo;
	}
	

	//GETTER AND SETTER --> GET = ACESSA E SET = MODIFICA -- SÃO MÉTODOS PARA PODER MANIPULAR OS ATRIBUTOS EM OUTRA CLASS
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNumeroInstalacao() {
		return numeroInstalacao;
	}


	public void setNumeroInstalacao(String numeroInstalacao) {
		this.numeroInstalacao = numeroInstalacao;
	}


	public double getValorConta() {
		return valorConta;
	}


	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}


	public double getKgLixo() {
		return kgLixo;
	}


	public void setKgLixo(double kgLixo) {
		this.kgLixo = kgLixo;
	}
	
	
	//CRIANDO UM MÉTODO ESPECÍFICO DA CLASSE 
	public double pesoLixo(double kgLixo) 
	{
		double peso;
		peso = kgLixo * 0.75;
		return peso;
	}
	
	
	
}//END



