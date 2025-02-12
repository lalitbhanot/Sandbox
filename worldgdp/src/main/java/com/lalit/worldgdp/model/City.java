package com.lalit.worldgdp.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class City {
    @NotNull
    private Long id;
    @NotNull
    @Size(max = 35)
    private String name;
    @NotNull
    @Size(max = 3, min = 3)
    private String countryCode;
    private Country country;
    @NotNull
    @Size(max = 20)
    private String district;
    @NotNull
    private Long population;
}