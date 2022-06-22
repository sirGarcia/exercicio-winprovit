package com.felipe.backend.controller;

import com.felipe.backend.factory.ServiceFactory;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class SequenceController {
    @Autowired
    ServiceFactory serviceFactory;

    @ApiOperation(value = "Retorna o valor da sequencia Alticci para o indice n")
    @RequestMapping(value="alticci/{n}", method = RequestMethod.GET, produces="application/json")
    public Double getAlticci(@PathVariable Integer n){
        return serviceFactory.getSequenceGenerator().getNumberFromAlticci(n);
    }
}
