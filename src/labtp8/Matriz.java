package labtp8;

import java.util.ArrayList;

/**
 *
 * @author Leandro Sturniolo
 */
public class Matriz {
    
    private int[][] multi;
    /*
    No me dejó crear el arreglo de esta forma
    private int[][] multi = new int[4][];
    multi[0] = new int[4];
    multi[1] = new int[3];
    multi[2] = new int[5];
    multi[3] = new int[2];
    
    */

    public Matriz() {
    }
    
    public ArrayList<Integer> paresEnFila(int[] arr) {
        ArrayList<Integer> ret = new ArrayList<>();
        
        for (int i : arr) {
            if ((i % 2) == 0) ret.add(i);
        }
        
        return ret;
    }
    
    public void armar() {
        this.multi = new int[][]{
        { 3, 6, 9, 12 },
        { 15, 18, 21},
        { 24, 27, 30, 33, 36},
        { 39, 42}
        };
        
        System.out.println("\nFila 1: " + this.paresEnFila(multi[0]));
        System.out.println("\nFila 2: " + this.paresEnFila(multi[1]));
        System.out.println("\nFila 3: " + this.paresEnFila(multi[2]));
        System.out.println("\nFila 4: " + this.paresEnFila(multi[3]));
    }
}
