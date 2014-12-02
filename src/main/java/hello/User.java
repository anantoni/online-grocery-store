/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author anantoni
 */
public class User {

    private Integer userID;

    @NotEmpty
    @Size(min=3, max=40)
    private String username;

    @NotEmpty
    @Size(min=4, max=40)
    private String password;

    @NotEmpty
    @Size(min=3, max=40)
    private String firstName;

    @NotEmpty
    @Size(min=3, max=40)
    private String lastName;

    @NotNull
    @Min(18)
    @Max(120)
    private Integer age;

    @Min(0)
    private Integer credit;

    @Min(0)
    private Integer currentBalance;

    @NotEmpty
    @Size(min=6, max=60)
    @Email
    private String email;

    @NotEmpty
    @Size(min=4, max=40)
    private String street;

    @NotEmpty
    @Size(min=3, max=40)
    private String town;

    @NotNull
    @Min(10000)
    @Max(99999)
    private Integer postCode;

    private Integer locationID;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Integer currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public Integer getLocationID() {
        return locationID;
    }

    public void setLocationID(Integer locationID) {
        this.locationID = locationID;
    }

    public String toString() {
        return "Person(Name: " + this.firstName + ", Age: " + this.age + ")";
    }
}
