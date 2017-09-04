/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author silva-muzime
 */
public class Exercicio_2 {

    private static void jogoGalo(Vector<Integer> numeros) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escolha um numero");
        int num = s.nextInt();
        Random r = new Random();

        if (num == numeros.get(r.nextInt(numeros.size()))) {
            System.out.println("Voce venceu");
            return;
        } else {
            
            jogoGalo(numeros);
        }
    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(12);
//        vector.add(7);
//        vector.add(2);
//        vector.add(19);
        vector.add(-2);
        jogoGalo(vector);
        
    }
}
