package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	@DisplayName("Bonus 0 para salário acima de R$10.000")
	void bonusZeroParaFuncionarioComSalarioAlto() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal("15000")) );
		
		assertEquals(new BigDecimal("0.00"), bonus);
	}
	
	@Test
	@DisplayName("Bonus 10% para salários abaixo de R$10.000")
	void bonusDe10PorCentoParaFuncionario() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal("5000")) );
		
		assertEquals(new BigDecimal("500.00"), bonus);
	}
	
	@Test
	@DisplayName("Bonus 10% para salário exato de R$10.000")
	void bonusDeExatamente1000ReaisParaSalarioDe10000() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal("10000")) );
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
