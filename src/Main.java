import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("julia");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julia:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("---------");
        System.out.println("Conteúdos Inscritos Julia:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Julia" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());


        Dev dev2 = new Dev();
        dev2.setNome("Luna");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luna:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("---------");
        System.out.println("Conteúdos Inscritos Luna:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luna" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());





    }
}
