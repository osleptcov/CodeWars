public class SofaFurniture implements Furniture{
    @Override
    public void give() {
        System.out.println("The sofa came from the warehouse.");
    }

    @Override
    public void sell() {
        System.out.println("The buyer received his sofa.");
    }
}
