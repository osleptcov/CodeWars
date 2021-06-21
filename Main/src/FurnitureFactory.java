public class FurnitureFactory {


    static Furniture createFurnitureByType(String type){

        if (type.equalsIgnoreCase("chair")) {
            return new ChairFurniture();
        }
        else if(type.equalsIgnoreCase("table")){
            return  new TableFurniture();
        }
        else if (type.equalsIgnoreCase("sofa")){
            return  new SofaFurniture();
        }
        else{
            throw new RuntimeException(type+" is unknown furniture type");
        }

    }

}
