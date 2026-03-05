package br.com.dio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ABSTRAÇÃO: Modela o domínio Bootcamp com seus atributos e comportamentos reais.
 * Contém um Set de Conteudos (Cursos e Mentorias) — relacionamento de composição.
 */
public class Bootcamp {

    // ENCAPSULAMENTO: todos os atributos são privados
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal   = LocalDate.now().plusMonths(3);

    // Set garante que não há conteúdos duplicados
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public LocalDate getDataInicial() { return dataInicial; }
    public void setDataInicial(LocalDate dataInicial) { this.dataInicial = dataInicial; }

    public LocalDate getDataFinal() { return dataFinal; }
    public void setDataFinal(LocalDate dataFinal) { this.dataFinal = dataFinal; }

    public Set<Conteudo> getConteudos() { return conteudos; }
    public void setConteudos(Set<Conteudo> conteudos) { this.conteudos = conteudos; }

    @Override
    public String toString() {
        return "Bootcamp { nome='" + nome + "', descricao='" + descricao +
               "', dataInicial=" + dataInicial + ", dataFinal=" + dataFinal +
               ", totalConteudos=" + conteudos.size() + " }";
    }
}
