package com.shekhovtsov.tracker.model;

import javax.persistence.*;

@Entity
@Table(name = "labels")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String value;
    private String domain;

}
