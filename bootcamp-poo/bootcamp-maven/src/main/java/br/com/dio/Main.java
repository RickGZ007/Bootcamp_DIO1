package br.com.dio;

import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

/**
 * Classe principal: transforma as CLASSES em OBJETOS e demonstra
 * na prática os 4 pilares da POO aplicados ao domínio Bootcamp.
 */
public class Main {

    public static void main(String[] args) {

        // ══════════════════════════════════════════
        //  1. CRIANDO OS CONTEÚDOS (Cursos e Mentorias)
        // ══════════════════════════════════════════

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Fundamentos");
        cursoJava.setDescricao("Aprenda os fundamentos da linguagem Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoPoo = new Curso();
        cursoPoo.setTitulo("Programação Orientada a Objetos com Java");
        cursoPoo.setDescricao("Domine os 4 pilares da POO: Abstração, Encapsulamento, Herança e Polimorfismo");
        cursoPoo.setCargaHoraria(12);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Spring Boot do Zero");
        cursoSpring.setDescricao("Criação de APIs REST com Spring Boot 3");
        cursoSpring.setCargaHoraria(10);

        Mentoria mentoriaCarreira = new Mentoria();
        mentoriaCarreira.setTitulo("Mentoria de Carreira Dev");
        mentoriaCarreira.setDescricao("Como ingressar e crescer no mercado de tecnologia");
        mentoriaCarreira.setData(LocalDate.of(2024, 4, 15));

        Mentoria mentoriaCodigo = new Mentoria();
        mentoriaCodigo.setTitulo("Mentoria de Boas Práticas");
        mentoriaCodigo.setDescricao("Clean Code e SOLID na prática");
        mentoriaCodigo.setData(LocalDate.of(2024, 4, 22));

        // ══════════════════════════════════════════
        //  2. CRIANDO O BOOTCAMP e adicionando conteúdos
        // ══════════════════════════════════════════

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Formação completa para se tornar um Java Developer!");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPoo);
        bootcamp.getConteudos().add(cursoSpring);
        bootcamp.getConteudos().add(mentoriaCarreira);
        bootcamp.getConteudos().add(mentoriaCodigo);

        System.out.println("══════════════════════════════════════════════");
        System.out.println("  🚀 " + bootcamp.getNome());
        System.out.println("  " + bootcamp.getDescricao());
        System.out.println("  Período: " + bootcamp.getDataInicial() + " → " + bootcamp.getDataFinal());
        System.out.println("══════════════════════════════════════════════\n");

        // ══════════════════════════════════════════
        //  3. CRIANDO OS DEVS e inscrevendo no Bootcamp
        // ══════════════════════════════════════════

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println();

        // ══════════════════════════════════════════
        //  4. DEVS PROGREDINDO nos conteúdos
        // ══════════════════════════════════════════

        System.out.println("\n--- Progresso de Camila ---");
        devCamila.progredir(); // conclui Java Fundamentos
        devCamila.progredir(); // conclui POO com Java
        devCamila.progredir(); // conclui Spring Boot

        System.out.println("\n--- Progresso de João ---");
        devJoao.progredir();   // conclui Java Fundamentos
        devJoao.progredir();   // conclui POO com Java

        // ══════════════════════════════════════════
        //  5. EXIBINDO RESULTADOS FINAIS
        // ══════════════════════════════════════════

        System.out.println("\n══════════════════════════════════════════════");
        System.out.println("  📊 RELATÓRIO FINAL");
        System.out.println("══════════════════════════════════════════════");

        System.out.println("\n🧑‍💻 " + devCamila.getNome());
        System.out.println("  Conteúdos inscritos  : " + devCamila.getConteudosInscritos());
        System.out.println("  Conteúdos concluídos : " + devCamila.getConteudosConcluidos());
        System.out.printf ("  XP Total             : %.1f%n", devCamila.calcularTotalXp());

        System.out.println("\n🧑‍💻 " + devJoao.getNome());
        System.out.println("  Conteúdos inscritos  : " + devJoao.getConteudosInscritos());
        System.out.println("  Conteúdos concluídos : " + devJoao.getConteudosConcluidos());
        System.out.printf ("  XP Total             : %.1f%n", devJoao.calcularTotalXp());

        System.out.println("\n══════════════════════════════════════════════");
        System.out.println("  XP por Conteúdo (Polimorfismo em ação)");
        System.out.println("══════════════════════════════════════════════");
        System.out.printf("  %-40s XP: %.1f%n", cursoJava.getTitulo(),    cursoJava.calcularXp());
        System.out.printf("  %-40s XP: %.1f%n", cursoPoo.getTitulo(),     cursoPoo.calcularXp());
        System.out.printf("  %-40s XP: %.1f%n", cursoSpring.getTitulo(),  cursoSpring.calcularXp());
        System.out.printf("  %-40s XP: %.1f%n", mentoriaCarreira.getTitulo(), mentoriaCarreira.calcularXp());
        System.out.printf("  %-40s XP: %.1f%n", mentoriaCodigo.getTitulo(),   mentoriaCodigo.calcularXp());
    }
}
