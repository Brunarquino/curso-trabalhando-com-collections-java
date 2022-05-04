package dio.collection.set.execiciosPropostos;

import java.util.*;

public class Ex01 {

    /*
        Crie uma conjunto contendo as cores do arco-íris e:
            a) Exiba todas as cores o arco-íris uma abaixo da outra;
            b) A quantidade de cores que o arco-íris tem;
            c) Exiba as cores em ordem alfabética;
            d) Exiba as cores na ordem inversa da que foi informada;
            e) Exiba todas as cores que começam com a letra ”v”;
            f) Remova todas as cores que não começam com a letra “v”;
            g) Limpe o conjunto;
            h) Confira se o conjunto está vazio;
     */

    public static void main(String[] args) {

        //Criando um conjunto
        Set<String> coresArcoIris = new HashSet<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};

        System.out.println("Cores do arco-íris: ");
        for (String cores : coresArcoIris) {
            System.out.println(cores);
        }

        System.out.println("\nO que arco-íris tem " + coresArcoIris.size() + " cores");

        System.out.println("\nExiba as cores em ordem alfabética:");
        Set<String> coresArcoIris1 = new TreeSet<>(coresArcoIris);
        for (String cores : coresArcoIris1) {
            System.out.println(cores);
        }


        System.out.println("\nExiba as cores na ordem que foi informada: " );
        Set<String> coresArcoIris2 = new LinkedHashSet<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};
        System.out.println(coresArcoIris2);

        System.out.println("\nExiba as cores na ordem inversa da que foi informada: " );
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris2);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("\nExiba todas as cores que começam com a letra ”v”: ");
        for (String cores: coresArcoIris) {
            if(cores.startsWith("V")) System.out.println(cores);
        }


        System.out.println("\nRemova todas as cores que não começam com a letra “v”:");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            if(!iterator.next().startsWith("V")) iterator.remove();
        }

        for (String cores : coresArcoIris) {
            System.out.println(cores);
        }



        System.out.println("\nLimpe o conjunto:");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("\nConfira se o conjunto está vazio:" + coresArcoIris.isEmpty());


    }
}
