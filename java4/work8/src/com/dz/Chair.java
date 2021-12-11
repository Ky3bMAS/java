package com.dz;

public class Chair extends Furniture{
    protected String style;
    protected double height;

    public Chair(double price, int count, String material, String color, String style, double height) {
        super(price, count, material, color);
        this.style = style;
        this.height = height;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
        return "Chair{" +
                "style='" + style + '\'' +
                ", height=" + height +
                ", price=" + price +
                ", count=" + count +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
