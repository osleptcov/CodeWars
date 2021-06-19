package abstractFactory.victorianFutniture;

import abstractFactory.Chair;
import abstractFactory.CoffeeTable;
import abstractFactory.FurnitureFactory;
import abstractFactory.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable getCofeeTable() {
        return new VictorianCofeeTable();
    }

    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }
}
