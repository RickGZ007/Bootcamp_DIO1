package br.com.dio.dominio;

/**
 * HERANÇA: Curso estende Conteudo, herdando titulo e descricao.
 * POLIMORFISMO: sobrescreve calcularXp() com lógica própria baseada na carga horária.
 */
public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        // XP = xp padrão multiplicado pela carga horária do curso
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    @Override
    public String toString() {
        return "Curso { " + super.toString() + ", cargaHoraria=" + cargaHoraria + "h }";
    }
}
