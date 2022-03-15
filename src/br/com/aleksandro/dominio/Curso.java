package br.com.aleksandro.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{
	private int cargaHoraria;	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public double calcularXp() {
		return Conteudo.XP_PADRAO*cargaHoraria;
	}
	@Override
	public String toString() {
		return "Titulo="+this.getTitulo()+", Descricao="+this.getDescricao()+", Carga Horaria="+this.cargaHoraria;
	}	
}
