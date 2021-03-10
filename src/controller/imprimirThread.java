package controller;

public class imprimirThread extends Thread {

	private int x;

	public imprimirThread(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		System.out.println("thread#"+ x + " = " + getId());
	}

}
