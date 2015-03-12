package ru.javawebinar.topjava.model;

/**
 * Created by bobby on 12.03.2015.
 */
public class BaseEntity {

    protected Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public boolean isNew() {
        return (this.id == null);
    }

}
