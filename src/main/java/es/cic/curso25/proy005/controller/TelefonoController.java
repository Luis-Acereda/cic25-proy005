package es.cic.curso25.proy005.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.curso25.proy005.model.Telefono;
import es.cic.curso25.proy005.service.TelefonoService;

@RestController
@RequestMapping("/telefono")
public class TelefonoController {

    @Autowired
    private TelefonoService telefonoService;

    // C R U D

    @PostMapping
    public long create(@RequestBody Telefono telefono){
        return telefonoService.create(telefono);
    }

    @GetMapping
    public List<Telefono> get(){
        List<Telefono> telefonos = new ArrayList<>();

        Telefono telefono1 = new Telefono();
        telefono1.setId(1);
        telefono1.setNumero("555555555");
        telefono1.setTipoContrato(3);
        telefono1.setTitular("Juan");

        telefonos.add(telefono1);

        Telefono telefono2 = new Telefono();
        telefono2.setId(2);
        telefono2.setNumero("555555556");
        telefono2.setTipoContrato(4);
        telefono2.setTitular("Antonio");

        telefonos.add(telefono2);

        return telefonos;
    }

    @GetMapping("/{id}")
    public Telefono get(@PathVariable long id){
        Telefono telefono1 = new Telefono();
        telefono1.setId(id);
        telefono1.setNumero("555555555");
        telefono1.setTipoContrato(3);
        telefono1.setTitular("Juan");

        return telefono1;
    }

    @PutMapping
    public void update(Telefono telefono){
        
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        
    }
}