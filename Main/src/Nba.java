import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Nba {

    public static String nbaCup(String resultSheet, String toFind) {
        String str;
        List<String> sheet = Arrays.stream(resultSheet.split(",")).collect(Collectors.toList());
        Pattern pattern=Pattern.compile("[+-]?([0-9]+[.])");
        for(String s:sheet) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                return "Error(float number):"+s;

            }
        }
        if (toFind=="")
            return "";

        List<GameResult> result = parse(sheet);

        int totalS=0;
        int totalC=0;
        int w =0;
        int d=0;
        int l=0;

        for (GameResult i:result){
            if (i.team1Name.equalsIgnoreCase(toFind)){
                totalS+=i.team1score;
                totalC+=i.team2score;
                if(i.team1score>i.team2score)
                    w++;
                else if(i.team1score==i.team2score)
                    d++;
                else
                    l++;
            }
            if (i.team2Name.equalsIgnoreCase(toFind)){
                totalS+=i.team2score;
                totalC+=i.team1score;
                if(i.team1score>i.team2score)
                    l++;
                else if(i.team1score==i.team2score)
                    d++;
                else
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

    public static List<GameResult> parse(List<String> sheet) {
        List<GameResult> result = new ArrayList<>();

        sheet.stream()
                .map(item -> item.split(" "))
                .map(i -> Arrays.stream(i).collect(Collectors.toList()))
                .forEach(data -> {

                    GameResult gameResult = new GameResult();
                    int counter = 0;

                    for (int i = 0; i < data.size(); i++) {
                        if(isInteger(data.get(i))) {

                            if(counter == 0) {
                                gameResult.setTeam1Name(String.join(" ", data.subList(counter, i)));
                                gameResult.setTeam1score(Integer.parseInt(data.get(i)));
                            } else {
                                gameResult.setTeam2Name(String.join(" ", data.subList(counter, i)));
                                gameResult.setTeam2score(Integer.parseInt(data.get(i)));
                            }

                            counter = i+1;
                        }
                    }

                    result.add(gameResult);
                });

        return result;
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

    static class GameResult {

        private String team1Name;
        private Integer team1score;
        private String team2Name;
        private Integer team2score;

        public String getTeam1Name() {
            return team1Name;
        }

        public void setTeam1Name(String team1Name) {
            this.team1Name = team1Name;
        }

        public Integer getTeam1score() {
            return team1score;
        }

        public void setTeam1score(Integer team1score) {
            this.team1score = team1score;
        }

        public String getTeam2Name() {
            return team2Name;
        }

        public void setTeam2Name(String team2Name) {
            this.team2Name = team2Name;
        }

        public Integer getTeam2score() {
            return team2score;
        }

        public void setTeam2score(Integer team2score) {
            this.team2score = team2score;
        }
    }
}