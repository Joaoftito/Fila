package model;

public class Fila<T> {

	private No<T> inicio = null;
	private No<T> fim = null;

	public void Enqueue(T elemento) {
		No<T> celula = new No<T>(elemento);

		if (this.inicio == null) {
			this.inicio = celula;
			this.fim = celula;

		} else {
			this.fim.setProximo(celula);
			this.fim = celula;
		}
	}

	public No<T> Dequeue() throws Exception{
		if (this.inicio == null) {
			throw new Exception("Não existe item na lista");
		}

		No<T> celula = this.inicio;
		this.inicio = celula.getProximo();
		return celula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		No<T> atual = this.inicio;

		while (atual != null) {
			builder.append(atual.getElemento());
			atual = atual.getProximo();
			if (atual != null) {
				builder.append(",");
			}
		}

		builder.append("]");
		return builder.toString();
	}

}
