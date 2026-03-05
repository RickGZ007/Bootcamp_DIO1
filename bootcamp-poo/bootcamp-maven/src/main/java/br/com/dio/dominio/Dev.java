package br.com.dio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

/**
 * ABSTRAÇÃO: Modela o Dev (aluno) com seus conteúdos inscritos e concluídos.
 * ENCAPSULAMENTO: lógica de progressão e cálculo de XP encapsulada nos métodos.
 */
public class Dev {

    private String nome;

    // Conteúdos que o Dev ainda precisa concluir
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

    // Conteúdos que o Dev já finalizou
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Inscreve o Dev em todos os conteúdos de um Bootcamp.
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        System.out.println("✅ " + this.nome + " inscrito no Bootcamp: " + bootcamp.getNome());
    }

    /**
     * Progride no próximo conteúdo inscrito (move de inscrito → concluído).
     * Usa Optional para tratar o caso de não haver mais conteúdos.
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
            System.out.println("📚 " + this.nome + " concluiu: " + conteudo.get().getTitulo());
        } else {
            System.out.println("⚠️  " + this.nome + " não possui conteúdos para progredir!");
        }
    }

    /**
     * Calcula o XP total somando o XP de cada conteúdo concluído.
     * POLIMORFISMO em ação: calcularXp() se comporta diferente para Curso e Mentoria.
     */
    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Set<Conteudo> getConteudosInscritos() { return conteudosInscritos; }
    public Set<Conteudo> getConteudosConcluidos() { return conteudosConcluidos; }

    @Override
    public String toString() {
        return "Dev { nome='" + nome +
               "', inscritos=" + conteudosInscritos.size() +
               ", concluidos=" + conteudosConcluidos.size() +
               ", totalXP=" + calcularTotalXp() + " }";
    }
}
