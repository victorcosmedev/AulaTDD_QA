package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApdexTest {

    @Test
    public void calcApdex(){
        Apdex apdex = new Apdex();

        float score = apdex.calcularApdex(770, 60, 1000);

        Assertions.assertEquals(0.80, score, 0.001);
    }
}
