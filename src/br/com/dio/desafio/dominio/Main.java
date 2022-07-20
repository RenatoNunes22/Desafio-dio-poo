package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição do curso java");
        curso.setCargaHoraria(8);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreveBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos " + devRenato.getNome() + ": " + devRenato.getConteudoInscrito());
        System.out.println("Conteudo Concluidos " + devRenato.getNome() + ": " + devRenato.getConteudoConcluido());
        System.out.println("XP de " + devRenato.getNome() + ":" + devRenato.calcularTotalXp());
        System.out.println("------------------------------------------------------");
        devRenato.progredir();
        devRenato.progredir();
        System.out.println("Conteudo Inscritos " + devRenato.getNome() + ": " + devRenato.getConteudoInscrito());
        System.out.println("Conteudo Concluidos " + devRenato.getNome() + ": " + devRenato.getConteudoConcluido());
        System.out.println("XP de " + devRenato.getNome() + ":" + devRenato.calcularTotalXp());
        Dev devAleatorio = new Dev();
        devAleatorio.setNome("Gabriel");
        System.out.println("**------------------------------------------------------**");
        devAleatorio.inscreveBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos " + devAleatorio.getNome() + ": "+ devAleatorio.getConteudoInscrito());
        System.out.println("Conteudo Concluidos " + devAleatorio.getNome() + ": " + devAleatorio.getConteudoConcluido());
        System.out.println("XP de " + devAleatorio.getNome() + ":" + devAleatorio.calcularTotalXp());
        System.out.println("-----------------------------------------------------");
        devAleatorio.progredir();
        System.out.println("Conteudo Inscritos " + devAleatorio.getNome() + ": "+ devAleatorio.getConteudoInscrito());
        System.out.println("Conteudo Concluidos " + devAleatorio.getNome() + ": " + devAleatorio.getConteudoConcluido());
        System.out.println("XP de " + devAleatorio.getNome() + ":" + devAleatorio.calcularTotalXp());
    }
}
