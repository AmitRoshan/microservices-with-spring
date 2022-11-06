package com.learning.licensing.exceptions;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(String msg){
        super(msg);
    }
}
