package io.vaku;

public class Box {
    private double width;
    private double length;
    private double height;
    private String color;
    private boolean isOpen;
    private String object;

    public Box(double width, double length, double height, String color) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
        this.isOpen = true;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Ширина: " + width +
                "\nДлина " + length +
                "\nВысота: " + height +
                "\nЦвет: " + color;
    }

    public void putInside(String object) {
        if (isOpen) {
            if (this.object == null) {
                this.object = object;
                System.out.println(object + " был помещен в коробку");
            } else {
                System.out.println("В коробке уже лежит " + this.object);
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }

    public void takeOut() {
        if (isOpen) {
            if (this.object != null) {
                System.out.println(this.object + " был вынут из коробки");
                this.object = null;
            } else {
                System.out.println("В коробке ничего нет");
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }
}
