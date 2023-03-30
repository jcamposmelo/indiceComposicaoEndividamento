public class composicaoEndividamento {
	public static void main(String[] args) {
		double passivoCirculante = 1500000;
		double exigivelLongoPrazo = 130000;

		double composicaoEndividamento;

		composicaoEndividamento = passivoCirculante / (passivoCirculante + exigivelLongoPrazo);

		System.out.println("O índice calculado em Composição do Endividamento é?  " + 
				composicaoEndividamento);

	}
}