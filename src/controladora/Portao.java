package controladora;

public class Portao {

	public final int posicaoInicial = 0;
	public final int posicialFinal = 5;

	public final EstadosPortao estadoAtual;
	public final EstadosPortao estadoAnterior;
	public final int posicaoAtual;

	Portao() {
		estadoAtual = EstadosPortao.Fechado;
		estadoAnterior = EstadosPortao.Fechado;
		posicaoAtual = 0;
	}

	Portao(final int posicao, final EstadosPortao estado, final EstadosPortao estadoAnterior) {
		estadoAtual = estado;
		posicaoAtual = posicao;
		this.estadoAnterior = estadoAnterior;
	}
}
