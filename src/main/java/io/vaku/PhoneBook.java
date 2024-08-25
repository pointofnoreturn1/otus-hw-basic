package io.vaku;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<Long>> dict = new HashMap<>();

    public void add(String name, long number) {
        Set<Long> numbers = dict.containsKey(name) ? dict.get(name) : new HashSet<>();
        numbers.add(number);
        dict.put(name, numbers);
    }

    public Set<Long> find(String name) {
        return dict.getOrDefault(name, Collections.emptySet());
    }

    public boolean containsPhoneNumber(long number) {
        for (Map.Entry<String, Set<Long>> entry : dict.entrySet()) {
            if (entry.getValue().contains(number)) {
                return true;
            }
        }

        return false;
    }
}
