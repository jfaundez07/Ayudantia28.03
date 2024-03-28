import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioTest {

    int numero_par;
    int numero_impar;

    @BeforeEach
    void setUp() {
        numero_par = 4;
        numero_impar = 5;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void esPar() {
        assertTrue(Ejercicio.esPar(numero_par));
        assertFalse(Ejercicio.esPar(numero_impar));
    }
}