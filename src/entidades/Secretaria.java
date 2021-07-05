package entidades;

public class Secretaria extends Funcionario{
	
	private int ramal;
	
	public Secretaria() {
		this.ramal = 0;
	}

	public Secretaria(String nome, double salario, int ramal) {
		super(nome, salario);
		this.ramal = ramal;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	

	public String imprimedados() {
		return  " " + super.imprimedados() + " " + "RAMAL: "
		            + getRamal(); 
	}
	
}
