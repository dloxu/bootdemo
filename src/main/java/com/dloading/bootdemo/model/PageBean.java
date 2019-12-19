package com.dloading.bootdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author Dloading
 * @since 2019/12/18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean implements Serializable {
    private long total;
    private List rows;

}
