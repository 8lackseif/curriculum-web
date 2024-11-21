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
@Table(name = "languages")
public class Language {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "language", nullable = false)
    private String language;

    @Lob
    @Column(name = "level", nullable = false)
    private String level;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user_id")
    private User user;
}