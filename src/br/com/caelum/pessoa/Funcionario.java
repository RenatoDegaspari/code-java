package br.com.caelum.pessoa;

public abstract class Funcionario {

	protected String nome;
	protected String CPF;
	protected double salario;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		this.CPF = cPF;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonificacao();
	

}
