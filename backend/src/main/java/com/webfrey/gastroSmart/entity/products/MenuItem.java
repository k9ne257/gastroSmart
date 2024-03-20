package com.webfrey.gastroSmart.entity.products;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String picURL;

    @ManyToMany
    private List<Category> category;

    @ManyToMany
    private List<Ingredient> ingredients;


}
