package ProjetoEnergiaLimpa;

public class Cliente {

	//ATRIBUTOS
    protected String nome;
    protected String telefone;
    protected String endereco;
    protected String  numeroInstalacao;
    protected float consumoKwh;
    protected double valorConta;
    
    
    //CONSTRUTOR
    public Cliente(String nome, String telefone, String endereco, String numeroInstalacao,
            float consumoKwh, double valorConta) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numeroInstalacao = numeroInstalacao;
        this.consumoKwh = consumoKwh;
        this.valorConta = valorConta;
    }


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


	public float getConsumoKwh() {
		return consumoKwh;
	}


	public void setConsumoKwh(float consumoKwh) {
		this.consumoKwh = consumoKwh;
	}


	public double getValorConta() {
		return valorConta;
	}


	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}


	public void verificarInstalacao() {
        if (getNumeroInstalacao().length() != 10) {

            System.out.println("\nNúmero de instalação deve conter dez números. "
                    + "\nPor favor, digite novamente o número da instalação: " + numeroInstalacao);

            while (getNumeroInstalacao().length() != 10) {
                System.out.println("\n Número de instalação deve conter dez números. " + "Por favor, digite novamente: "
                        + numeroInstalacao);
            }
        }
    }
	
} //end
