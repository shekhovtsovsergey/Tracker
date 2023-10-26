package com.shekhovtsov.tracker.model;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.Map;
import com.vladmihalcea.hibernate.type.json.JsonType;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tasks")
@TypeDefs({
        @TypeDef(name = "json", typeClass = JsonType.class)
})
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Map<Integer, String> daysMap;

}
