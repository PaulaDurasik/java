package Niedziela511;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Counter {
    Map<String, Integer> allWords=new TreeMap <>(); // używamy trimapy żeby alfabetycznie posortować;

    void countreVoid() {
        try {
            Scanner scanner = new Scanner(new File("C:/Users/Bartłomiej/Desktop/pan-tadeusz.txt"));

            while(scanner.hasNext()) {
                String word = scanner.next().toLowerCase();//scanner wczytuje po wyrazie
                if (allWords.containsKey(word)) {
                    allWords.put(word, allWords.get(word) + 1);


                } else {
                    allWords.put(word, 1);// jeżeli trafliśmy pierwszy raz na słowo w mapie to wpisujemy 1

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(Map.Entry<String,Integer> word: allWords.entrySet()){
            System.out.printf("%s->%s\n" ,word.getKey(),word.getValue());
        }
    }


}
