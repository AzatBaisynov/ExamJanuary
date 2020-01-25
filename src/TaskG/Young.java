package TaskG;

public class Young {
    private int age;
    private Days[] day;

    public Young(int age, Days[] day){
        this.age = age;
        this.day = day;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Days[] getDay() {
        return day;
    }

    public void setDay(Days[] day) {
        this.day = day;
    }
}
