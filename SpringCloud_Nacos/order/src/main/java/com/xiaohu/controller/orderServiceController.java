package com.xiaohu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class orderServiceController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/getservicelist")
    public List<ServiceInstance> getServiceList(){
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("stock");
        return serviceInstances;
    }

}
