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
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    public User(String username,String password){
        this.username=username;
        this.password=password;
    }
}
