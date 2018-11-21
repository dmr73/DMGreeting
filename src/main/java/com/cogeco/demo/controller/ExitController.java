package com.cogeco.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogeco.demo.util.Utils;

/**
 * Created by Andrew on 07.02.2016.
 */
@RestController
public class ExitController {
    @RequestMapping("/exit")
    @ResponseBody
    public String exit() {
        int timeOutExit = 3000;
        Utils.stopAppMethod(3, timeOutExit);
        return "The service will be stopped after " + timeOutExit / 1000 + " second!";
    }
}