package com.book.bms.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    int id;
    String username;
    String email;
    String password;
    List<String> roles;
}
