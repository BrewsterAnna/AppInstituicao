package teste;
import negocio.Especializacao;
import negocio.Graduacao;
import negocio.Documentacao;
import negocio.Coordenador;
public class TestaCurso {
	public static void main(String[] args) {
				
		Documentacao docCoord = new Documentacao();
		docCoord.setCpf("98745632101");
		docCoord.setRg("99999999-9");
		docCoord.setTitulo("666666");
		docCoord.setCtps("8888888");
		
		Coordenador c = new Coordenador();
		c.setNome("Coordenador");
		c.setEmail("coordenador@hot");
		c.setCelular("21-99999999");
		c.setEndereco("Centro - RJ");
		c.setDocumentacao(docCoord);
		
		
		Documentacao d = new Documentacao();
		d.setCpf("12345678910");
		d.setRg("271307523");
		d.setTitulo("12345678");
		d.setCtps("21060085005");
		
		
		Graduacao g = new Graduacao("Joao", 480, 1000, true);
		g.setCoordenador(c);
		g.setDocumentacao(d);
		g.exibir();
				
		Especializacao e = new Especializacao("Maria", 480, 1000, 2017);
		e.setCoordenador(c);
		e.exibir();
		
		
	}
	
	
}
