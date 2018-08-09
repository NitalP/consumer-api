package com.cars.consumer.rest;

import com.cars.consumer.bo.Core;
import com.cars.consumer.service.PdidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample REST service using Spring's REST API
 */
// @Restcontroller = @Controller + @ResponseBody
@RestController
public class SampleRestController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private PdidService pdidService;


    @RequestMapping(value = "/info", method = RequestMethod.GET, produces = "text/plain")
    public String info() {
        if (logger.isDebugEnabled()) {
            logger.debug("/info called on " + getClass().getName());
        }
        return "This is the rest interface for the consumer-api application";
    }

    @RequestMapping(value = "/pdid/{pdid}", method = RequestMethod.GET, produces = "application/json")
    public Core pdid(@PathVariable("pdid") String pdid) {
        Core result =  pdidService.getByPdid(pdid);
        if (result == null){
//            return null;
        }
        return result;
    }

}
