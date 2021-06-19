package abstractFactory.modernFurniture;
import abstractFactory.Chair;

public class ModernChair implements Chair{

    @Override
    public void sitOn() {
        System.out.println("This is modern chair. Please sit on.");
    }
}
