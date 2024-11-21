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
@Table(name = "social_media")
public class SocialMediaModel {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "social_media", nullable = false)
    private String socialMedia;

    @Column(name = "link", nullable = false)
    private String link;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user_id")
    private UserModel user;
}