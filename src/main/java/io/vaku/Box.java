package io.vaku;

import java.util.List;

public class Box <T extends Fruit> {
    private final List<T> list;

    public Box(List<T> list) {
        this.list = list;
    }

    public void addFruit(T friut) {
        list.add(friut);
    }

    public int weight() {
        return list.stream().mapToInt(Fruit::getWeight).sum();
    }

    public boolean compare(Box<? extends Fruit> another) {
        return this.weight() == another.weight();
    }

    public void moveAllTo(Box<? super T> another) {
        for (T fruit : list) {
            another.addFruit(fruit);
        }
        list.clear();
    }
}
