/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Vector;

/**
 *
 * @author silva-muzime
 */
public class Exercicio_4 {
    /**
     * Metodo que compara dois vectores de booleanos 
     * @param vector1 primeiro vector
     * @param vector2 segundo vector
     * @return true-iguais, false-diferentes
     */
    private static boolean comparador(Vector<Boolean> vector1, Vector<Boolean> vector2) {
        boolean resultado = true;
        if (vector1.size() != vector2.size()) {
            return false;
        }else{
            for(int i=0; i<vector1.size() ; i++){
                if(vector1.get(i)!= vector2.get(i)){
                    return false;
                }                    
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Vector<Boolean> vector1 = new Vector<>();
        Vector<Boolean> vector2 = new Vector<>();
        vector1.add(Boolean.TRUE);
        vector2.add(Boolean.TRUE);
        //vector1.add(Boolean.FALSE);
        System.out.println(comparador(vector1, vector2));
    }

}
