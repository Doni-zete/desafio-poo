
import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);


        Curso curso2= new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("memoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/



        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Botcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

            Dev devDoni = new Dev();
            devDoni.setNome("Doni");
            devDoni.inscreverBootcamp(bootCamp);


            devDoni.progredir();
            devDoni.progredir();
        System.out.println("--");
            System.out.println("Conteudos Inscritos Doni:" +devDoni.getConteudosInscritos());
            System.out.println("Conteudos Concluidos Doni:" +devDoni.getConteudosConcluidos());
            System.out.println("XP:" + devDoni.CalcularTotalXp());


        System.out.println("------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Inscritos Camila:" +devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:" +devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.CalcularTotalXp());
    }
    }

