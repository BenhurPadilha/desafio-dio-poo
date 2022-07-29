import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descri��o Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descri��o Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descri��o Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descri��o do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devBenhur = new Dev();
        devBenhur.setNome("Benhur");
        devBenhur.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos inscritos Benhur: " + devBenhur.getConteudosInscritos());
        devBenhur.progredir();
        devBenhur.progredir();
        System.out.println("-");
        System.out.println("Conte�dos inscritos Benhur: " + devBenhur.getConteudosInscritos());
        System.out.println("Conte�dos conclu�dos Benhur: " + devBenhur.getConteudosConcluidos());
        System.out.println("XP: " + devBenhur.calcularTotalXp());

        System.out.println("-------------");

        Dev devZezinho = new Dev();
        devZezinho.setNome("Zezinho");
        devZezinho.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos inscritos Zezinho: " + devZezinho.getConteudosInscritos());
        devZezinho.progredir();
        devZezinho.progredir();
        devZezinho.progredir();
        System.out.println("-");
        System.out.println("Conte�dos inscritos Zezinho: " + devZezinho.getConteudosInscritos());
        System.out.println("Conte�dos conclu�dos Zezinho: " + devZezinho.getConteudosConcluidos());
        System.out.println("XP: " + devZezinho.calcularTotalXp());

    }
}
