package regexText;

import main.Configuration;
import main.Main;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetValue extends Configuration {

    public static ArrayList<String> DATE_RESULT= new ArrayList<>();
    public static ArrayList<String> TIME_RESULT= new ArrayList<>();
    public static ArrayList<String> PLACE_RESULT= new ArrayList<>();
    public static ArrayList<String> DESC_RESULT= new ArrayList<>();
    public static ArrayList<String> TITLE_RESULT= new ArrayList<>();


    public static void getData(String[] array) {
        array = Main.StringResponse;
        String[] subStr;

        String delimeter = "\n"; // Разделитель
        for (int n = 0; n < array.length; n++) {
            subStr=array[n].split(delimeter);
            for(int i = 0; i < subStr.length; i++) {
               getValuesFromPost(subStr[i],Configuration.getRegexTitle(),TITLE_RESULT);
               getValuesFromPost(subStr[i],Configuration.getRegexDescription(),DESC_RESULT);
                getValuesFromPost(subStr[i],Configuration.getRegexDate(),DATE_RESULT);
                getValuesFromPost(subStr[i],Configuration.getRegexTime2(),TIME_RESULT);
                getValuesFromPost(subStr[i],Configuration.getRegexPlace(),PLACE_RESULT);
            }

        }

    }


    private static void getValuesFromPost(String desc, String regex,ArrayList<String> container){
        int count = 0;
        String[] allMatches = new String[2];
        Matcher m = Pattern.compile(regex).matcher(desc);
        while (m.find()) {
            allMatches[count] = m.group();
            count++;
        }

        for (int j = 0; j < allMatches.length; j++) {
            if (allMatches[j]==null){
                continue;
            }
            else {
                //DATE_RESULT=dates[0];
                container.add(allMatches[j]);
                //System.out.println(DATE_RESULT);
            }
        }

    }
}
