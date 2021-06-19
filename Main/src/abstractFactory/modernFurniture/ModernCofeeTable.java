package abstractFactory.modernFurniture;
import abstractFactory.CoffeeTable;

public class ModernCofeeTable implements CoffeeTable {

    @Override
    public void putOn() {
        System.out.println("This is modern cofee table.You may put something on it.");
    }
}
