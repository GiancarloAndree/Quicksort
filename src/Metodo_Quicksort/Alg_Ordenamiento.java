package Metodo_Quicksort;

public class Alg_Ordenamiento {

    int i;
    int j;
    int temporal;
    int pasada;

    public Alg_Ordenamiento() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    public void quick(int[] arreglo, int primero, int ultimo) {

        int i, j, pivate, auxiliar;
        i = primero;
        j = ultimo;
        pivate = arreglo[(primero + ultimo) / 2];
        System.out.println("El Pivote es " + pivate);
        do {
            while (arreglo[i] < pivate) {
                i++;
            }
            while (arreglo[j] > pivate) {
                j--;

            }
            if (i <= j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quick(arreglo, primero, j);

        }
        if (i < ultimo) {
            quick(arreglo, i, ultimo);
        }
        Mostrar_Arreglo(arreglo);
    }

    public void Mostrar_Arreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]");

        }
        System.out.println(" ");
    }
}
