package Niedziela511;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Regex {


    static void match(String word, String pattern){
        System.out.println("słowo"+word);
        System.out.println("Wzorzec"+pattern);


        if (word.matches(pattern)) {
            System.out.println("TAK");
        } else{
            System.out.println("NIE");
        }
        System.out.println();

    }
}
