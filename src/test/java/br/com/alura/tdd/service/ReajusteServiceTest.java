package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	private ReajusteService reajusteService;
	private Funcionario funcionario;
	
	@BeforeEach
	public void inicializar() {
		this.reajusteService = new ReajusteService();
		this.funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal("1000"));
	}

	@Test
	@DisplayName("Reajuste de 15% com desempenho a desejar")
	public void reajusteDe3PorCentoComDesempenhoADesejar() {
		reajusteService.reajustarSalario(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	@DisplayName("Reajuste de 15% com desempenho bom")
	public void reajusteDe15PorCentoComDesempenhoBom() {
		reajusteService.reajustarSalario(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	@DisplayName("Reajuste de 20% com desempenho otimo")
	public void reajusteDe20PorCentoComDesempenhoOtimo() {
		reajusteService.reajustarSalario(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
	
}
