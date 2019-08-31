package io.ascending.training.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    //https://www.freeformatter.com/java-regex-tester.html
    //https://www.geeksforgeeks.org/regular-expressions-in-java/
    //https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
    public static void main( String args[] ) {
//        System.out.println (Pattern.matches(".",
//                "3000"));

//        "/dep/123"
        RegexMatches rm = new RegexMatches();
        rm.simpleDemo("This order was placed for QT3000! OK?");
        rm.splitAPIUrl("/dep$test");
////        rm.splitAPIUrl("dep/123");
//
////        rm.splitUrl("/dep/123");
////        System.out.println (Pattern.matches(".",
////                "3000"));
        String log="burger.letters.com - - [01Jul1996:00:00:12 -0400] 'GET /images/NASA-logosmall.gif' HTTP/1.0";
////        String log="burger.letters.com - - [01Jul1996:00:00:12 -0400] 'GET /images/NASA-logosmall.GIF' HTTP/1.0";
        rm.splitLog(log);
    }
    public boolean splitLog(String line){
        String pattern = "(.*)(GET.*\\.gif|GET.*\\.GIF)(.*)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        }else {
            System.out.println("NO MATCH");
        }
        return m.find();
    }


    public boolean splitAPIUrl(String url){
        String pattern = "^/([a-z]*)(\\$)([a-z]*)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(url);
        if (m.find()) {
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        }else {
            System.out.println("NO MATCH");
        }
        return m.find();
    }
    public boolean simpleDemo(String line){
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        }else {
            System.out.println("NO MATCH");
        }
        return m.find();
    }
    public String[] splitUrl(String url){

        // Specifies the string pattern which is to be searched
        String delimiter =  "\\/";
        Pattern pattern = Pattern.compile(delimiter);

        // Used to perform case insensitive search of the string
        String[] result = pattern.split(url);


        for (String temp: result)
            System.out.println(temp);
        return result;
    }
}
