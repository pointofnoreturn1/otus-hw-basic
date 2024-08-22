package io.vaku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }

    private static List<Integer> getRange(int from, int to) {
        List<Integer> rangeList = new ArrayList<>();

        for (int i = from; i <= to; i++) {
            rangeList.add(i);
        }

        return rangeList;
    }

    private static int getSumHigherThanFive(List<Integer> integers) {
        return integers.stream().filter(it -> it > 5).mapToInt(it -> it).sum();
    }

    private static void fill(int num, List<Integer> integers) {
        Collections.fill(integers, num);
    }

    private static void incrementBy(int num, List<Integer> integers) {
        integers.replaceAll(integer -> integer + num);
    }

    private static List<String> getEmployeesNames(List<Employee> employees) {
        return employees.stream().map(Employee::getName).toList();
    }

    private static List<Employee> geEmployeesOlderThan(List<Employee> employees, int age) {
        return employees.stream().filter(it -> it.getAge() >= age).toList();
    }

    private static boolean isAvgAgeHigherThan(List<Employee> employees, int avgAge) {
        return avgAge > ((int) employees.stream().mapToInt(Employee::getAge).average().orElse(0));
    }

    private static Employee getYoungestEmployee(List<Employee> employees) {
        return employees.stream().min(Comparator.comparingInt(Employee::getAge)).orElse(null);
    }
}
