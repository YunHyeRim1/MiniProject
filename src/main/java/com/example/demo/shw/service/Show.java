package com.example.demo.shw.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component @Data @AllArgsConstructor @Lazy @NoArgsConstructor
public class Show {
    private String showNum, title, period, time, venue, admission, 
    				price, host, management, inquiry, posterImage;
}
