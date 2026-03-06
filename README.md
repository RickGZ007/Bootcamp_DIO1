🚀 Bootcamp Java Developer — POO na Prática
Projeto desenvolvido durante o Bootcamp Java Developer da DIO, com o objetivo de aplicar na prática os 4 pilares do Paradigma de Orientação a Objetos (POO) modelando o domínio de um Bootcamp.

📋 Sobre o Projeto
O sistema modela o funcionamento de um Bootcamp, onde:

Um Bootcamp possui uma coleção de Cursos e Mentorias
Um Dev pode se inscrever em um Bootcamp e progredir pelos conteúdos
Cada conteúdo concluído concede XP ao Dev, calculado de forma diferente para Cursos e Mentorias


🏗️ Estrutura de Classes
br.com.dio
│
├── Main.java                  ← Ponto de entrada, instancia os objetos
│
└── dominio
    ├── Conteudo.java          ← Classe abstrata (base de Curso e Mentoria)
    ├── Curso.java             ← Estende Conteudo, XP = XP_PADRAO × cargaHoraria
    ├── Mentoria.java          ← Estende Conteudo, XP = XP_PADRAO + 20
    ├── Bootcamp.java          ← Contém Set<Conteudo> e Set<Dev>
    └── Dev.java               ← Inscreve-se, progride e acumula XP

🧱 Os 4 Pilares da POO Aplicados
1. 🔷 Abstração
Conteudo é uma classe abstrata que representa o conceito genérico de conteúdo de um Bootcamp, expondo apenas o que é essencial: titulo, descricao e calcularXp().
javapublic abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;
    public abstract double calcularXp();
}

2. 🔒 Encapsulamento
Todos os atributos de todas as classes são private, acessados exclusivamente via getters e setters, protegendo o estado interno dos objetos.
javaprivate String nome;

public String getNome() { return nome; }
public void setNome(String nome) { this.nome = nome; }

3. 👪 Herança
Curso e Mentoria estendem Conteudo, reaproveitando titulo e descricao sem repetir código.
javapublic class Curso extends Conteudo { ... }
public class Mentoria extends Conteudo { ... }

4. 🎭 Polimorfismo
calcularXp() é declarado abstract em Conteudo e implementado de forma diferente em cada subclasse.
java// Curso: XP proporcional à carga horária
public double calcularXp() { return XP_PADRAO * cargaHoraria; }

// Mentoria: XP com bônus fixo
public double calcularXp() { return XP_PADRAO + 20d; }
Dev.calcularTotalXp() chama calcularXp() sem saber se é Curso ou Mentoria — o Java resolve em tempo de execução.

▶️ Como Executar
Pré-requisitos

Java JDK 11+
IntelliJ IDEA (ou outra IDE Java)
Maven

Passos

Clone o repositório:

bashgit clone https://github.com/seu-usuario/bootcamp-poo.git

Abra o IntelliJ → File → Open → selecione o arquivo pom.xml → Open as Project
Aguarde o Maven indexar o projeto
Abra Main.java e clique no botão ▶️

🛠️ Tecnologias Utilizadas

Java 11
Maven
IntelliJ IDEA

