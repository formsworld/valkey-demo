package com.td.test.cache.service;

public interface ICacheService {

    String getValue(String key);
    void setValue(String key, String value);
}
