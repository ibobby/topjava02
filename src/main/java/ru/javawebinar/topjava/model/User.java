package ru.javawebinar.topjava.model;

import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/**
 * Created by bobby on 12.03.2015.
 */
public class User extends NamedEntity {

    private  String email;
    private String password;
    private boolean enabled = true;
    private Date registered;
    private Set<Role> authorities;

    public User() {
    }

    public User(String name, String email, String password, Role role, Role...roles) {
        super(name);
        this.email = email;
        this.password = password;
        this.enabled = true;
        this.authorities = EnumSet.of(role, roles);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistered() {
        return registered;
    }

    public String getPassword() {
        return password;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Set<Role> getAuthorities() {
        return authorities;
    }

    public void addAuthority(Role authority) {
        if (authorities == null) {
            authorities = EnumSet.of(authority);
        } else {
            authorities.add(authority);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", registered=" + registered +
                ", authorities=" + authorities +
                '}';
    }
}
