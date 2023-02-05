package com.example.firstprojectdb.model;

import com.example.firstprojectdb.annotations.PhoneNumber;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "darbuotojas")
@Getter
@Setter
public class Darbuotojas {

    @Id
    @Column(name = "ASMENSKODAS")
    @NotEmpty
    @Pattern(regexp="\\d{6}", message = "nurodytas skaicius neatitinka salygu.")
    private String asmensKodas;

    @Column(name = "VARDAS")
    @NotBlank(message = "vardas negali buti tuscias ar su space'sais")
    private String vardas;

    @Column(name = "PAVARDE")
    @PhoneNumber(phoneNumberType = PhoneNumberType.NOT_FULL)
    private String pavarde;

    //--------------------------------------------------------------------------------------

































    //private static final Pattern MOBILE_NO_PATTERN = Pattern.compile("^((\+?370|8)[0-9]{8})$");
    //bent 5 raides zodis: ([a-zA-Z]{5,}\s)
}
