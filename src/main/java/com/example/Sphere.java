package com.example;

public class Sphere {
    
    public static double calcVolume(double radius) {
        return (4 * Math.pow(radius, 3) * Math.PI) / 3;
    }

    public static double calcSurface(double radius) {
        return 4 * Math.pow(radius, 2) * Math.PI;
    }
}
