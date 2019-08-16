package controladora;

public class Processador {

	public String executar(final String entrada) {
		final StringBuilder saida = new StringBuilder();
		Portao portao = new Portao();
		
		for (int i = 0; i < entrada.length(); i++) {

			switch (entrada.charAt(i)) {
			case '.': 						// NADA A FAZER
				portao = Controlador.tratarTempo(portao);
				break;

			case 'P':						// BOTAO PRESSIONADO
				portao = Controlador.tratarBotao(portao);
				break;
				
			case 'O':						// OBSTACULO
				portao = Controlador.tratarObstaculo(portao);
				break;
			}
			saida.append(portao.posicaoAtual);
		}
		
		return saida.toString();
	}

}
