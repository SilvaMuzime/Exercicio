/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author silva-muzime
 */
public class Exercicio3 {
    
    static Scanner s = new Scanner(System.in);
    /**
     * Metodo que regista estudantes e armazena os dados num Arraylist
     * @return lista de estudantes
     */
    
    private static ArrayList<Estudante> registar(){
        ArrayList<Estudante> listaEstudantes = new ArrayList<>();
        char resp='s';
        do{
            
            System.out.println("Introduza o nome do estudante");
            String nome=s.next();
            Vector <Double> notas = new Vector<>(3);
            double media=0;
            for(int i=1; i<=3;i++){
                System.out.println("Introduza a "+i+" nota do estudante ");
                double nota = s.nextDouble();
                media += nota;
                notas.add(nota);               
            }
            media=media/3;
            listaEstudantes.add(new Estudante(nome, notas, media));
            System.out.println("Deseja registar mais estudantes");
            resp= s.next().charAt(0);
            System.out.println("\n");           
            
        }while(resp!='n');
        
        return listaEstudantes;
    }
    
    /**
     * Metodo que calcula a nota media dos estudantes
     * @param lista lista de estudantes
     * @return nota media dos estudantes
     */
    private static double media(ArrayList<Estudante> lista){
        double media=0;
        for(Estudante e: lista){
            media+= e.getMedia();
        }
        media=media/lista.size();
        return media;
    }
    
    /**
     * Metodo verifica a  maior media obtida na turma
     * @param lista
     * @return maior media
     */
    private static double maiorMedia(ArrayList<Estudante> lista){
        double maior=0;
        for(Estudante e : lista){
            if(maior<e.getMedia())
                maior=e.getMedia();            
        }
        return maior;
    }
    
    /**
     * Metodo que mostra os estudantes com a maior media 
     * @param lista lista de estudantes
     * @param maior maior media obtida
     * @return estudantes com a maior media
     */
    private static ArrayList<Estudante> maiorMedia(ArrayList<Estudante> lista, double maior){
        ArrayList<Estudante> maioresMedias=new ArrayList<>();
        for(Estudante e : lista){
            if(e.getMedia()==maior)
                maioresMedias.add(e);
        }
        return maioresMedias;
    }
    
    public static void main(String[] args) {
        ArrayList<Estudante> lista = new ArrayList<>();
        
        lista =registar();
        double media = media(lista);
        double maiorMedia =maiorMedia(lista);
        ArrayList<Estudante> maioresMedias = maiorMedia(lista,maiorMedia);
        
        System.out.println("Media da turma = "+ media);
        System.out.println("Estudantes com maior media "+ maioresMedias.toString());
    }
    
    
    
    

}
