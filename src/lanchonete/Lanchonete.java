package lanchonete;

public class Lanchonete {
	final private String CNPJ = "03.002.0001/23";
	private String endereco = "Rua da fome";
	final private String RazaoSocial = "Lanches Dalila";
	
	
	public String getCNPJ() {
		return this.CNPJ;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public String getRazaoSocial() {
		return this.RazaoSocial;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
