package edu.uc.cech.soit.myclassjournal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyClassJournalController {
    /**
     * @return Handle the endpoints for thymeleaf dialect
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/entry")
    public String entryPage(){ return "entry"; }
}
