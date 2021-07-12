package tr.org.bura.training.java;

import lombok.*;

@Data
@AllArgsConstructor
public class PersonWithLombok {
    private String name;
    private String surName;
    private int age;
    private String address;
}
