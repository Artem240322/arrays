package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] weight2 = {1.57, 7.654, 9.986};
        int[] weight3 = {1, 2, 3};
    }
    System.out.println();
        int[] weights = new int[] {0, 1, 2, 3};
        for (int i = 0; i < weights.length - 1; i++){
            System.out.print(weights[i] + " ,");
        }
        System.out.print(weights[weights.length - 1]);
System.out.println();
//2
    double[] weightsFractional = new double[] {1.57, 7.654, 9.986};
    for (int u = 0; u<weightsFractional.length-1; u++) {
        System.out.print(weightsFractional[u]+" ,");
    }
    System.out.print(weightsFractional[weightsFractional.length-1]);
System.out.println();
//3
        int[] weightsMassive = new int[] {0, 1, 2, 3};
        for (int i = weightsMassive.length -1; i >=0; i--){
            System.out.print(weightsMassive[i] + ",");}
        System.out.print(weightsMassive[0]);

        System.out.println();
        //
        double [] weightsFractionalBack = new double[] {1.57, 7.654, 9.986};
        for (int i = weightsFractionalBack.length - 1; i>=0; i--) {
            if (i == 0) {
                System.out.print(weightsFractionalBack[i]);
            } else {
                System.out.print(weightsFractionalBack[i] + ", ");
            }
        }
        }


        }


