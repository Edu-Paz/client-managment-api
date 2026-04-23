package com.devsuperior.client_managment_api.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError{
    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError() {
        super();
    }

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public ValidationError(Instant timestamp, Integer status, String error, String path, List<FieldMessage> errors) {
        super(timestamp, status, error, path);
        this.errors = errors;
    }

    public List<FieldMessage> getErros() {
        return errors;
    }

    public void addError(String fieldMessage, String message){
        errors.add(new FieldMessage(fieldMessage, message));
    }
}
