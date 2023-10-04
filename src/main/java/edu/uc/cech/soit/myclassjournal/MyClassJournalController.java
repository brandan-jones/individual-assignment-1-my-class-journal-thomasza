package edu.uc.cech.soit.myclassjournal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/**
 * This is the main controller, which handles the page mapping for thymeleaf.
 * @author Zach Thomas
 * @version 0.1
 */
@Controller
public class MyClassJournalController {
    /**
     * Mapping for home page.
     * @return index
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }
    /**
     * Mapping for the entry page.
     * @return entry
     */
    @GetMapping("/entry")
    public String entryPage(){ return "entry"; }
}
