package com.td.test.cache.controller;

import com.td.test.cache.dto.CacheDTO;
import com.td.test.cache.service.CacheService;
import com.td.test.cache.service.ICacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private ICacheService cacheService;

    @GetMapping("/{key}")
    public String getHelloWithName(@PathVariable String key) {
        return cacheService.getValue(key);
    }

    @PostMapping("/create")
    public String create(@RequestBody CacheDTO dto) {
       cacheService.setValue(dto.getKey(), dto.getValue());
       return "Success";
    }
}
