package br.com.space.vininha.base;

import java.awt.Color;
import java.awt.Graphics2D;

public class Elemento {

	private int px;//pixel eixo x
	private int py;//pixel eixo y
	private int largura;
	private int altura;
	private int velocidade;
	private boolean ativo;//atualiza e desenha o personagem
	private Color cor;

	public Elemento() {
	}

	public Elemento(int px, int py, int largura, int altura) {
		this.px = px;
		this.py = py;
		this.largura = largura;
		this.altura = altura;
	}

	public void atualiza() {
	}

	public void desenha(Graphics2D g) {
		g.drawRect(px, py, largura, altura);
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getPy() {
		return py;
	}

	public void setPy(int py) {
		this.py = py;
	}

	public int getVel() {
		return velocidade;
	}

	public void setVel(int vel) {
		this.velocidade = vel;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}

	public void incPx(int x) {
		//muda a posicao do elemento na tela
		px = px + x;
	}

	public void incPy(int y) {
		//muda a posicao do elemento na tela
		py = py + y;
	}

}
