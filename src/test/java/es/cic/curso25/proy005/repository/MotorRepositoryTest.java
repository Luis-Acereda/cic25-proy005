package es.cic.curso25.proy005.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.cic.curso25.proy005.model.Motor;

@SpringBootTest
public class MotorRepositoryTest {

    @Autowired
    MotorRepository motorRepository;

    private Map<Long, Motor> setUp(){
        Map<Long, Motor> mapMotores = new HashMap<>();
        Motor motor1 = new Motor();
        motor1.setId((long) 1);
        mapMotores.put(motor1.getId(), motor1);

        Motor motor2 = new Motor();
        motor2.setId((long) 3);
        mapMotores.put(motor2.getId(), motor2);

        return mapMotores;
    }

    // @Test
    // void testBothGetSiguienteId() {
    //     long idDevuelto = motorRepository.GetSiguienteIdConStreams(setUp());
    //     assertEquals(4, idDevuelto);

    //     idDevuelto = motorRepository.GetSiguienteId(setUp());
    //     assertEquals(4, idDevuelto);
    // }
}
