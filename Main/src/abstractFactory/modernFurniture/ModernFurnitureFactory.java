package abstractFactory.modernFurniture;

import abstractFactory.Chair;
import abstractFactory.CoffeeTable;
import abstractFactory.FurnitureFactory;
import abstractFactory.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable getCofeeTable() {
        return new ModernCofeeTable();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }
}
