package Model;

public class Box {
    private int id;
    private int length;
    private int width;
    private Double rent;

    public Box(int id, int length , int width , double rent)
    {
        this.id = id;
        this.length = length;
        this.width = width;
        this.rent = rent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }
}
