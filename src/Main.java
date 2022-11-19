import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescicao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.increverBootCamp(bootcamp);
        devVitor.progredir();
        devVitor.progredir();
        System.out.println("Conteudos Inscritos" + devVitor.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devVitor.getConteudosCondluidos());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.increverBootCamp(bootcamp);
        devJoao.progredir();
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosCondluidos());

    }
}