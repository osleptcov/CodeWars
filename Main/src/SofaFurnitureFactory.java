public class SofaFurnitureFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new SofaFurniture();
    }
}
