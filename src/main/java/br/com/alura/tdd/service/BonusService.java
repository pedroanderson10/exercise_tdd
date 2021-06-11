package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			//valor = BigDecimal.ZERO;
			//Exception utilizada quando um argumento � ilegal/inv�lido
			throw new IllegalArgumentException("Funcion�rio n�o pode receber b�nus, pois possui sal�rio > R$10.000"); 
		}
		
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
