package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

/**
 * This is the DTO for our journal entries.
 * It uses the Lombok @Data annotation to generate our getters & setters.
 * @author Zach Thomas
 * @version 0.1
 */
public @Data class JournalEntry {
    private String Title;
    private String Date;
    private String Notes;
}

