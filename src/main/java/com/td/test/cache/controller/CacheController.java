package com.td.test.cache.controller;

import com.td.test.cache.dto.CacheDTO;
import com.td.test.cache.service.ICacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/cache")
@RequiredArgsConstructor
public class CacheController {

    private final ICacheService cacheService;

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
