package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	

	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	
	// Reajustar Sal?rio
	public void reajustarSalario(BigDecimal reajuste) {
		this.salario = reajuste;
		arredondarSalario();
	}


	//M?todo privado ? utilit?rio interno da classe, logo, n?o se testa 
	private void arredondarSalario() {
		this.salario = this.salario.setScale(2, RoundingMode.HALF_UP);
	}
	
	
	
	

	

}
