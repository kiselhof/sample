package com.company;

import java.util.Random;
import java.util.Scanner;

public class game {
    private int _number;

    public game(){
        Random random = new Random();
        this._number = random.nextInt(100);
        System.out.println(_number);
    }

    public void start(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        for (int _try = 0;_try<3; _try++) {
            if(num!=_number){
                System.out.println("try again");
                System.out.print("Input a number: ");
                num = in.nextInt();
            }
            else{
                System.out.println("YOU WON!!!");
                break;
            }
        }
    }
}
