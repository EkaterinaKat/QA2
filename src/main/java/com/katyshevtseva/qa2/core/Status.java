package com.katyshevtseva.qa2.core;

public enum Status {
    OLD_ONES(1L, "Старцы"), CURRENT(2L, "Текущие");

    private final Long id;
    private final String title;

    Status(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
