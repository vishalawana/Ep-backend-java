package com.EP.backend.dto;

import jakarta.validation.constraints.NotBlank;

/**
 * Input DTO used for create/update style requests.
 *
 * Validation annotations belong here because this object represents client input.
 */
public record UserRequest(
    @NotBlank(message = "Name is required")
    String name
) {
}
