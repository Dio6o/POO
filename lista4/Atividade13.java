package lista4;

public class Atividade13 {
    public static void main(String[] args) {

        final int SIZE = 20;
        int[] vet1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] vet2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] combinado = new int[20];

        int  contador1 = 0;
        int  contador2 = 0;


        for(int i = 0; i < SIZE; i++){
            if(i % 2 == 0) {
                combinado[i] = vet1[contador1];
                contador1++;
            } else  {
                combinado[i] = vet2[contador2];
                contador2++;
            }
        }

        for(int j = 0; j < SIZE; j++){
            System.out.println(combinado[j]);
        }
    }
}
