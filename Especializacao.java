package negocio;

public class Especializacao extends Curso {

	private int anoTerminoGraduacao;

	public Especializacao(String nome, int cargaHoraria, float valor, int anoTerminoGraduacao) {
		super(nome, cargaHoraria, valor);
		this.anoTerminoGraduacao = anoTerminoGraduacao;
		
	}
	
	public void exibir() {
		System.out.println("#especializacao");

		super.exibir();
		
		System.out.printf(
				"Término graduação: %d\n\n",
			  anoTerminoGraduacao
			);
	}
	
	public int getAnoTerminoGraduacao() {
		return anoTerminoGraduacao;
	}
	public void setAnoTerminoGraduacao(int anoTerminoGraduacao) {
		this.anoTerminoGraduacao = anoTerminoGraduacao;
	}	
}
