package com.webapp.service;

import com.webapp.entity.SimpleDimaQue;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleDimaQueSvcImpl implements SimpleDimaQueSvc{

    Logger log = Logger.getLogger(SimpleDimaQueSvcImpl.class);
    private final List<SimpleDimaQue> questionnaires = new ArrayList<>();

    @Override
    public void saveQuestionnaire(SimpleDimaQue simpleDimaQue) {
        questionnaires.add(simpleDimaQue);
        log.info("Saved SimpleDimaQue: " + simpleDimaQue.toString());
    }
}
