package polimorfismo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ProdutoUsado extends Produto {
	private Date data;
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date data) {
		super(nome, preco);
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Nome: " + nome +
				" (used) " + 
				" Preco: $" + preco + 
				" (Data: " + sdf.format(data) +
				")";
	}
}
