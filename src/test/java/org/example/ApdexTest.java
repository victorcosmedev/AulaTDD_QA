package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApdexTest {

    @Test
    public void calcApdex(){
        Apdex apdex = new Apdex();

        double score = apdex.calcularApdex(90, 0, 100);

        Assertions.assertEquals(0.9, score, 0.001);
    }

    @Test
    public void validarApdexExcelente(){
        Apdex apdex = new Apdex();

        double score = apdex.calcularApdex(1000, 0, 1000);

        Assertions.assertEquals(1, score, 0.001);
    }

    @Test
    public void validarApdexBom(){
        Apdex apdex = new Apdex();

        double score = apdex.calcularApdex(850, 0, 1000);

        Assertions.assertEquals(0.85, score, 0.001);
    }

    @Test
    public void validarApdexRazoavel(){
        Apdex apdex = new Apdex();

        double score = apdex.calcularApdex(750, 0, 1000);

        Assertions.assertEquals(0.75, score, 0.001);
    }

    @Test
    public void validarApdexRuim(){
        Apdex apdex = new Apdex();

        double score = apdex.calcularApdex(500, 0, 1000);

        Assertions.assertEquals(0.5, score, 0.001);
    }

    @Test
    public void validarApdexInaceitavel(){
        Apdex apdex = new Apdex();

        double score = apdex.calcularApdex(0, 0, 1000);

        Assertions.assertEquals(0, score, 0.001);
    }
}
