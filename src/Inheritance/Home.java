package Inheritance;

public class Home {
    private int fans;
    private String color;
    private Beds bed;

    public Home(int fans, String color, Beds bed) {
        this.fans = fans;
        this.color = color;
        this.bed = bed;
    }
    public void doors(int doors){
        System.out.println("thye doors with balcony view is :"+ doors);
    }

    public int getFans() {
        return fans;
    }

    public String getColor() {
        return color;
    }

    public Beds getBed() {
        return bed;
    }
}
