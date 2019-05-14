package br.com.space.vininha;

import java.awt.Color;
import java.awt.Graphics2D;

import br.com.space.vininha.base.Elemento;
//deswnha os tirininhos e extende elemento para confirmar as colisoes
public class Tiro extends Elemento {

	private boolean inimigo;

	public Tiro() {
		setLargura(5);
		setAltura(5);
	}

	public Tiro(boolean inimigo) {
		this();
		this.inimigo = inimigo;
	}

	@Override
	public void atualiza() {
	}

	@Override
	public void desenha(Graphics2D g) {
		if (!isAtivo())
			return;

		g.setColor(inimigo ? Color.RED : Color.WHITE);

		g.fillRect(getPx(), getPy(), getLargura(), getAltura());
	}

}
