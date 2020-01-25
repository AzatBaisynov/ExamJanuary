package TaskG;

public class Pool {
    public static void main(String[] args) {
        Days[] days1 = {Days.Monday, Days.Wednesday, Days.Friday};
        Young first = new Young(15, days1);
        Young second = new Young(14, days1);

        Days[] days2 = {Days.Sunday, Days.Saturday, Days.Tuesday, Days.Thurday};
        Adult third = new Adult(41, days2);
        Adult fourth = new Adult(34, days2);

    }
}
