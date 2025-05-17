package com.Abdelaziz26.Booking.Shared.Entities;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;


@Entity
@Table(name = "hotels")
@Data
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Hotel name cannot be empty")
    @Length(min = 5, max = 20)
    private String name;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String code;

    @Embedded
    @Valid
    private Address address;

    @Embedded
    @Valid
    private Location location;

    private Double rating;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
    private List<Room> rooms;



}
