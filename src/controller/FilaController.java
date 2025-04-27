package controller;

import model.Fila;

public class FilaController {
	
	public FilaController() {
		super();
	}
	
	public String teste() throws Exception {
		Fila fila = new Fila();
		
		fila.Enqueue(1);
		fila.Enqueue(2);
		fila.Enqueue(3);
		fila.Enqueue(4);
		fila.Enqueue(5);
		fila.Enqueue(6);
		fila.Enqueue(7);
		fila.Enqueue(8);
		fila.Enqueue(9);
		fila.Enqueue(10);
		
		fila.Dequeue();
		fila.Dequeue();
		fila.Dequeue();
		fila.Dequeue();
		fila.Dequeue();
		
		return fila.toString();
	}

}
