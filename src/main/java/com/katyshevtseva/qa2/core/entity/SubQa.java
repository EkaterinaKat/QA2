package com.katyshevtseva.qa2.core.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sub_qa")
public class SubQa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "qa_id")
    private Qa qa;

    @Column(length = 100000)
    private String question;

    @Column(length = 100000)
    private String answer;

    private Integer level;

    private String image;
}
