package ru.skypro;


public class Main {

    public static void main(String[] args) {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] weight2 = {1.57, 7.654, 9.986};

        for (int i = 0; i < weight.length; i++) {
            if (i != weight.length - 1)
                System.out.print(weight[i] + ", ");
            else
                System.out.print(weight[i]);
        }
        System.out.println();

//2

        for (int u = 0; u < weight2.length; u++) {
            if (u != weight2.length - 1)
                System.out.print(weight2[u] + ", ");
            else
                System.out.print(weight2[u]);
        }
        System.out.println();
//3

        for (int i = weight.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(weight[i] + ", ");
            else
                System.out.print(weight[i] + ", ");
        }
        System.out.println();
        //
        for (int i = weight2.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(weight2[i] + ", ");
            else
                System.out.print(weight2[i]);
        }
        System.out.println();

        // 4
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 == 1)
                weight[i]++;

            if (i != weight.length - 1)
                System.out.print(weight[i] + ", ");
            else
                System.out.print(weight[i]);
        }
    }
}




