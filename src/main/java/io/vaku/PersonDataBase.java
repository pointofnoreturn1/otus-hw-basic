package io.vaku;

import java.util.Map;

public class PersonDataBase {
    private Map<Long, Person> people;

    public PersonDataBase(Map<Long, Person> people) {
        this.people = people;
    }

    public Person findById(long id) {
        return people.get(id);
    }

    public void add(Person person) {
        people.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        return switch (person.getPosition()) {
            case MANAGER, BRANCH_DIRECTOR, DIRECTOR, SENIOR_MANAGER -> true;
            default -> false;
        };
    }

    public boolean isEmployee(long id) {
        return switch (people.get(id).getPosition()) {
            case MANAGER, BRANCH_DIRECTOR, DIRECTOR, SENIOR_MANAGER -> false;
            default -> true;
        };
    }
}
