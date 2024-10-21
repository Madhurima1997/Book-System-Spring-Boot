package com.book.bms.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    Long id;
    String title;
    String author;
    Long isbn;
    Date publishDate;
    String description;
    String coverImg;
    Category category;
    Date createdDate;
    Date createdBy;
    int avlCopies;
}
