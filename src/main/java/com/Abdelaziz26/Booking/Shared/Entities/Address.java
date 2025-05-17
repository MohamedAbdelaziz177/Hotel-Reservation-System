package com.Abdelaziz26.Booking.Shared.Entities;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @NotBlank(message = "Street must not be empty")
    private String street;

    @NotBlank(message = "city must not be empty")
    private String city;

    @NotBlank(message = "postalCode must not be empty")
    private String postalCode;
}
