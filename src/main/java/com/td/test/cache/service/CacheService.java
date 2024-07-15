package com.td.test.cache.service;


import io.jackey.JedisCluster;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CacheService implements ICacheService{

    private final JedisCluster jedisCluster;

    public CacheService(@Qualifier("getJedisCluster") JedisCluster jedisCluster) {
        this.jedisCluster = jedisCluster;
    }

    @Override
    public String getValue(String key) {
        return jedisCluster.get(key);
    }

    @Override
    public void setValue(String key, String value) {
        jedisCluster.set(key, value);
    }
}
