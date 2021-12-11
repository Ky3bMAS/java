package com.dz;
import java.util.ArrayList;
public class FurnitureShop {
    protected ArrayList<Furniture> allFurnitures = new ArrayList<>();

    public FurnitureShop(Furniture table, Furniture chair, Furniture sofa, Furniture bed, Furniture closet) {
        allFurnitures.add(table);
        allFurnitures.add(chair);
        allFurnitures.add(sofa);
        allFurnitures.add(bed);
        allFurnitures.add(closet);
    }

    @Override
    public String toString() {
        return "FurnitureShop{" +
                "allFurnitures=" + allFurnitures +
                '}';
    }
}
