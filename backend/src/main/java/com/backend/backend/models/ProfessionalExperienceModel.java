package com.backend.backend.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "professional_experience")
public class ProfessionalExperience {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "job_title", nullable = false)
    private String jobTitle;

    @Column(name = "start_year", nullable = false)
    private Integer startYear;

    @Column(name = "end_year")
    private Integer endYear;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "currently_employed", nullable = false)
    private Boolean currentlyEmployed = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user_id")
    private User user;
}