package com.dz;

public class Table extends Furniture{
    protected double size;
    protected String shape;

    public Table(double price, int count, String material, String color, double size, String shape) {
        super(price, count, material, color);
        this.size = size;
        this.shape = shape;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public void setCount(int count) {
        super.setCount(count);
    }

    @Override
    public String getMaterial() {
        return super.getMaterial();
    }

    @Override
    public void setMaterial(String material) {
        super.setMaterial(material);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }


    @Override
    public void buy() {
        super.buy();
    }

    @Override
    public void addToCart() {
        super.addToCart();
    }

    @Override
    public void viewReviews() {
        super.viewReviews();
    }

    @Override
    public void leaveReview() {
        super.leaveReview();
    }

    @Override
    public String toString() {
        return "Table{" +
                "price=" + price +
                ", count=" + count +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", shape='" + shape + '\'' +
                '}';
    }
}
