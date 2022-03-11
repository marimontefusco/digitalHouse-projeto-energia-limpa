package ProjetoEnergiaLimpa;

import java.text.NumberFormat;

public class Cliente {


	//ATRIBUTOS
    protected String nome;
    protected String telefone;
    protected String endereco;
    protected String  numeroInstalacao;    
    protected double valorConta;
    protected double kgLixo;
    
    
    //CONSTRUTOR
    public Cliente(String nome, String telefone, String endereco, String numeroInstalacao,
            double valorConta, double kgLixo) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numeroInstalacao = numeroInstalacao;       
        this.valorConta = valorConta;
        this.kgLixo = kgLixo;
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


	public double pesoLixo(double kgLixo) {
		kgLixo += (kgLixo * 0.75);
		 return kgLixo;
	}
	
    
}
