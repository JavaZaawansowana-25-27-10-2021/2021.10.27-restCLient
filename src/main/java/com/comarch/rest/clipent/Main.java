package com.comarch.rest.clipent;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String url = "http://localhost:8080/book2/1";
        RestTemplate restTemplate = new RestTemplate();

        Book book = restTemplate.getForObject(url, Book.class, new HashMap<>());

        restTemplate.postForObject(url, null, Book.class, new HashMap<>());

        System.out.println(book);
    }
}
