package dio.collection.list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        //    crei uma lista e adicione as 7 notas

//        List notas = new ArrayList(); // antes do java 5

//        ArrayList<Double> notas = new ArrayList<>(); //não é recomendado, porque é recomendado a gente programar voltada a interface e não para implementção

//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

//        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //é limitada, não é suportado
//        notas.add(10d);
//        System.out.println(notas);

//        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//        notas.add(1d); // lista imutavel
//        notas.remove(5d);
//        System.out.println(notas);

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();//Generics(jdk5) <Double> - Diamont Operator(jdk 7) <> - não precisa repetir a double
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d));

//        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
//        for (double nota : notas) System.out.println((nota));

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){//cursor tem proximo?
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma);

        System.out.println("\nExiba a média das notas: " + (soma/notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(notas.indexOf(0.0)); //notas.remove(0d); támbem funciona
        System.out.println(notas);

        System.out.println("\nremova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if(next < 7 ) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());

        //Resolver esses exercicos usando LinkedList

        System.out.println("\nNova Lista ");

        System.out.println("\nCrie uma lista chamada notas2" +
                "e coloque todos os elementos da lista ArrayList nessa nova Lista:");

        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nota lista sem removê-lo: " + notas2.get(0));
        notas2.remove(0);
        System.out.println("\nMostre a primeira nota da nota lista sem removendo-o: " + notas2);







    }
}
