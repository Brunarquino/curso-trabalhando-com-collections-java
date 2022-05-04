package dio.collection.map.execiciosPropostos;

import java.util.*;

public class Ex01 {

    /*
        Dada a população estimada de alguns estados do nordeste brasileiro, faça:
             Estado = PE - população = 9.616.621
             Estado = AL - população = 3.351.543
             Estado = CE - população  = 9.187.103
             Estado = RN - população = 3.534.265

                - Crie um dicionário e relacione os estados e suas populações;
                - Substitua a população do estado do RN por 3.534.165;
                - Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
                - Exiba a população PE;
                - Exiba todos os estados e suas populações na ordem que foi informado;
                - Exiba os estados e suas populações em ordem alfabética;
                - Exiba o estado com o menor população e sua quantidade;
                - Exiba o estado com a maior população e sua quantidade;
                - Exiba a soma da população desses estados;
                - Exiba a média da população deste dicionário de estados;
                - Remova os estados com a população menor que 4.000.000;
                - Apague o dicionário de estados;
                - Confira se o dicionário está vazio.
     */

    public static void main(String[] args) {

        Map<String, Integer> populacaoEstadosNordeste = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
        System.out.println(populacaoEstadosNordeste);


        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        populacaoEstadosNordeste.put("RN", 3534165);
        System.out.println(populacaoEstadosNordeste);

        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277: ");
        if(!populacaoEstadosNordeste.containsKey("PB")){
            populacaoEstadosNordeste.put("PB", 4039277);
        }
        System.out.println(populacaoEstadosNordeste);


        System.out.println("\nExiba a população PE: " + populacaoEstadosNordeste.get("PE"));


        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Integer> populacaoEstadosNordeste1 = new LinkedHashMap<>(populacaoEstadosNordeste);
        System.out.println(populacaoEstadosNordeste);


        System.out.println("\nExiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNordeste2 = new TreeMap<>(populacaoEstadosNordeste);
        System.out.println(populacaoEstadosNordeste);


        int menorPopulacao = Collections.min(populacaoEstadosNordeste.values());
        Set<Map.Entry<String, Integer>> entries = populacaoEstadosNordeste.entrySet();
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry: entries) {
            if (entry.getValue().equals(menorPopulacao)){
                estadoMenorPopulacao = entry.getKey();
            }
        }
        System.out.println("\nExiba o estado com o menor população e sua quantidade: " + estadoMenorPopulacao + ": " + menorPopulacao);


        int maiorPopulacao = Collections.max(populacaoEstadosNordeste.values());
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Integer> entry: entries) {
            if (entry.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = entry.getKey();
            }
        }
        System.out.println("\nExiba o estado com a maior população e sua quantidade: " + estadoMaiorPopulacao + ": " + maiorPopulacao);

        Iterator<Integer> iterator = populacaoEstadosNordeste.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma da população desses estados: " + soma);


        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma/populacaoEstadosNordeste.size()));


        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstadosNordeste.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() < 4000000){
                iterator1.remove();
            }
        }

        System.out.println(populacaoEstadosNordeste);


        System.out.println("\nApague o dicionário de estados: ");
        populacaoEstadosNordeste.clear();
        System.out.println(populacaoEstadosNordeste);
        System.out.println("\nConfira se o dicionário está vazio: " + populacaoEstadosNordeste.isEmpty());




    }
}
