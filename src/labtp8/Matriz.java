package labtp8;

import java.util.ArrayList;

/**
 *
 * @author Leandro Sturniolo
 */
public class Matriz {
    
    private int[][] multi;

    public Matriz() {
    }
    
    public ArrayList<Integer> paresEnFila(int[] arr) {
        ArrayList<Integer> ret = new ArrayList<>();
        
        for (int i : arr) {
            if ((i % 2) == 0) ret.add(i);
        }
        
        return ret;
    }
    
    public String mostrarLista(ArrayList<Integer> arr) {
        String concat = "";
        for (Integer i : arr) {
            concat += i + " "; 
        }
        return concat;
    }
    
    public void armar() {
        this.multi = new int[][]{
        { 3, 6, 9, 12},
        { 15, 18, 21},
        { 24, 27, 30, 33, 36},
        { 39, 42}
        };
        
        System.out.println("Números pares dentro del arreglo bidimensional:");
        
        for (int i = 0; i < multi.length ; i++) {
            System.out.println(" Fila " + (i+1) + "→ " + this.mostrarLista(this.paresEnFila(multi[i])));
        }
    }
}
