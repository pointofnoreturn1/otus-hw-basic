package io.vaku;

import java.util.*;

public class PhoneBook {
    private Map<String, List<Long>> dict = new HashMap<>();

    public void add(String name, long number) {
        List<Long> numbers = dict.containsKey(name) ? dict.get(name) : new ArrayList<>();
        numbers.add(number);
        dict.put(name, numbers);
    }

    public List<Long> find(String name) {
        return dict.getOrDefault(name, Collections.emptyList());
    }

    public boolean containsPhoneNumber(long number) {
        for (Map.Entry<String, List<Long>> entry : dict.entrySet()) {
            if (entry.getValue().contains(number)) {
                return true;
            }
        }

        return false;
    }
}
