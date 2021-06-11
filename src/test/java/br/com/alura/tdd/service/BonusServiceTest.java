package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	private BonusService bonusService;
	private BigDecimal bonus;

	@Test
	@DisplayName("Bonus 0 para sal�rio acima de R$10.000")
	void bonusZeroParaFuncionarioComSalarioAlto() {
		BonusService bonusService = new BonusService();
		//BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal("15000")) );
		
		assertThrows(IllegalArgumentException.class, 
				() -> bonusService.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal("15000"))) );
		
		/*try { //Importante para quando for necess�rio capturar a exception, verificar vari�veis, mensagens
			bonusService.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal("15000")) );
			fail("A exception n�o foi lan�ada");
		} catch (Exception e) {
			assertEquals("Funcion�rio n�o pode receber b�nus, pois possui sal�rio > R$10.000", e.getMessage());
		}*/
		
		
		//assertEquals(new BigDecimal("0.00"), bonus);
	}
	
	@Test
	@DisplayName("Bonus 10% para sal�rios abaixo de R$10.000")
	void bonusDe10PorCentoParaFuncionario() {
		bonusService = new BonusService();
		bonus = bonusService.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal("5000")) );
		
		assertEquals(new BigDecimal("500.00"), bonus);
	}
	
	@Test
	@DisplayName("Bonus 10% para sal�rio exato de R$10.000")
	void bonusDeExatamente1000ReaisParaSalarioDe10000() {
		BonusService bonusService = new BonusService();
		BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal("10000")) );
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
