import java.util.*;
import java.util.function.DoubleToIntFunction;
import java.util.stream.Collectors;
class Cubes {

    public String isSumOfCubes(String s) {
        List<String>listOfDigit = new ArrayList<>();

        String tempS="";
        for(char c: s.toCharArray()){

            if ( Character.isDigit(c)){
                tempS+=c;

            }
            else if(!listOfDigit.contains(tempS) && tempS.length()!=0){
                listOfDigit.add(tempS);
                tempS="";
            }
            if (tempS.length()==3 && !listOfDigit.contains(tempS)){
                listOfDigit.add(tempS);
                tempS="";
            }


        }

        if(tempS.length()>0 && !listOfDigit.contains(tempS)) {
            listOfDigit.add(tempS);
        }
        System.out.println(listOfDigit.stream().collect(Collectors.joining(" ")));
        List<String> listofLucky =new ArrayList<>();

        for (String str: listOfDigit){
            int sum=0;
            for(char c:str.toCharArray()){
                sum+=(int) Math.pow (Character.getNumericValue(c), 3);

            }

            if(sum==Integer.parseInt(str)){
                listofLucky.add(str);
            }

        }
        if (listofLucky.size()>0) {
            return listofLucky.stream().collect(Collectors.joining(" "))+" " +listofLucky.stream().mapToInt(Integer::parseInt).sum() +" Lucky";
        }

        else return "Unlucky";
    }
}
