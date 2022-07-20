package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição do curso java");
        curso.setCargaHoraria(50);

        mentoria.setTitutlo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}
