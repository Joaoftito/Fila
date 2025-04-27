package view;

import controller.FilaController;

public class FilaTeste {

	public static void main(String[] args) {

		try {
			FilaController fila = new FilaController();
			System.out.println(fila.teste());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
