public class TaskC {
    public static void main(String[] args) {
        int[] a = new int[50];
        String[] b = new String[50];

        for (int i = 0; i < 50; i++){
            if (a[i] % 2 == 0){
                b[i] = "Ч";
            } else {
                b[i] = "Н";
            }
        }
    }
}
