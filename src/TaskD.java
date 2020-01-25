public class TaskD {

    public static boolean isLonger(String i, int n){
        if(i.length() > n){ //где n число проверяемое нами
            return true;
        } return false;
    }

    public static void main(String[] args) {
        String text = "этот текст является проверкой";
        if(isLonger(text,2000)){
            System.out.println(text);
        }

    }
}
