package com.example.firstprojectdb.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "city")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "city_id")
    private Long id;

    @Column (name = "city")
    private String city;

    @Column (name = "country_id")
    private Long countryId;

    @Column (name = "last_update")
    private LocalDateTime lastUpdate;

}
