package dio.collection.list.exerciciosPropostos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EX01 {
    /* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
     *
     * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que
     * mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).*/

    public static void main(String[] args) {

        //Para receber a temperatura por uma entrada de teclado
        Scanner scan = new Scanner(System.in);

        //Criando a lista que vai armazena a temperatura média
        List<Double> temperaturasMedias = new ArrayList<>();

        // Pedindo a entradada da temperatura média dos 6 primeiros meses do ano
        int count = 0;

        while (count < 6){

            //Pedindo a Temperatura
            System.out.println("Digite a temperatura: ");
            //Lendo a temperatura digitada
            Double temperatura = scan.nextDouble();
            //Adicionando as temperaturas digitadas na lista
            temperaturasMedias.add(temperatura);
            count++;

        }

        System.out.println("Temperaturas Média dos 6 primeiros meses: ");
        System.out.println(temperaturasMedias);

        Iterator<Double> iterator = temperaturasMedias.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){//cursor tem proximo?
            Double next = iterator.next();
            soma += next;
        }

        double media = soma/temperaturasMedias.size();

        System.out.println("A Média Semestral é de: " + media);
        System.out.println("Meses acima da média ");

        for (Double temperatura : temperaturasMedias ) {
            if(temperatura > media) {
                //pegue o index da temperatura
                int indexTemp = temperaturasMedias.indexOf(temperatura);
                switch (indexTemp){
                    case (0):
                        System.out.println("1 - Janeiro: " + temperatura);
                        break;
                    case (1):
                        System.out.println("2 - Fevereiro: " + temperatura);
                        break;
                    case (2):
                        System.out.println("3 - Março: " + temperatura);
                        break;
                    case (3):
                        System.out.println("4 - Abril: " + temperatura);
                        break;
                    case (4):
                        System.out.println("5 - Maio: " + temperatura);
                        break;
                    case (5):
                        System.out.println("6 - Junho: " + temperatura);
                        break;
                    default:
                        break;
                }
            }

        }


    }
}


