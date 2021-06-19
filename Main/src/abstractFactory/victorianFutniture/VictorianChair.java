package abstractFactory.victorianFutniture;

import abstractFactory.Chair;

public class VictorianChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("This is victorian chair. Please sit on.");
    }
}
