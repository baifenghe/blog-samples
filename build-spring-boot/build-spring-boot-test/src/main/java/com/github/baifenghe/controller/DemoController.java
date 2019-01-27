package com.github.baifenghe.controller;

import com.github.baifenghe.demo.IntegerService;
import com.github.baifenghe.demo.StringService;
import com.github.baifenghe.properties.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * @author bfh
 * @since 2019/01/17
 */
@RestController
public class DemoController {

    @Autowired
    private IntegerService integerService;

    @Autowired
    private StringService stringService;

    @Autowired
    private DemoProperties properties;



    /**
     * 测试 DemoProperties
     */
    @GetMapping("getStarterIps")
    public Set<String> getStarterIps() {

        return properties.getIps();

    }


    /**
     * 测试 DemoProperties
     */
    @GetMapping("getStarterName")
    public String getStarterName() {

        return properties.getName();
    }


    /**
     * 测试StringService
     */
    @PostMapping("testStringService")
    public String testStringService(String str) {

        return stringService.toUpperCase(str);
    }

    /**
     * 测试IntegerService
     */
    @PostMapping("testIntegerService")
    public int testIntegerService(int n1, int n2) {

        return integerService.max(n1, n2);
    }


}
