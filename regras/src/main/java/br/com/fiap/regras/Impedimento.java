package br.com.fiap.regras;

public class Impedimento {

	public boolean estaImpedido(Double posicaoAtaque, Double posicaoDefesa) {
		boolean flag = false;
		if (posicaoAtaque > posicaoDefesa) {
			flag = true;
		}
		
		return flag;
	}
}
