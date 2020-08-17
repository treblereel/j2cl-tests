package org.treblereel;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 8/8/20
 */
public class User {

    private String firstName;
    private String sureName;
    private int age;
    private boolean alive;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", sureName='" + sureName + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}
