package br.com.fiap.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.fiap.Financeiro;

public class FinanceiroTest {

	@Test
	public void testCalcularCPMF() {
		Financeiro calculoFinanceiro = new Financeiro();
		Double cpmf = calculoFinanceiro.calcularCPMF(1000.00);
		assertEquals(cpmf, new Double(3.8));
	}

	@Test
	public void testCalcularIRRF() {
		Financeiro calculoFinanceiro = new Financeiro();
		Double irrf = calculoFinanceiro.calcularIRRF(1000.00);
		assertEquals(irrf, new Double(270.0));
	}
	
	@Test
	public void testCalcularIRRFVarios() {
		Financeiro calculoFinanceiro = new Financeiro();
		
		Double[] irrf = new Double[] {
			calculoFinanceiro.calcularIRRF(1000.00),
			calculoFinanceiro.calcularIRRF(2000.00),
			calculoFinanceiro.calcularIRRF(3000.00)
		};
		
		Double[] numeros = new Double[] {
			270.0,
			540.00,
			810.00
		};
		
		assertArrayEquals(irrf, numeros);
		
	}
	
	@Test
	public void testCalcularCPMFVarios() {
		Financeiro calculoFinanceiro = new Financeiro();
		
		Double[] irrf = new Double[] {
			calculoFinanceiro.calcularCPMF(1000.00),
			calculoFinanceiro.calcularCPMF(2000.00),
			calculoFinanceiro.calcularCPMF(3000.00)
		};
		
		Double[] numeros = new Double[] {
			3.8,
			7.6,
			11.4
		};
		
		assertArrayEquals(irrf, numeros);
		
	}
	
	@Test
	public void testCalcularCPMFVazio() {
		Financeiro calculoFinanceiro = new Financeiro();
		
		Double cpmf = calculoFinanceiro.calcularCPMF(0);
		assertNotNull(cpmf);
	}
	
	@Test
	public void testCalcularIRRFIgual() {
		Financeiro calculoFinanceiro = new Financeiro();
		Financeiro objeto2 = calculoFinanceiro;
		
		assertSame(calculoFinanceiro, objeto2);
	}
	
	@Test
	public void testCalcularCPMFNegativo() {
		Financeiro calculoFinanceiro = new Financeiro();
		
		Double cpmf = calculoFinanceiro.calcularCPMF(-1000.00);
		assertTrue(cpmf <= 0);
	}

}
