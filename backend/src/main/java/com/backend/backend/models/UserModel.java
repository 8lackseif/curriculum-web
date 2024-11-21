package com.backend.backend.models;

import lombok.*;
import jakarta.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Lob
    @Column(name = "summary")
    private String summary;
}