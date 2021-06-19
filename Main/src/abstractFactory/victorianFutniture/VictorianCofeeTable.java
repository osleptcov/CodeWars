package abstractFactory.victorianFutniture;

import abstractFactory.CoffeeTable;

public class VictorianCofeeTable implements CoffeeTable {
    @Override
    public void putOn() {
        System.out.println("This is victorian cofee table.You may put something on it.");
    }
}
