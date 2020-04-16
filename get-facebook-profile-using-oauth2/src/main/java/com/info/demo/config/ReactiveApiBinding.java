package com.info.demo.config;

import org.springframework.http.server.reactive.ServerHttpRequest;

public abstract class ReactiveApiBinding {
 /*   protected WebClient webClient;

    public ReactiveApiBinding(String accessToken) {
        ServerHttpRequest.Builder builder = WebClient.builder();
        if (accessToken != null) {
            builder.defaultHeader("Authorization", "Bearer " + accessToken);
        } else {
            builder.exchangeFunction(
                    request -> {
                        throw new IllegalStateException(
                                "Can't access the API without an access token");
                    });
        }
        this.webClient = builder.build();
    }*/
}