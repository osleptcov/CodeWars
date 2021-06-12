public class ChairFurnitureFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new ChairFurniture();
    }
}
