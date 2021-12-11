package com.dz;

public class Closet extends Furniture{
    protected double size;
    protected String type;

    public Closet(double price, int count, String material, String color, double size, String type) {
        super(price, count, material, color);
        this.size = size;
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "Closet{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
