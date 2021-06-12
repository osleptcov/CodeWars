public class ChairFurniture implements Furniture {
    @Override
    public void give (){
        System.out.println("The chair came from the warehouse.");

    }

    @Override
    public void sell() {
        System.out.println("The buyer received his chair.");
    }
}
