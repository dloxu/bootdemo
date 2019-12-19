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
public class Goods implements Serializable {
    private Long id;
    private String title;
    private String price;
    private String image;
    private String brand;
}
