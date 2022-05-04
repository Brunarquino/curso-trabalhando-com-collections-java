package dio.collection.set.execiciosPropostos;

import java.util.*;

public class Ex02 {
    /*
        Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
        Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
            a) Ordem de inserção;
            b) Ordem natural(nome);
            c) IDE;
            d) Ano de criação e nome;
            e) Nome, ano de criação e IDE;
        Ao final, exiba as linguagens no console, um abaixo da outra.
    */
    public static void main(String[] args) {


        Set<LinguagemFavorita> linguagensFavoritas = new HashSet<>();
        linguagensFavoritas.add(new LinguagemFavorita("Python",1990,"PyCharm"));
        linguagensFavoritas.add(new LinguagemFavorita("Java",1991,"intellij"));
        linguagensFavoritas.add(new LinguagemFavorita("JavaScript",1995,"VSCode"));


        System.out.println("\nOrdem de inserção: ");
        Set<LinguagemFavorita> linguagensFavoritas1 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java",1991,"intellij"));
            add(new LinguagemFavorita("JavaScript",1995,"VSCode"));
            add(new LinguagemFavorita("Python",1990,"PyCharm"));
        }};

        for (LinguagemFavorita linguagemFavorita : linguagensFavoritas1) {
            System.out.println(linguagemFavorita);
        }

        Set<LinguagemFavorita> linguagensFavoritas2 = new TreeSet<>(linguagensFavoritas);
        System.out.println("\nOrdem natural(nome): ");
        for (LinguagemFavorita linguagemFavorita :linguagensFavoritas2) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("\nOrdem Ano de criação e nome");
        Set<LinguagemFavorita> linguagensFavoritas3 = new TreeSet<>(new comparatorAno());
        linguagensFavoritas3.addAll(linguagensFavoritas);

        for (LinguagemFavorita linguagemFavorita :linguagensFavoritas3) {
            System.out.println(linguagemFavorita);
        }


        System.out.println("\nOrdem Nome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagensFavoritas4 = new TreeSet<>(new comparatorNomeAnoIde());
        linguagensFavoritas4.addAll(linguagensFavoritas);

        for (LinguagemFavorita linguagemFavorita :linguagensFavoritas4) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("\nOrdem de IDE");
        Set<LinguagemFavorita> linguagensFavoritas5 = new TreeSet<>(new comparatorIde());
        linguagensFavoritas5.addAll(linguagensFavoritas);

        for (LinguagemFavorita linguagemFavorita :linguagensFavoritas5) {
            System.out.println(linguagemFavorita);
        }

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && nome.equals(that.nome) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
}

class  comparatorAno implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(ano != 0)return ano;
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class  comparatorNomeAnoIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if(nome != 0)return nome;
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(ano != 0)return ano;
        return l1.getIde().compareToIgnoreCase(l1.getIde());
    }
}

class comparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}
