public final class TaskE {
    private String fromWhere;
    private String where;
    private int price;
    private String date;

    public TaskE(){
    }
    public TaskE(String fromWhere, String where){
        this.fromWhere = fromWhere;
        this.where = where;
    }

    public String getFromWhere() {
        return fromWhere;
    }

    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
