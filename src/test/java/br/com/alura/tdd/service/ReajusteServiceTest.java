package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	@Test
	public void reajusteDe3PorCentoComDesempenhoADesejar() {
		ReajusteService reajusteService = new ReajusteService();
		Funcionario funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal("1000")); 
		
		reajusteService.reajustarSalario(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDe15PorCentoComDesempenhoBom() {
		ReajusteService reajusteService = new ReajusteService();
		Funcionario funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal("1000")); 
		
		reajusteService.reajustarSalario(funcionario, Desempenho.BOM);
		
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDe20PorCentoComDesempenhoOtimo() {
		ReajusteService reajusteService = new ReajusteService();
		Funcionario funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal("1000")); 
		
		reajusteService.reajustarSalario(funcionario, Desempenho.OTIMO);
		
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
	
}
