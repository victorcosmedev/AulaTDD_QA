// Victor Nascimento Cosme - RM 558856
package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ApdexTest {

    private Apdex apdex;

    @BeforeAll
    public static void initGeral(){
        System.out.println("Começando os testes.");
    }

    @BeforeEach
    public void inicializacao(){
        apdex = new Apdex();
    }

    @Test
    public void calcApdex(){
        double score = apdex.calcularApdex(502970, 0, 558856);
        Assertions.assertEquals(0.9, score, 0.001);
    }

    @Test
    public void validarApdexExcelente(){
        double score = apdex.calcularApdex(525324, 0, 558856);
        Assertions.assertEquals(0.94, score, 0.001);
    }

    @Test
    public void validarApdexBom(){
        double score = apdex.calcularApdex(475027, 0, 558856);
        Assertions.assertEquals(0.85, score, 0.001);
    }

    @Test
    public void validarApdexRazoavel(){
        double score = apdex.calcularApdex(391199, 0, 558856);
        Assertions.assertEquals(0.70, score, 0.001);
    }

    @Test
    public void validarApdexRuim(){
        double score = apdex.calcularApdex(279428, 0, 558856);
        Assertions.assertEquals(0.5, score, 0.001);
    }

    @Test
    public void validarApdexInaceitavel(){
        double score = apdex.calcularApdex(0, 0, 558856);
        Assertions.assertEquals(0, score, 0.001);
    }
}
