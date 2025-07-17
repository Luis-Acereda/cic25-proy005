package es.cic.curso25.proy005.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.cic.curso25.proy005.model.Motor;

@SpringBootTest
public class MotorServiceIntegrationTest {

    @Autowired
    private MotorService motorService;

    @Test
    void testCreate() {
        Motor motorACrear = new Motor();
        motorACrear.setMarca("Ferrari");
        motorACrear.setPotencia(210.5);
        motorACrear.setEncendido(true);

        long idAsignado = motorService.create(motorACrear);

        assertTrue(idAsignado > 0, "El id no debe ser no positivo");

        motorACrear.setId(idAsignado);

        motorService.create(motorACrear);
    }
}
