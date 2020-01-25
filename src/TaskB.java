import java.util.Random;

public class TaskB {
    public static void main(String[] args) {
        Random rd  = new Random();
        int sum = 0;

        int[] array = new int[100];
        for (int i = 0; i < 100; i++){
            array[i] = rd.nextInt(200 - 1) + 1;
            if(array[i] % 13 == 0){
                sum = sum + array[i];
            }
            if(array[i] % 17 == 0){
                sum = sum + array[i];
            }
        }
    }
}
