package com.dz;
import java.util.Scanner;

public abstract class Furniture {
    protected double price;
    protected int count;
    protected String material;
    protected String color;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Furniture(double price, int count, String material, String color) {
        this.price = price;
        this.count = count;
        this.material = material;
        this.color = color;
    }

    public void buy(){
        if (this.count == 0) {
            System.out.println("Sorry, the product is out of stock");
        }
        else {
            this.count--;
            System.out.println("Purchase completed");
            System.out.println("Do you want to leave a review?");
            Scanner sc = new Scanner(System.in);
            if (sc.nextBoolean()) {
                leaveReview();
            }
        }
    };

    public void addToCart(){
        System.out.println(" The product has been added to the cart");
    }

    public void viewReviews() {
        System.out.println("Good product or bad product or medium quality... ");
    }

    public void leaveReview() {
        System.out.println("Thank you for your feedback!");
    }

}
