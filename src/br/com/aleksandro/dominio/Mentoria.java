package br.com.aleksandro.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;

	@Override
	public double calcularXp() {
		return Conteudo.XP_PADRAO+20;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Titulo="+this.getTitulo()+", Descricao="+this.getDescricao()+", Data="+this.data;
	}
	
}
