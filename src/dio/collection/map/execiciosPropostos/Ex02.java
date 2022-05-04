package dio.collection.map.execiciosPropostos;

import java.util.*;

public class Ex02 {

    /*
        Faça um programa que simule um lançamento de dados.
        Lance o dado 100 vezes e armazene.
        Depois, mostre quantas vezes cada valor foi conseguido.
     */
    public static void main(String[] args) {

        int quantidadeLancamntos = 100;

        List<Integer> valores = new ArrayList<>();
        Random geradorLancamento = new Random(); //Gera números aleatorios

        Integer quantValores1 = 0;
        Integer quantValores2 = 0;
        Integer quantValores3 = 0;
        Integer quantValores4 = 0;
        Integer quantValores5 = 0;

        //pegando os 100 números aleatorios
        for(int i = 0; i < quantidadeLancamntos; i++){
            int number = geradorLancamento.nextInt(5) + 1; //Gerango um número aleatorio entre 5 e 1
            valores.add(number);

            //Contando os números
            switch (number){
                case(1):
                    quantValores1++;
                    break;
                case(2):
                    quantValores2++;
                    break;
                case(3):
                    quantValores3++;
                    break;
                case(4):
                    quantValores4++;
                    break;
                case(5):
                    quantValores5++;
                    break;
                default:
                    break;
            }
        }


        //Inserindo a quantidade de cada número

        Integer finalQuantValores1 = quantValores1;
        Integer finalQuantValores2 = quantValores2;
        Integer finalQuantValores3 = quantValores3;
        Integer finalQuantValores4 = quantValores4;
        Integer finalQuantValores5 = quantValores5;
        Map<Integer, Integer> quantasVezesValorFoiGerado = new HashMap<>(){{
            put(1, finalQuantValores1);
            put(2, finalQuantValores2);
            put(3, finalQuantValores3);
            put(4, finalQuantValores4);
            put(5, finalQuantValores5);
        }};

        System.out.println(quantasVezesValorFoiGerado);

        System.out.println(valores);



    }
}
