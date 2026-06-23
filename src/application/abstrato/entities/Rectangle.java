package application.abstrato.entities;

public class Rectangle extends Shape{

    private Double width;
    private Double heigth;

    public Rectangle(Color color, Double width, Double heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle() {
    }

    public Rectangle(Double width, Double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * heigth;
    }
}
