import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Nba {

    public static String nbaCup(String resultSheet, String toFind) {
        String str;
        Pattern pattern=Pattern.compile("[+-]?([0-9]+[.])");
        Matcher matcher=pattern.matcher(resultSheet);
        if (matcher.find()){
            return "Error(float number):the concerned string";

        }
        if (toFind=="")
            return "";

        List<String> listOfGames = Stream.of(resultSheet.split(",")).collect(Collectors.toList());

        String [][] teamOnelist = new String[listOfGames.size()][2] ;
        String [][] teamTwolist = new String[listOfGames.size()][2];
        for (int s=0; s<listOfGames.size();s++) {
            str =listOfGames.get(s);
            pattern=Pattern.compile("[^0-9]+");
            matcher=pattern.matcher(str);
            String team="";


            if (matcher.find()){
                team=matcher.group();
                str.replace(matcher.group(),"");
            }
            pattern=Pattern.compile("[0-9]+");
            matcher=pattern.matcher(str);
            if (matcher.find()){
                teamOnelist[s][0]= team.substring(0,team.length()-1);
                teamOnelist[s][1]=matcher.group();
                str= str.substring(matcher.end()+1,str.length());
            }

            pattern=Pattern.compile("[^0-9]+");
            matcher=pattern.matcher(str);

            if (matcher.find()){
                team=matcher.group();

            }
            pattern=Pattern.compile("[0-9]+");
            matcher=pattern.matcher(str);
            if (matcher.find()){
                teamTwolist[s][0]= team.substring(0,team.length()-1);
                teamTwolist[s][1]=matcher.group();

            }

        }

        int totalS=0;
        int totalC=0;
        int w =0;
        int d=0;
        int l=0;

        for (int i=0;i<teamOnelist.length;i++){
            if (teamOnelist[i][0].equalsIgnoreCase(toFind)){
                totalS+=Integer.valueOf(teamOnelist[i][1]);
                totalC+=Integer.valueOf(teamTwolist[i][1]);
                if(Integer.valueOf(teamOnelist[i][1])>Integer.valueOf(teamTwolist[i][1]))
                    w++;
                if(Integer.valueOf(teamOnelist[i][1])==Integer.valueOf(teamTwolist[i][1]))
                    d++;
                if(Integer.valueOf(teamOnelist[i][1])<Integer.valueOf(teamTwolist[i][1]))
                    l++;
            }
            if (teamTwolist[i][0].equalsIgnoreCase(toFind)){
                totalS+=Integer.valueOf(teamTwolist[i][1]);
                totalC+=Integer.valueOf(teamOnelist[i][1]);
                if(Integer.valueOf(teamOnelist[i][1])>Integer.valueOf(teamTwolist[i][1]))
                    l++;
                if(Integer.valueOf(teamOnelist[i][1])==Integer.valueOf(teamTwolist[i][1]))
                    d++;
                if(Integer.valueOf(teamOnelist[i][1])<Integer.valueOf(teamTwolist[i][1]))
                    w++;
            }


        }
        if (totalS==0 && totalC==0){
            return toFind+":This team didn't play!";
        }
        else{
            int sum=w*3+d;
            return toFind+":W="+w+";D="+d+";L="+l+";Scored="+totalS+";Conceded="+totalC+";Points="+sum;

        }
    }
}