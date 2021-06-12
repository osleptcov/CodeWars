public class TableFurnitureFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new TableFurniture();
    }
}
