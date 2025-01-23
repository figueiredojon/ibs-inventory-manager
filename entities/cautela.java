package projeto.entities;

public class cautela extends cadastroItem {
    private String nome;
	private int telefone;
	private String finalidadeCautela;
	private boolean situacaopedido; 
	private String devolver;

	public cautela(){
		
	}
	//Itens da cautela: todos mais 
	public cautela(String item, String finalidade, String cor, String marca, int quantidade, int local, String nome, int telefone, String finalidadeCautela, boolean situacaopedido, String devolver) {
		super(item,finalidade, cor, marca, quantidade,local);
		this.nome = nome;
		this.telefone = telefone;
		this.finalidadeCautela = finalidadeCautela;
		this.situacaopedido = situacaopedido;
		this.devolver = devolver;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getFinalidade() {
		return finalidadeCautela;
	}

	public void setFinalidade(String finalidadeCautela) {
		this.finalidadeCautela = finalidadeCautela;
	}

	public String getDevolver() {
		return devolver;
	}

	public void setDevolver(String devolver) {
		this.devolver = devolver;
	}

	public void exibirsituacaodopedido() {
		if (this.situacaopedido == true) {
			System.out.println("Situação do pedido: APROVADO");
		} else {
			System.out.println("Situação do pedido: NEGADO");
		}
	}

    public void responsavel(){
        if (this.situacaopedido == true) {
            exibirsituacaodopedido();
            System.out.println("Item em posse de: " + this.nome);
			System.out.println("Telefone: " + this.telefone);
        } else {
            System.out.println("Nenhuma cautela associada.");
        }
    }
}

