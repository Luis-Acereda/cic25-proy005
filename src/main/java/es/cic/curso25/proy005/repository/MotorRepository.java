package es.cic.curso25.proy005.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import es.cic.curso25.proy005.model.Motor;

public class MotorRepository {
    // C R U D
    private Map<Long, Motor> motores = new HashMap<>();

    public long create(Motor motor){
        long newId = getSiguienteId(motores);
        motor.setId(newId);
        motores.put(motor.getId(), motor);
        return motor.getId();
    }

    private long getSiguienteIdConStreams(Map<Long, Motor> motores){
        long maxId = motores
                        .keySet()
                        .stream()
                        .max(
                            (primero, segundo) -> (int) (segundo.longValue() - primero.longValue())
                        ).get();
        return maxId + 1;
    }

    private long getSiguienteId(Map<Long, Motor> motores) {
        long maxId = 0;

        Set<Long> ids = motores.keySet();
        Iterator<Long> iteratorId = ids.iterator();

        while(iteratorId.hasNext()){
            Long siguiente = iteratorId.next();
            if(siguiente.longValue() > maxId){
                maxId = siguiente.longValue();
            }
        }

        maxId++;
        return maxId;
    }
}
