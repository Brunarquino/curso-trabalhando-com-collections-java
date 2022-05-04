package dio.collection.list.exerciciosPropostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

    /*
        Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        1. "Telefonou para a vítima?"
        2. "Esteve no local do crime?"
        3. "Mora perto da vítima?"
        4. "Devia para a vítima?"
        5. "Já trabalhou com a vítima?"
        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
        "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> respostas = new ArrayList<>();

        int res;
        for (int i = 1;i <= 5; i++){

            switch (i){
                case (1):
                    System.out.println("1. Telefonou para a vítima?");
                    break;
                case (2):
                    System.out.println("2. Esteve no local do crime?");
                    break;
                case (3):
                    System.out.println("3. Mora perto da vítima?");
                    break;
                case (4):
                    System.out.println("4. Devia para a vítima?");
                    break;
                case (5):
                    System.out.println("5. Já trabalhou com a vítima?");
                    break;
                default:
                    break;
            }

            System.out.println(
                    "Digite:" +
                            "\n1 -  Sim" +
                            "\n2 - Não");
            res = scan.nextInt();
            while (res > 2 | res < 1){
                System.out.println("Resposta Invalida: ");
                System.out.println(
                        "Digite:" +
                                "\n1 -  Sim" +
                                "\n2 - Não");
                res = scan.nextInt();
            }
            respostas.add(res);

        }


        System.out.println(respostas);

        int quantRespotasPositivas = 0;

        for (int resposta: respostas) {
            if(resposta == 1){
                quantRespotasPositivas++;
            }
        }

        String classificacao;

        if(quantRespotasPositivas == 2){
            classificacao = "Suspeita";
        }else if (quantRespotasPositivas == 3 | quantRespotasPositivas == 4) {
            classificacao = "Cúmplice";
        } else if (quantRespotasPositivas == 5) {
            classificacao = "Assasina";
        }else {
            classificacao = "Inocente";
        }

        System.out.println("Você foi classificado como " + classificacao);



    }

}
