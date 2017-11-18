package Niedziela511;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Company {
    Map <Integer, String> map = new HashMap <>();

    void addEmploye() {
        map.put(34, "Anna Nowak");
        map.put(23, "Jan Durasik");
        map.put(56, "Kamil Bodo");
        map.put(76, "Ola Mola");
    }

    void showAllKeys() {
        Set <Integer> allKeys = map.keySet();
        System.out.println(allKeys);

    }

    void showAllNames() {
        System.out.println(map.values());

    }

    void getEmployye(int emploeeId) {
        if (map.containsKey(emploeeId)) {
            System.out.println(map.get(emploeeId));
        } else {
            System.out.println("Nie ma takiego pracownika");
        }
    }

    void showAll() {
        Set <Map.Entry <Integer, String>> set = map.entrySet();
        for (Map.Entry <Integer, String> entry : map.entrySet()) {
            System.out.println(String.format("%s -> %s", entry.getKey(), entry.getValue()));
        }
    }
}
