import java.util.Random;

public class TaskH {
    private static Object IOException;

    public static void isCorrect(int[] ints) throws Throwable {
        for(int i = 0; i < ints.length; i++){
        if(ints[i] % 3 == 0) {
            System.err.println("Некорректное число");
            throw (Throwable) IOException;
        }
        }
    }

    public static void main(String[] args) throws Throwable {
        Random rd = new Random();
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(10 - 1)+1;
        }
        isCorrect(array);
    }
}
