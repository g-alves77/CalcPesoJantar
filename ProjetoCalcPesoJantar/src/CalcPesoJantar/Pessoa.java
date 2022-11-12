package CalcPesoJantar;

public class Pessoa {
	
	String nome;
	double peso;

	Pessoa() {

	}

	Pessoa(String nomeInicial1, double pesoInicial1) {
		nome = nomeInicial1;
		peso = pesoInicial1;
	}

	void Comer(Comida comida) {
		if (comida != null) {
			peso += comida.peso;
		}
	}

	String Apresentar() {
		return "Ol�, meu � " + nome + " e meu peso �: " + peso + "Kg.";
	}

}


}
