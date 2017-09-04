/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author silva-muzime
 */
public class Estatistica {

    private static int media(Vector<Integer> vector, int tamanho) {
        int media = 0;
        for (int n : vector) {
            media += n;
        }
        media = media / tamanho;
        return media;
    }

    private static int mediana(Vector<Integer> vector, int tamanho) {
        int mediana;
        vector.sort((Integer n1, Integer n2) -> {
            if (n1 > n2) {
                return 1;
            }
            if (n1 < n2) {
                return -1;
            }
            return 0;
        });

        mediana = vector.get(tamanho / 2);
        return mediana;
    }

    public static int moda(Vector<Integer> vector, int tamanho) {
        int nVezes;
        int moda=0 ;
        int comparaV = 0;
        for (int i = 0; i < tamanho; i++) {
            nVezes = 0;
            for (int j = i + 1; j < tamanho; j++) {
                if (Objects.equals(vector.get(i), vector.get(j))) {
                    ++nVezes;
                }
            }
            if (nVezes > comparaV) {
                moda = vector.get(i);
                comparaV = nVezes;
            }
        }
        return moda;
    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(19);
        vector.add(12);
        vector.add(2);
        vector.add(19);
        vector.add(-2);
        System.out.println(moda(vector, vector.size()));
    }

}
