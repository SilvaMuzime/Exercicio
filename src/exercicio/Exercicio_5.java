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
public class Exercicio_5 {
    private static Vector<Integer> ordena(Vector<Integer> vector){
        
        Vector<Integer>  vectorOrdenado = new Vector<>();
        vectorOrdenado.setSize(vector.size());
        
        
        for(int i=(vector.size()-1); i>=0; i--){
            int indice=i;
            int maior=vector.get(i);
            
            for(int j=0; j< vector.size(); j++){                
                if(vector.get(j)>maior){
                    maior= vector.get(j);
                    indice = j;
                }
            }
            vector.removeElementAt(indice);
            vectorOrdenado.setElementAt(maior,i);

        }
        return vectorOrdenado;
    }
    public static void main(String[] args) {
        Vector<Integer> vector= new  Vector<>();
        vector.add(12);
        vector.add(7);
        vector.add(2);
        vector.add(19);
        vector.add(-2);
        System.out.println(ordena(vector).toString());
    }
}
