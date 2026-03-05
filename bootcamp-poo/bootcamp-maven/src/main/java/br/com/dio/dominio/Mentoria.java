package br.com.dio.dominio;

import java.time.LocalDate;

/**
 * HERANÇA: Mentoria estende Conteudo, herdando titulo e descricao.
 * POLIMORFISMO: sobrescreve calcularXp() com lógica própria (XP fixo + bônus).
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp() {
        // Mentoria concede XP padrão + bônus fixo de 20 XP
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    @Override
    public String toString() {
        return "Mentoria { " + super.toString() + ", data=" + data + " }";
    }
}
