package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = true;
        if (citizens.containsKey(citizen.getPassport())) {
            rsl = false;
        }
        citizens.put(citizen.getPassport(), citizen);
        return rsl;
    }


    public Citizen get(String passport) {
        return null;
    }
}
