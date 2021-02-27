package week02d05;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    public static void main(String[] args) {
        List<String> progLang = new ArrayList<>();
        progLang.add("Java");
        progLang.add("Python");
        progLang.add("JavaScript");

        for (String language : progLang) {
            if (language.length()>5){
                System.out.println(language);
            }

        }






    }

}
