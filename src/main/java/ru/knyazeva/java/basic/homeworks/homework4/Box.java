package ru.knyazeva.java.basic.homeworks.homework4;

public class Box {
    private String color;
    private int width;
    private int height;
    private int length;
    private boolean isOpened;
    private String stringObject;

    public Box(String color, int with, int height, int length, boolean isOpened) {
        this.color = color;
        this.width = with;
        this.height = height;
        this.length = length;
        this.isOpened = isOpened;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void printBoxInfo() {
        String boxStatus = isOpened ? "opened" : "closed";
        String objectInfo = stringObject == null ? "has no object" : "has "+ stringObject;
        System.out.printf("Color: %s\nWidth: %d\nHeight: %d\nLength: %d\nStatus: %s and %s\n\n",
                color, width, height, length, boxStatus, objectInfo);
    }

    public void open() {
        if (!isOpened) {
            isOpened = true;
            System.out.println("Box is opened");
        }
    }

    public void close() {
        if (isOpened) {
            isOpened = false;
            System.out.println("Box is closed");
        }
    }

    public void putObject(String name) {
        if (isOpened && stringObject == null) {
            stringObject = name;
            System.out.println(name + " was added");
        }
    }

    public void removeObject() {
        if (isOpened && (stringObject != null)) {
            stringObject = null;
            System.out.println("Object was removed");
        }
    }
}
