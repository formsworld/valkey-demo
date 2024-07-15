package com.td.test.cache.configuration;

import io.jackey.ConnectionPoolConfig;
import io.jackey.HostAndPort;
import io.jackey.JedisCluster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class ValkeyCacheConfig {

    @Bean
    public JedisCluster getJedisCluster() {
        Set<HostAndPort> jedisClusterNode = new HashSet<>();
        jedisClusterNode.add(new HostAndPort("localhost", 6379));
        return new JedisCluster(jedisClusterNode, 2000, 5, getConfig());
    }

    private ConnectionPoolConfig getConfig() {
        ConnectionPoolConfig config = new ConnectionPoolConfig();
        config.setMaxTotal(32);
        config.setMaxIdle(32);
        config.setMinIdle(16);
        return config;
    }

}
