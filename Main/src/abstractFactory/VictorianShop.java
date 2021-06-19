package abstractFactory;

import abstractFactory.victorianFutniture.VictorianFurnitureFactory;

public class VictorianShop {
    public static void main(String[] args) {
        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFurnitureFactory.getChair();
        Sofa victorianSofa = victorianFurnitureFactory.getSofa();
        CoffeeTable victorianCofeeTable =victorianFurnitureFactory.getCofeeTable();

        System.out.println("Victorian furniture shop ctreated...");
        victorianChair.sitOn();
        victorianCofeeTable.putOn();
        victorianSofa.chill();
    }

}

