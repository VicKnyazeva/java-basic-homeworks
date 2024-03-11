package ru.knyazeva.java.basic.homeworks.homework10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> map;

    public PhoneBook() {
        this.map = new HashMap<>();
    }

    public void add(String fullName, String phoneNumber) {
        Set<String> phonesSet = map.get(fullName);
        if (phonesSet == null) {
            phonesSet = new HashSet<>();
            map.put(fullName, phonesSet);
        }
        phonesSet.add(phoneNumber);
    }

    public Set<String> find(String name) {
        return this.map.get(name);
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (Set<String> phonesSet : map.values()) {
            for (String pn : phonesSet) {
                if (pn.equalsIgnoreCase(phoneNumber)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Phone Book:\n");
        for (Map.Entry<String, Set<String>> entry : this.map.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
