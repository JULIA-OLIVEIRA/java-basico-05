package br.fai.projeto05;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	private void start() {
		
		System.out.println("Enviando para o github");
		
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 1:
				System.out.println("primeira condicao");
				break;
				
			case 4:
				System.out.println("segunda condicao");
				break;
				
			default:
				System.out.println("Não encontrou uma condição");
			}
		}
	}

}
