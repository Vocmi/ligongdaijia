package com.vocmi.daijia.driver.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-driver")
public interface DriverAccountFeignClient {


}