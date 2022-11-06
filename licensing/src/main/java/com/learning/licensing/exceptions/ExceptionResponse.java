package com.learning.licensing.exceptions;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class ExceptionResponse {

    private Date date;
    private String errorMessage;
    private String errorDiscription;
}
