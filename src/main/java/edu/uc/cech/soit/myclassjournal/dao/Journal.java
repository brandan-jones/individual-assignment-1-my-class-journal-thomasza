package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.service.IJournal;
import org.springframework.stereotype.Repository;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.List;
import java.util.ArrayList;

@Repository
public class Journal implements IJournal {
    List<JournalEntry> allJournalEntries = new ArrayList<>();
    @Override
    public void save(JournalEntry journalEntry) {
        allJournalEntries.add(journalEntry);
    }
    @Override
    public List<JournalEntry> fetchAll() {
            return allJournalEntries;
    }
}
