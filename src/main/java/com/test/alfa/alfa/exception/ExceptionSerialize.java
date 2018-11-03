package com.test.alfa.alfa.exception;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ExceptionSerialize {
    private int code;
    private String message;
}
