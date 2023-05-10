package org.openfeign.client;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
import feign.Feign;

public class OpenClient {

    public static void main(String[] args) {
        EurekaClient eurekaClient = EurekaConfiguration.getEurekaClient();
        Applications applications = eurekaClient.getApplications();
        WebClient client = Feign.builder()
                .target(WebClient.class, eurekaClient.getApplication("web-server").getInstances().get(0).getHomePageUrl());
        System.out.println(client.status());
    }

}