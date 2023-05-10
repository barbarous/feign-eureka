package org.openfeign.client;

import feign.RequestLine;

public interface WebClient {
    @RequestLine("GET /status")
    String status();
}
