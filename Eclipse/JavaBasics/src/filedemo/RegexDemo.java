package filedemo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String Line = "Tamil Tamilnadu Tamilan";
        Pattern p = Pattern.compile("Tamil");
        Matcher m = p.matcher(Line);
        while(m.find())
        {
        	System.out.println(m.group());
        }
        
    }
}


