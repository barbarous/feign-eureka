package org.openfeign.client;

import com.netflix.discovery.EurekaClient;
import feign.Feign;

public class OpenClient {

    public static void main(String[] args) {
        EurekaClient eurekaClient = EurekaConfiguration.getEurekaClient();
        WebClient client = Feign.builder()
                .target(WebClient.class, eurekaClient.getApplication("web-server").getInstances().get(0).getHomePageUrl());
        System.out.println(client.status());
    }

}