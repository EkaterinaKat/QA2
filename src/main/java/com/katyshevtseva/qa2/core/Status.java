package com.katyshevtseva.qa2.core;

public enum Status {
    OLD_ONES(1L, "Старцы"), CURRENT(2L, "Текущие");


    private Long id;
    private String title;

    Status(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
