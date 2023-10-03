package edu.uc.cech.soit.myclassjournal;

import org.springframework.web.bind.annotation.RequestMapping;

public class MyClassJournalController {
    /**
     * @return Handle the / endpoint
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }


}
