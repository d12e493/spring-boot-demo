package com.test.controller;

import com.test.bo.AdBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){

        AdBO adBO = AdBO.builder()
                .adId("a1168787")
                .name("測試廣告")
                .build();

        adBO.setAdId("b9999");
        adBO.getName();

        // all argument
        adBO = new AdBO("c111","anc");

        // no argument
        adBO = new AdBO();

        log.debug("demo debug");
        log.info("info debug");

        return "ok";
    }
}
