package pilhaDinamica;

public class PilhaDinamica {
	private CelulaPilha top;

	public void push(String elemento) {
		CelulaPilha novaCelula = new CelulaPilha();
		novaCelula.setDado(elemento);
		novaCelula.setAnterior(this.top);
		this.top = novaCelula;
	}

	public boolean isEmpty() {
		if (this.top == null) {

			return true;
		} else
			return false;
	}

	public String pop() {
		if (!isEmpty()) {
			String elemento = this.top.getDado();
			this.top = this.top.getAnterior();
			return elemento;
		} else {
			System.out.println("Pilha Vazia!!!");
			return null;
		}
	}

	public String peek() {
		if (!isEmpty()) {
			String elemento = this.top.getDado();
			return elemento;
		} else {
			System.out.println("Pilha Vazia!!!");
			return null;
		}
	}

	public int sizePilha() {
		CelulaPilha p;
		int cont = 0;
		p = this.top;
		while (p != null) {
			p = p.getAnterior();
			cont++;
		}
		return cont;
	}

	public void imprimir() {
		CelulaPilha p;
		p = this.top;
		if (isEmpty()) {
			System.out.println("Pilha Vazia!!!");
		} else {
			while (p != null) {
				System.out.println("Nome na pilha..: " + p.getDado());
				p = p.getAnterior();
			}
		}
	}

	public CelulaPilha top() {
		if (isEmpty()) {
			System.out.println("Pilha Vazia!!!");
			return null;
		} else {
			System.out.println("Nome no topo da Pilha..: " + top.getDado());
			return this.top;
		}
	}
}
