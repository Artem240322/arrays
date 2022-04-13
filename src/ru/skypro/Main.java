package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] weights = new int[] {0, 1, 2, 3};
        for (int i = 0; i < weights.length - 1; i++){
            System.out.println(weights[i] + " ,");
        }
        System.out.println(weights[weights.length - 1]);
System.out.println();
//
    double[] weightsFractional = new double[] {1.57, 7.654, 9.986};
    for (int u = 0; u<weightsFractional.length-1; u++) {
        System.out.println(weightsFractional[u]+" ,");
    }
    System.out.println(weightsFractional[weightsFractional.length-1]);


        weights[0] = 12;
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        System.out.println(weights[3]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);

        }
            

        }
    }

