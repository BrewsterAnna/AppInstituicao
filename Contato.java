package negocio;

public class Contato {
	private String email;
	private String celular;
	private String endereco;
	
	
	public void exibir() {
		System.out.printf(
				"Email: %s\n"
				+"Celular: %s\n"
				+"Endereco: %s\n\n",
				email,
				celular,
				endereco
				);
	}
}
