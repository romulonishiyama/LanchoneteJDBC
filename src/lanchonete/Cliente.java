package lanchonete;

import java.util.List;

public class Cliente<E> {
	private String nome;
	private int cpf;
	private String telefone;
	List<E> pedidos;
	
	public Cliente() {
	}
	public Cliente(String nome, int cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;

	}
	
	public String getNome() {
		return this.nome;
	}
	public int getCPF() {
		return this.cpf;
	}
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCPF(int cpf) {
		this.cpf = cpf;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public List<E> getPedidos() {
		return this.pedidos;
	}
	public void setPedidos(List<E> pedidos) {
		this.pedidos = pedidos;
	}
	

}
