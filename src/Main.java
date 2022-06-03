import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


        System.out.println("-----------------");

        Dev devTomasia = new Dev();
        devTomasia.setNome("Tomasia");
        devTomasia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Tomasia: " + devTomasia.getConteudosInscritos());
        devTomasia.progredir();
        devTomasia.progredir();
        devTomasia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Tomasia: " + devTomasia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Tomasia: " + devTomasia.getConteudosConcluidos());
        System.out.println("XP: " + devTomasia.calcularTotalXp());
    }
}
