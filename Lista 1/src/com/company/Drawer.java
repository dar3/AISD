package com.company;

public class Drawer {
    public static void drawTriangle(int size) {
        // TODO



        if(size > 0){
//        budowa pieter
            for (int i = 0; i < size; i++) {

                for (int j = 0; j <= i; j++) {
                    System.out.print("#");
                }

                System.out.println();
            }
        }

        else{
            System.out.println("fail");
        }
    }

    public static void drawSquare(int size) {
        // TODO
//        ilosc pieter (rzedow)
        if(size > 0){

            for (int i = 0; i <size ; i++) {

                for (int j = 0; j < size; j++) {
//                j kolumny
                    if((j == 0 || j == size -1) || ( i == 0 || i == size -1)){

                        System.out.print("#");
                    }
                    else{
                        System.out.print(" ");

                    }
                }
                System.out.println();
            }
        }
        else{
            System.out.println("fail");
        }

    }

    public static void drawPyramid(int size) {
        // TODO

        if (size > 0) {
            for (int i = 0; i < size; i++) {

                for (int j = 0; j < size + i; j++) {
                    if ((j >= size - 1 - i) && (j <= size - 1 + i)) {

                        System.out.print("#");
                    } else {
//                    System.out.print(j);
                        System.out.print(" ");
                    }

                }

                System.out.println();
            }

        }

        else{
            System.out.println("fail");
        }
    }

    public static void drawChristmasTree(int size) {
        // TODO

        if (size > 0) {
            for (int k = 0; k < size; k++) {

                for (int i = 0; i < k+1; i++) {

                    for (int j = 0; j < size + i; j++) {
                        if ((j >= size - 1 - i) && (j <= size - 1 + i)) {

                            System.out.print("#");
                        } else {
//                    System.out.print(j);
                            System.out.print(" ");
                        }

                    }

                    System.out.println();
                }

            }
        }

        else{
            System.out.println("fail");
        }


    }
}
