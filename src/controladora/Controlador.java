package controladora;


public class Controlador {

	private static Portao abrir(final Portao portao) {
		if (portao.posicaoAtual == portao.posicialFinal) {
			return new Portao(portao.posicaoAtual, EstadosPortao.Aberto, portao.estadoAtual);
		}
		return new Portao(portao.posicaoAtual + 1, EstadosPortao.Abrindo, portao.estadoAtual);
	}

	private static Portao fechar(final Portao portao) {
		if (portao.posicaoAtual == portao.posicaoInicial) {
			return new Portao(portao.posicaoAtual, EstadosPortao.Fechado, portao.estadoAtual);
		}
		return new Portao(portao.posicaoAtual - 1, EstadosPortao.Fechando, portao.estadoAtual);
	}

	public static Portao tratarTempo(final Portao portao) {
		if (portao.estadoAtual == EstadosPortao.Fechado || portao.estadoAtual == EstadosPortao.Aberto || portao.estadoAtual == EstadosPortao.Parado) {
			return portao;
		}

		if (portao.estadoAtual == EstadosPortao.Abrindo) {
			return abrir(portao);
		}

		return fechar(portao);
	}

	public static Portao tratarBotao(final Portao portao) {
		if (portao.estadoAtual == EstadosPortao.Abrindo || portao.estadoAtual == EstadosPortao.Fechando) {
			return new Portao(portao.posicaoAtual, EstadosPortao.Parado, portao.estadoAtual);
		}

		if (portao.estadoAtual == EstadosPortao.Parado) {
			if (portao.estadoAnterior == EstadosPortao.Abrindo) {
				return abrir(portao);
			}
			return fechar(portao);
		}

		if (portao.estadoAtual == EstadosPortao.Aberto) {
			return fechar(portao);
		}

		return abrir(portao);
	}

	public static Portao tratarObstaculo(final Portao portao) {
		if (portao.estadoAtual == EstadosPortao.Fechado || portao.estadoAtual == EstadosPortao.Parado || portao.estadoAtual == EstadosPortao.Aberto) {
			return portao;
		}

		if (portao.estadoAtual == EstadosPortao.Abrindo) {
			return fechar(portao);
		}

		return abrir(portao);
	}
}
