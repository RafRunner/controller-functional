import controladora.Processador;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProcessadorTest {
	@Test
	public void executarTest1() {
		Processador processador = new Processador();
		assertEquals("001234321000", processador.executar("..P...O....."));
	}

	@Test
	public void executarTest2() {
		Processador processador = new Processador();
		assertEquals("012345", processador.executar(".P...."));
	}

	@Test
	public void executarTest3() {
		Processador processador = new Processador();
		assertEquals("000122222345", processador.executar("...P.P...P.."));
	}

	@Test
	public void executarTest4() {
		Processador processador = new Processador();
		assertEquals("123210", processador.executar("P..O.."));
	}

	@Test
	public void executarTest5() {
		Processador processador = new Processador();
		assertEquals("123333343210", processador.executar("P..P...PO..."));
	}

	@Test
	public void executarTest6() {
		Processador processador = new Processador();
		assertEquals("123432344444555", processador.executar("P...O.O.P...P.."));
	}

	@Test
	public void executarTest7() {
		Processador processador = new Processador();
		assertEquals("123455433332100", processador.executar("P.....P.P..P..."));
	}

	@Test
	public void executarTest8() {
		Processador processador = new Processador();
		assertEquals("000001234555555", processador.executar("O..O.P......O.."));
	}

	@Test
	public void executarTest9() {
		Processador processador = new Processador();
		assertEquals("11223", processador.executar("PPPPP"));
	}

	@Test
	public void executarTest10() {
		Processador processador = new Processador();
		assertEquals("121212", processador.executar("P.OOOO"));
	}
}
