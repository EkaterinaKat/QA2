package com.katyshevtseva.qa2.core.entity;

import com.katyshevtseva.qa2.core.Status;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Qa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100000)
    private String question;

    @Column(length = 100000)
    private String answer;

    private Integer level;

    private String image;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_repeat")
    private Date lastRepeat;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "qa_tags",
            joinColumns = @JoinColumn(name = "qa_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags;

    @OneToMany(mappedBy = "qa")
    private List<SubQa> subQas = new ArrayList<>();
}
