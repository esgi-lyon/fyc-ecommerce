package com.zizou.fyc.client;

public record ClientRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
