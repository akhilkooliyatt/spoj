package com.my;

import java.util.Scanner;

class AnswerToLife {
    public static void main (String[] args){
        Scanner takeAllInputsFromUniverse = new Scanner(System.in);
        while (true){
            int checkInput = takeAllInputsFromUniverse.nextInt();
            if(checkInput==42)
                break;
            System.out.println(checkInput);

        }
    }
}
