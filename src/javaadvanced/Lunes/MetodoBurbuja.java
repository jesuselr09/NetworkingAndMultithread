package javaadvanced.Lunes;

public class MetodoBurbuja {
        //Elementos a ordenar como parametros
        static void bubbleSort(int[] arr){
            //Longitud del arreglo
            int n = arr.length;
            
            int temp=0;
            //Recorre el arreglo n
            for(int i=0; i<n; i++){
                
                for (int j=1; j < (n-i); j++){
                    if (arr[j-1] > arr[j]){
                        // Intercambio de elementos
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        public static void main (String[] args){
            int arr[] = {10,5,20,35,17};
            
            System.out.println("Arreglo antes de ordenar");
            for (int i =0; i<arr.length; i++){
                System.out.println(arr[i]+"");
            }
            System.out.println("");
            bubbleSort(arr);
            
            System.out.println("Arreglo despues de ordenar");
            for (int i =0; i<arr.length; i++){
                System.out.println(arr[i]+"");
            }
        }
}
