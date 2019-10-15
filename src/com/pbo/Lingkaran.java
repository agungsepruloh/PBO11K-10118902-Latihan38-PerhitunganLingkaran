package com.pbo;

public class Lingkaran {

    public static float diameter;
    public static final float PHI = (float) 3.14;

    public static float hitungJariJari() {
        return diameter / 2;
    }

    public static float hitungLuas() {
        return (float) Math.pow(hitungJariJari(), 2) * PHI;
    }

    public static float hitungKeliling() {
        return PHI * diameter;
    }

}
