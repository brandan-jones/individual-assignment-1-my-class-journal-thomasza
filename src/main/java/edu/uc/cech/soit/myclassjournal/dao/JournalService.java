package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * This is the JournalService DAO service, it implements the IJournalService interface and overrides the methods provided.
 * Uses logic from our Journal repository.
 * @author Zach Thomas
 * @version 0.1
 */
@Service
public class JournalService implements IJournalService {
    private final Journal journal;
    public JournalService(Journal journal) {
        this.journal = journal;
    }
    /**
     * Overrides fetchAll() to return journal.fetchAll()
     * @return journal.fetchAll()
     */
    @Override
    public List<JournalEntry> fetchAll() {
        return journal.fetchAll();
    }
    /**
     * Overrides save to return journal.save(journalEntry)
     * @return journal.save(journalEntry)
     */
    @Override
    public void save(JournalEntry journalEntry){
        journal.save(journalEntry);
    }
}
