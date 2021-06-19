package abstractFactory.victorianFutniture;

import abstractFactory.Sofa;

public class VictorianSofa implements Sofa {

    @Override
    public void chill() {
        System.out.println("This is victorian sofa.You may relax on it.");
    }
}
