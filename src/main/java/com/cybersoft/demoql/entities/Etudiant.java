package com.cybersoft.demoql.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "td_etudiant")
@Data
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uti_nom",length = 80)
    private String nom;

    @Column(name = "uti_prenom",length = 80)
    private String prenom;

    @Column(name = "uti_adresse",length = 100)
    private String adresse;

    @Column(name = "uti_age")
    private int age;

    @Column(name = "uti_date_inscription")
    private LocalDateTime date;
}
