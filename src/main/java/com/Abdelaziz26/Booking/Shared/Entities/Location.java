package com.Abdelaziz26.Booking.Shared.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @NotNull(message = "latitude cannot be null")
    private Double latitude;

    @NotNull(message = "longitude cannot be null")
    private Double longitude;
}
