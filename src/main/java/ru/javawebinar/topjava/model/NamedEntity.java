package ru.javawebinar.topjava.model;

/**
 * Created by bobby on 12.03.2015.
 */
public class NamedEntity extends BaseEntity {

    protected String name;

    public NamedEntity() {
    }

    protected NamedEntity(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
