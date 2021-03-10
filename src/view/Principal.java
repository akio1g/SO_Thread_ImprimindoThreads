package view;

import controller.imprimirThread;

public class Principal {

	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			imprimirThread imprimir = new imprimirThread(i);
			imprimir.start();
		}
	}

}
