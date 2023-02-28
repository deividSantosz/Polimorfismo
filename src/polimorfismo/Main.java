package polimorfismo;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner (System.in);	
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		System.out.println("Digite a quantidade de produtos");
		int n = sc.nextInt();
		
		List<Produto> list = new ArrayList<>();
		
		for (int i =1; i<=n; i++) {
			System.out.println("Product #:" +i);
			System.out.println("Esse produto é usado, importado ou novo? (u/i/n)");
			char op = sc.next().charAt(0);
			
			if(op == 'u') {
				System.out.print("Nome:");
				String nome = sc.next();
				System.out.print("Preco:");
				Double preco = sc.nextDouble();
				System.out.print("Data: (DD/MM/YYYY");
				Date data = sdf.parse(sc.next());
				list.add(new ProdutoUsado(nome, preco, data));
			}
			
			if (op == 'i') {
				System.out.print("Nome:");
				String nome = sc.next();
				System.out.print("Preco:");
				Double preco = sc.nextDouble();
				System.out.print("Custos:");
				Double custos = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, custos));
			}
			if(op == 'n') {
				System.out.print("Nome:");
				String nome = sc.next();
				System.out.print("Preco:");
				Double preco = sc.nextDouble();
				list.add(new Produto(nome, preco));
			}
		}
		
		System.out.println("PRICE TAGS:");
		
			for (Produto p : list) {
				System.out.println(p.toString());
			}
		
		sc.close();



	}

}
