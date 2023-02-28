package polimorfismo;

public class ProdutoImportado extends Produto {
	private Double custos;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double custos) {
		super(nome, preco);
		this.custos = custos;
	}

	public Double getCustos() {
		return custos;
	}

	public void setCustos(Double custos) {
		this.custos = custos;
	}
	
	public Double totalPreco (Double preco, Double custos) {
		this.preco = preco;
		this.custos = custos;
		return custos + preco;
	}
	@Override
	public String toString() {
		return "Nome: " + nome +
				" Preco: $" + this.totalPreco(preco, custos) +
				" (Custos: $" + custos +
				")";
	}
}
