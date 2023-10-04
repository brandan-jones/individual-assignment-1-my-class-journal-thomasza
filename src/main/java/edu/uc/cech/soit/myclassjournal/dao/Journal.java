package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.stereotype.Repository;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.List;
import java.util.ArrayList;
/**
 * This is our Journal DAO which acts as a repository and overrides IJournalService methods.
 * @author Zach Thomas
 * @version 0.1
 */
@Repository
public class Journal implements IJournalService {
    /**
     * allJournalEntries is an ArrayList based on our JournalEntry DTO.
     */
    List<JournalEntry> allJournalEntries = new ArrayList<>();

    /**
     * Overrides fetchAll() to return ArrayList allJournalEntries.
     * @return allJournalEntries
     */
    @Override
    public List<JournalEntry> fetchAll() {
        return allJournalEntries;
    }
    /**
     * Overrides save to add journalEntry from ArrayList allJournalEntries.
     */
    @Override
    public void save(JournalEntry journalEntry) {
        allJournalEntries.add(journalEntry);
    }
}
