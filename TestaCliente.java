package POO_Exercicios;

import POO.Automovel;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Samuel", "souza", 1.87f, 23, 83.45);

		cliente1.visualizar();

		Cliente cliente2 = new Cliente("Felipe", "sousa", 1.64f, 28, 70);

		cliente2.visualizar();

	}

}
