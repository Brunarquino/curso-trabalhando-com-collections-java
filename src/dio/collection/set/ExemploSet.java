package dio.collection.set;

import java.util.*;

public class ExemploSet {

    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
    public static void main(String[] args) {

        //Formas de implementar o Set

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString()); // não fica na ordem porque está ultilizando o HashSet e os 7 repitidos só entraram uma vez

        //System.out.println("Exiba a posição da nota 5.0: "); Não consigo fazer busca de acordo a posição

        //System.out.println("Adicione na lista a nota 8.0 na posição 4: "); não consigo trabalhar com posições

        //System.out.println("Substitua a nota 5.0 pela nota 6.0: "); não consigo substituir

        //System.out.println("\nConfira se a nota 5.0 está no conjunto: " + notas.contains(5d)); // Consegue verificar se uma determinada nota está presente

        //System.out.println("Exiba a terceira nota adicionada: "); // não consigo porque não tenho método get

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        //Uso do iterator para fazer soma

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma);

        System.out.println("\nExiba a média das notas: " + (soma/ notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //System.out.println("Remova a nota da posição 0");

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas); // remover notas menores que 7

        //HashSet não salva a ordem que foi informada
        //então é necessario usar a LinkedHashSet

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        //Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //essa forma da implementação tábem funciona
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        //Implementação da treeSet, Porque ela organiza com a ordem natural

        System.out.println("\nExiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); // pasando como parametros notas2
        System.out.println(notas3);

        System.out.println("\nApague todo o conjunto");
        notas.clear();

        System.out.println("\nConfira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("\nConfira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("\nConfira se o conjunto 3 está vazio: " + notas3.isEmpty());
    }
}
