package es.cic.curso25.proy005;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TelefonoControllerTest {

    @Autowired
    private TelefonoController telefonoController;

    @Test
    void testCreate(){
        long resultado = telefonoController.create(null);
        assertTrue(resultado > 0);
    }
}
