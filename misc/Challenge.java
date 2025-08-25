package misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Challenge {
    public static void main(String[] args) {

        double[] saltos = {3, 4.5, 4, 5, 2};
        double menor = 0;
        double media = 0;

        for(int i = 0; i < 5; i++){
            if(i == 0){
                menor = saltos[i];
            }

            if(menor > saltos[i]){
                menor = saltos[i];
            }
            media += saltos[i];
        }

        media -= menor;
        media /= (saltos.length - 1);



        System.out.println("media " + media);
    }
}
