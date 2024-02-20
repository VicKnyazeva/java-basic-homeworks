package ru.knyazeva.java.basic.homeworks.homework7;

public class Man implements Driver {
    private String name;
    private Movable currentTransport;
    private int force;
    public static final int RES_PER_KM = 5;

    public Man(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public Movable getCurrentTransport() {
        return currentTransport;
    }

    public boolean move(int distance, Terrain terrain) {
        if (currentTransport == null) {
            System.out.println("Человек идет пешком");
            return true;
        }
        return currentTransport.move(distance, terrain, this);
    }

    public void takeTransport(Movable transport) {
        currentTransport = transport;
    }

    public void freeTransport() {
        currentTransport = null;
    }

    @Override
    public boolean decreaseForce(int force) {
        if (this.force < force) {
            return false;
        }
        this.force -= force;
        return true;
    }

    public void outStats() {
        System.out.printf("name=%-20s, force=%-10d|\n", name, force);
    }

}
