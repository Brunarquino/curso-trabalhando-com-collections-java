package dio.collection.map;

import java.util.*;

public class ExemploMap {
 /*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l

 modelo é a chave
 */
    public static void main(String[] args) {

        //FORMAS DE INICIAR OS MAP-------------------------------------------------------------------

        //Map carrosPopulares2020 = new HashMap(); //antes do java 5
        //Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
        //HashMap<String, Double> carrosPopulares = new HashMap<>();
        //Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        //FORMAS DE INICIAR OS MAP-------------------------------------------------------------------^^

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        //Criação de um map
        //<tipo da chave, tipo do valor>
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            //não tem como usar o método add no map é ultilizado o put
            put("gol", 14.4);
            put("uno", 15.6 );
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        //Imprimendo o Map
        //System.out.println(carrosPopulares);
        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        //Não tenho como adicionar tenho como alterar, porque já existe o gol e não pode repetir
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        //Passar uma chave e me retornar o valor
        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

        //System.out.println("Exiba o terceiro modelo adicionado: "); // não tem um método que possa mostrar o modelo por indice

        //System.out.println("\nExiba os modelos: " + carrosPopulares.keySet());
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("\nExiba o consumo do uno: " + modelos);

        //System.out.println("\nExiba os consumos dos carros: " + carrosPopulares.values());
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("\nExiba os consumos dos carros: " + consumos);

        //descobrir o modelo mais economico
        //recebe uma collecttion - carrosPopulares.values() retorn auma collections com todos os númerod
        System.out.println("\nExiba o modelo mais econômico e seu consumo: " );
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                //impresão dentro do if caso tenha mais de um modelo eficiente
                System.out.println("Mais econômico: " + modeloMaisEficiente + " | " + consumoMaisEficiente);
            }
        }


        System.out.println("\nExiba o modelo menos econômico e seu consumo: " );
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente= entry.getKey();
                System.out.println("Menos econômico: " + modeloMenosEficiente + " | " + consumoMenosEficiente);
            }
        }


        System.out.println("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();// Consigo chamar o iterator pq o retorno dos carros populares é uma collection
        Double soma = 0.0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma é " + soma);


        System.out.println("\nExiba a média dos consumos deste dicionário de carros: " + soma/carrosPopulares.size());


        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() == 15.6){
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);


        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6 );
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares1);


        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);



        System.out.println("\nApague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        System.out.println("\nConfira se o dicionário está vazio: " +  carrosPopulares.isEmpty() );


    }

}
