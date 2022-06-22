package com.felipe.backend.cache;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    public static Map<Integer, Double> cache = new HashMap<>();

    public static Map<Integer, Double> getCache(){
        return cache;
    }

    public static void putCache(Integer key, Double value){
        if(cache.size() >= 8192 || cache.size() == 0){
            cache = new HashMap<>();
            cache.put(0, (double)0);
            cache.put(1, 1.0);
            cache.put(2, 1.0);
        }
        cache.put(key, value);
    }
}
