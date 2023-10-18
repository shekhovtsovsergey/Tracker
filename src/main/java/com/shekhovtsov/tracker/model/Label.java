package com.shekhovtsov.tracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "labels")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String value;
    private String domain;

}
