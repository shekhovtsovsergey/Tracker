package com.shekhovtsov.tracker.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "labels")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String value;
    private String domain;

    public Label(String id) {
        this.id = id;
    }


}
