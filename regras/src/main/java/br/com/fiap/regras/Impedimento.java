package br.com.fiap.regras;

public class Impedimento {

	public boolean estaImpedido(Double posicaoAtaque, Double posicaoDefesa) {
		if (posicaoAtaque > posicaoDefesa) {
			return true;
		} else {
			return false;
		}
	}
}
