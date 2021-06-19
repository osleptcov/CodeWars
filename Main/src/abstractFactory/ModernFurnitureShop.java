package abstractFactory;

import abstractFactory.modernFurniture.ModernFurnitureFactory;

public class ModernFurnitureShop {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFurnitureFactory.getChair();
        Sofa modernSofa = modernFurnitureFactory.getSofa();
        CoffeeTable modernCofeeTable =modernFurnitureFactory.getCofeeTable();

        System.out.println("Modern furniture shop ctreated...");
        modernChair.sitOn();
        modernCofeeTable.putOn();
        modernSofa.chill();
    }
}
