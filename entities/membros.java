package projeto.entities;

public class membros {

    private String nome;
    private int idade;
    private String cpf;
    private String contato;
    private String departamento;

    public membros(String nome,int idade,String cpf,String contato, String departamento){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.contato = contato;
        this.departamento = departamento;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String toString(){
		return " Nome : " + getNome() + "\n" +
			   " | Idade : " + getIdade() + "\n" +
			   " | CPF: " + getCpf() + "\n" +
			   " | Contato : " + getContato() + "\n" +
			   " Departamento : " + getDepartamento();
	}
}
