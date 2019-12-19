package com.dloading.bootdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Dloading
 * @since 2019/12/18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Serializable {
    private boolean success;
    private String message;
}
