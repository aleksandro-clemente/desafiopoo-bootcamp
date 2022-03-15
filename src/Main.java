import java.time.LocalDate;

import br.com.aleksandro.dominio.Bootcamp;
import br.com.aleksandro.dominio.Conteudo;
import br.com.aleksandro.dominio.Curso;
import br.com.aleksandro.dominio.Dev;
import br.com.aleksandro.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de js");
		curso2.setDescricao("Descrição curso de js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAleks = new Dev();
		devAleks.setNome("Aleksandro");
		devAleks.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos incritos Aleksandro: "+devAleks.getConteudosInscritos());
		devAleks.progredir();
		devAleks.progredir();
		devAleks.progredir();
		System.out.println("Conteudos incritos Aleksandro: "+devAleks.getConteudosInscritos());
		System.out.println("Conteudos concluidos Aleksandro: "+devAleks.getConteudosConcluidos());
		System.out.println("Xp: "+devAleks.calcularTotalXp());
		System.out.println("------");
		Dev devSantos = new Dev();
		devSantos.setNome("Santos");
		devSantos.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Santos: "+devSantos.getConteudosInscritos());
		devSantos.progredir();
		System.out.println("Conteudos inscritos Santos: "+devSantos.getConteudosInscritos());
		System.out.println("Conteudos concluidos Santos: "+devSantos.getConteudosConcluidos());
		System.out.println("Xp: "+devSantos.calcularTotalXp());
		
		
		
		
	}
}
