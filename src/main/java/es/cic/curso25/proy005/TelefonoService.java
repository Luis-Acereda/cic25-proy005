package es.cic.curso25.proy005;

import org.springframework.stereotype.Service;

@Service
public class TelefonoService {

    private long contador;
    
    public long create(Telefono telefono){
        return ++contador;
    }
}
