package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import edu.uc.cech.soit.myclassjournal.service.IJournal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService implements IJournalService {
    @Autowired
    private IJournal journal;
    public JournalService(){}
    public JournalService(IJournal journal){
        this.journal = journal;
    }
    @Override
    public void save(JournalEntry journalEntry){
        journal.save(journalEntry);
    }
    @Override
    public List<JournalEntry> fetchAll() {
        return journal.fetchAll();
    }
}
