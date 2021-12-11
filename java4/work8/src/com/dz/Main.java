package com.dz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(new Table(300, 7, "wood", "brown", 3,
                "rectangular"), new Chair(80, 30, "plastic", "white", "dinning", 0.3),
                new Sofa(700, 5, "leather", "yellow", 3, "eurocook", true),
                new Bed(600, 2, "wood", "black", 10.5, "single"),
                new Closet(450, 3, "wood", "dark brown", 8, "case companement"));
        System.out.println(shop.allFurnitures);
        do {
            System.out.println("Please choose a product:\n" + "0 - Table\n" +
                    "1 - Chair\n" + "2 - Sofa\n" + "3 - Bed\n" + "4 - Closet\n" + "9 - Close");
            Scanner sc = new Scanner(System.in);
            int p = sc.nextInt();
            if (p == 9) {
                break;
            }
            System.out.println("Сhoose a number:\n" + "1 - View properties\n" +
                    "2 - Buy\n" + "3 - Add to cart\n" + "4 - View reviews\n" + "5 - Back\n");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println(shop.allFurnitures.get(p));
                    break;
                case 2:
                    shop.allFurnitures.get(p).buy();
                    break;
                case 3:
                    shop.allFurnitures.get(p).addToCart();
                    break;
                case 4:
                    shop.allFurnitures.get(p).viewReviews();
                    break;
                case 5:
                    continue;
                default:
                    break;
            }

        } while (true);

    }
}
