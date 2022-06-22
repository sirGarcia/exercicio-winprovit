package com.felipe.backend.factory;

import com.felipe.backend.facade.ISequenceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {
    @Autowired
    ISequenceGenerator sequenceGenerator;

    public ISequenceGenerator getSequenceGenerator() {
        return sequenceGenerator;
    }
}
