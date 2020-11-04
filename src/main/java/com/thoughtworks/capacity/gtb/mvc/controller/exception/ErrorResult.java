package com.thoughtworks.capacity.gtb.mvc.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResult {

    private Integer code;
    private String message;
}
