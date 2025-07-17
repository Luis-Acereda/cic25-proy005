package es.cic.curso25.proy005.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.curso25.proy005.exception.NotNecesaryIdException;
import es.cic.curso25.proy005.model.Motor;
import es.cic.curso25.proy005.service.MotorService;

@RestController
@RequestMapping("motor/")
public class MotorController {

    private final static Logger LOGGER = LoggerFactory.getLogger(MotorController.class);

    @Autowired
    private MotorService motorService;

    @PostMapping
    public long create(Motor motor) {
        if (motor.getId() != null) {
            throw new NotNecesaryIdException("Se ha pasado un ID al intentar crear un nuevo motor");
        }
        return motorService.create(motor);
    }

}
