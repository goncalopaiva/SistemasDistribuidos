package edu.ufp.inf.sd.rmi.server;

import java.io.Serializable;

public class Coordenadas implements Serializable {
    private double x;
    private double y;

    public Coordenadas(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return x+","+y;
    }


}
