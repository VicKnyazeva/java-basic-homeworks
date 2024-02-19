package ru.knyazeva.java.basic.homeworks.homework7;

public class Man {
    private String name;
    private Transport currentTransport;
    private int force;
    public static final int RES_PER_KM = 5;

    public Man(String name, Transport currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
        this.force = 50;
    }

    public void move(Transport transport, int distance, int terrain) {
        if(transport == null)
            System.out.println("Человек идет пешком");
        else
            currentTransport.move(distance, terrain);
    }

    public void takeTransport(Transport transport) {
        currentTransport = transport;
    }

    public void freeTransport() {
        currentTransport = null;
    }

}
