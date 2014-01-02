package com.dubu.model;

/**
 * User: dubu
 * Date: 13. 12. 30
 * Time: 오전 11:23
 */

import java.io.Serializable;

public class Category implements Serializable {

    private static final long serialVersionUID = 3992469837058393712L;

    private String categoryId;
    private String name;
    private String description;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return getCategoryId();
    }

}
