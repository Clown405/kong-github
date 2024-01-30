package com.example.kong.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class ClassController {
    protected final Logger logger = LoggerFactory.getLogger(ClassController.class);

    @GetMapping("/code")
    public void getOneClass(){
        /**
         * Signature keyId="cd2341dserdke",
         * algorithm="hmac-sha256",signature="sR/HwSzkad28iQYf2n1F7kFjVpPTC25kuSJUaR8FWJ0="
         */
        logger.info("进入ClassController！！！");

        return;

    }
}
