package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void reajustarSalario(Funcionario funcionario, Desempenho desempenho) {
		
		funcionario.setSalario(funcionario.getSalario().multiply(desempenho.percentualReajuste()).setScale(2, RoundingMode.HALF_UP) );
		
		/*
		if (desempenho == Desempenho.A_DESEJAR) {
			funcionario.setSalario(funcionario.getSalario().multiply(new BigDecimal("1.03")).setScale(2, RoundingMode.HALF_UP) );
		}else if (desempenho == Desempenho.BOM) {
			funcionario.setSalario(funcionario.getSalario().multiply(new BigDecimal("1.15")).setScale(2, RoundingMode.HALF_UP) );
		}else if (desempenho == Desempenho.OTIMO) {
			funcionario.setSalario(funcionario.getSalario().multiply(new BigDecimal("1.20")).setScale(2, RoundingMode.HALF_UP) );
		}*/
		
	}

}
