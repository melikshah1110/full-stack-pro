package com.hasnol.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age) {
}
