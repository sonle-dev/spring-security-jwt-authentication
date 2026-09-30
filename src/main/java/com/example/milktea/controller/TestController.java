package com.example.milktea.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class TestController {

    @GetMapping
    public ResponseEntity<Map<String, Object>> getOrders(Authentication authentication) {
        return ResponseEntity.ok(Map.of(
                "message", "Truy cập API quản lý đơn trà sữa thành công!",
                "user", authentication.getName(),
                "authorities", authentication.getAuthorities()
        ));
    }
}