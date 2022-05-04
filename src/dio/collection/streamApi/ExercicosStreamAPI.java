package dio.collection.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExercicosStreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9","9", "6", "5");

        System.out.println("Imprima todos os Elementos dessa lista de String: ");

        /*numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //Pde para tranformar em um reference method

        //numerosAleatorios.forEach(s -> System.out.println(s));

        //Reference Method
        numerosAleatorios.forEach(System.out::println);


        System.out.println("\nPegue os 5 primeiros e coloque dentro de um Set: ");

        //Operação chamada limit
        //Operação collect | pegue algo de um lugar e colete para outro lugar
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Se não quiser imprimir e colocar dentro de um set
        //ctrl + alt + v

//        Set<String> collectSet = numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet());


        System.out.println("\nTranforma esta lista de String em uma lista de : ");
        //Aqui eu não estou coletando dados
        //Vai continuar sendo uma lista porém uma lista de números inteiros
        //Operação Map
        
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //Caso não queira imprimir
        //Colocando em uma List
//        List<Integer> collectList = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());

        System.out.println("\n: ");
        System.out.println("\n: ");


    }
}
