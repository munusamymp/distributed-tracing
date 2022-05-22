package com.zhaohuabing.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Huabing Zhao
 */
@RestController
public class EShopController {

    @GetMapping("/checkout")
    @ResponseBody
    private static String helloworld() {
        return "You have successfully checked out your shopping cart.";
    }
    

}
