package com.EP.backend.dto;

/**
 * Output DTO returned to API clients.
 *
 * Returning DTOs instead of entities gives you freedom to change persistence
 * details without breaking API consumers.
 */
public record UserResponse(
    Long id,
    String name
) {
}
