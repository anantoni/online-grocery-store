/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author anantoni
 */
public class User {
    
    @Size(min=3, max=40)
    private String loginName;

    @Size(min=3, max=40)
    private String firstName;
    
    @Size(min=3, max=40)
    private String lastName;
    
    @NotNull
    @Min(18)
    private Integer age;
    
    @NotNull
    @Min(0)
    private Integer credit;
    
    @NotNull
    @Min(0)
    private Integer currentBalance;
    
    @NotNull
    @Size(min=4, max=40)
    private String password;
    
    @NotNull
    @Size(min=6, max=60)
    private String email;
    
    @Size(min=2, max=40)
    private String street;
    
    @Size(min=2, max=40)
    private String town;
    
    @Size(min=5, max=5)
    private Integer postCode;
    
    @NotNull
    private Integer locationID;
    
    public String getFirstName() {
        return this.firstName;
    }

   public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: " + this.firstName + ", Age: " + this.age + ")";
    }
}
