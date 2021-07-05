package teste;

import entidades.Gerente;
import entidades.Secretaria;
import entidades.Telefonista;

public class Aplicacao {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("João", 4500, "Gerente1", "senha1");
		Telefonista telefonista = new Telefonista("Mariana", 2500, "codigo");
		Secretaria secretaria = new Secretaria("Raquel", 3500, 01);
				
		System.out.println("+----------------------------------------------------------------+");
		System.out.println("|                RELAÇÃO DE FUNCIONÁRIOS DO BANCO                |");
		System.out.println("+----------------------------------------------------------------+");
		System.out.println(gerente.imprimedados());
		System.out.println(secretaria.imprimedados());
		System.out.println(telefonista.imprimedados());
				
		
			
		

	}

}
