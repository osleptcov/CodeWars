public class TableFurniture implements Furniture {
    @Override
    public void give() {
        System.out.println("The table came from the warehouse.");
    }

    @Override
    public void sell() {
        System.out.println("The buyer received his table.");
    }
}
