package CalcPesoJantar;

public class Jantar {
	
	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz", 0.350);
		Comida c2 = new Comida("Feij�o", 0.400);

		Pessoa p = new Pessoa("Gabriel", 80.5);

		String apresentar1 = p.Apresentar();
		System.out.println(apresentar1);

		p.Comer(c1);
		System.out.println(p.peso);

		p.Comer(c2);
		System.out.println(p.peso);

		System.out.println("Depois do jantar de hoje, meu novo peso �: " + p.peso + "Kg.");

	}

}
