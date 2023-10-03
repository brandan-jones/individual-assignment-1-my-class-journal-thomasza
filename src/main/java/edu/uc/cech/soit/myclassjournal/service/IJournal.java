package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.List;

public interface IJournal {
    void save (JournalEntry journalEntry);
    List<JournalEntry> fetchAll();
}