package Metodo_Quicksort;

public class Main_Quicksort {

    public static void main(String[] args) {
       
        Alg_Ordenamiento ordenar = new Alg_Ordenamiento();

        int vector[] = {-2, 2, 0, 10, 5, 7, 8};
        System.out.println("Arreglo Original");
        ordenar.Mostrar_Arreglo(vector);
        System.out.println("Arreglo Ordenado con Quick");
        ordenar.quick(vector, 0, vector.length - 1);
    }

}
