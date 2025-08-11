package org.example;

public class Apdex {

    public float calcularApdex(float quantSatisfatorio, float quantToleravel, int totalAmostras){
        return (quantSatisfatorio + (quantToleravel / 2)) / totalAmostras;
    }
}
