package Inheritance;

public class Bed {
    private String style;
    private String pillows;
    private int height ;
    private int sheet ;
    private  int quilt;

    public Bed(String style, String pillows, int height, int sheet, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheet = sheet;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public String getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheet() {
        return sheet;
    }

    public int getQuilt() {
        return quilt;
    }
    public void make(){
        System.out.println("Bed Is Making");
    }
}
