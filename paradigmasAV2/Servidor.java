package paradigmasAV2;

public class Servidor extends Usuario{
	private int id;
	private int documento;
	private String nome;
	
	//getters retornam o valor das variáveis
	public int getId() {
		return id;
	}
	public int getDocumento() {
		return documento;
	}
	public String getNome() {
		return nome;
	}
	
	//setters definem o valor das variáveis
	public void setId(int id) {
		this.id = id;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//TODO add funções de empréstimo e devolução
}
