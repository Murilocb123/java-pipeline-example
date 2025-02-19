package com.murilocb123.service_example.dto;

public record ProductDTO(String name, String description, double price) {

    public ProductDTO {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
    }
}