package com.webapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.CONFLICT, reason="Description is empty for hobby")
public class PersonHobbyDescriptionException extends Exception{
    private String uuid;


    public PersonHobbyDescriptionException(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid(){
        return uuid;
    }
}
