# indiceComposicaoEndividamento
A Composição do Endividamento, também conhecida por composição de exigibilidades, é um indicador que mostra a relação entre a dívida de curto prazo e a dívida total de uma companhia. Ele deve ser usado por gestores como ferramenta para definição de estratégias de gerenciamento da dívida.

```
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
