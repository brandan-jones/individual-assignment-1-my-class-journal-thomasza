package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

/**
 * this is our journal entry dto
 * includes fields for Notes and Date
 * using Lombok @Data annotation to generate getters & setters
 */
public @Data class JournalEntry {
    private String Notes;
    private String Date;
}
