package TaskG;

public class Adult {
    private int age;
    private Days[] days;

    public Adult(int age, Days[] day){
        this.age = age;
        this.days = day;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Days[] getDay() {
        return days;
    }

    public void setDay(Days[] day) {
        this.days = day;
    }
}
