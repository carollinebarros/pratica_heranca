package entidades;

public class Telefonista extends Funcionario {

	private String codigo;
	
	public Telefonista() {
		this.codigo = null;
	}

	public Telefonista(String nome, double salario, String codigo) {
		super(nome, salario);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	public String imprimedados() {
		return " " + super.imprimedados() + " " + "CÓDIGO: "  
		           + getCodigo(); 
	}


}
