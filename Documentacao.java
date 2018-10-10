package negocio;

public class Documentacao {
	private String cpf;
	private String rg;
	private String titulo;
	private String ctps;
	
	
	public void exibir() {
		
		System.out.println("#Documentação\n");
		
		System.out.printf(
				"CPF: %s\n"
			  + "RG: %s\n"
			  + "Titulo: %s\n"
			  + "CTPS: %s\n\n",
			  cpf,
			  rg,
			  titulo,
			  ctps
			);
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getCtps() {
		return ctps;
	}


	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
}
