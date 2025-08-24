// Victor Nascimento Cosme - RM 558856
package org.example;

public class Apdex {

    public double calcularApdex(float quantSatisfatorio, float quantToleravel, int totalAmostras){
        return (quantSatisfatorio + (quantToleravel / 2)) / totalAmostras;
    }
}
