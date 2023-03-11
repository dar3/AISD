package com.company;

import com.company.Drawer;

import java.util.Scanner;

import static com.company.Drawer.*;

public class Run {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            int input = Integer.valueOf(sc.nextLine());
//            drawTriangle(input);
//            drawSquare(input);
//            drawPyramid(input);
            drawChristmasTree(input);
        }
        catch (NumberFormatException e){
            System.out.println("fail");
        }





    }

}
