package util;

import pilhaDinamica.PilhaDinamica;

public class Calc {

	public boolean verificarExpressao(String expressao) {
		PilhaDinamica pilha = new PilhaDinamica();
		String[] elementos = expressao.split("");

		for (String elemento : elementos) {
			if (elemento.equals("(") || elemento.equals("{") || elemento.equals("[")) {
				pilha.push(elemento);
			} else if (elemento.equals(")") || elemento.equals("}") || elemento.equals("]")) {
				if (pilha.isEmpty()) {
					return false;
				}
				String top = pilha.pop();
				if ((elemento.equals(")") && !top.equals("(")) || (elemento.equals("]") && !top.equals("["))
						|| (elemento.equals("}") && !top.equals("{"))) {
					return false;
				}
			}
		}
		return pilha.isEmpty();
	}

}
