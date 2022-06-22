package com.felipe.backend.service;

import com.felipe.backend.cache.CacheManager;
import com.felipe.backend.facade.ISequenceGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SequenceGenerator implements ISequenceGenerator {

    @Override
    public Double getNumberFromAlticci(Integer n) {
        return CacheManager.getCache().containsKey(n)? CacheManager.getCache().get(n) : getValueOperation(n);
    }

    private Double getValueOperation(Integer n){
        double r = 0;
        List<Double> ALTICCI = new ArrayList<>(Arrays.asList((double) 0, 1.0, 1.0));
        if(ALTICCI.contains(n)){
            r = ALTICCI.get(n);
            CacheManager.putCache(n, r);
        } else {
            for (int a = 3; a <= n; a++) {
                r = ALTICCI.get(a - 3) + ALTICCI.get(a - 2);
                ALTICCI.add(r);
                CacheManager.putCache(a, r);
            }
        }
        return r;
    }
}
