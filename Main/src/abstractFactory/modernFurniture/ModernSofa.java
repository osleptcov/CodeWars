package abstractFactory.modernFurniture;
import abstractFactory.Sofa;

public class ModernSofa implements Sofa{

    @Override
    public void chill() {
        System.out.println("This is modern sofa.You may relax on it.");
    }
}
