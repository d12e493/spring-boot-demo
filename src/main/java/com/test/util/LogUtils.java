package com.test.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogUtils {

    final static ObjectMapper mapper = new ObjectMapper();

    public static void debug(String name,Object obj){
        log.debug(String.format("---------------- %s start ----------------",name));
        try {
            log.debug(mapper.writeValueAsString(obj));
        }catch(Exception e){
            log.error(e.getMessage(),e);
        }

        log.debug(String.format("---------------- %s end ----------------",name));
    }
}
