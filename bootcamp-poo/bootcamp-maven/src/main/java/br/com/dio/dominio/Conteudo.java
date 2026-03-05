package br.com.dio.dominio;

/**
 * ABSTRAÇÃO + HERANÇA:
 * Classe abstrata que representa o conteúdo genérico do Bootcamp.
 * Curso e Mentoria herdam desta classe, aproveitando atributos e métodos comuns.
 */
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    // ENCAPSULAMENTO: atributos privados, acessados via getters/setters
    private String titulo;
    private String descricao;

    // POLIMORFISMO: cada subclasse implementa calcularXp() de forma diferente
    public abstract double calcularXp();

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    @Override
    public String toString() {
        return "titulo='" + titulo + "', descricao='" + descricao + "'";
    }
}
