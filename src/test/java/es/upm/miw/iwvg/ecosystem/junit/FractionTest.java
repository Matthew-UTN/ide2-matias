package es.upm.miw.iwvg.ecosystem.junit;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(1,2);
    }

    @Test
    void decimal(){
        assertEquals(0.5,fraction.decimal());
    }


}
