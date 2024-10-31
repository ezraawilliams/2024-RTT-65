package org.ezrawilliams.model;

import jakarta.persistence.*;

@Entity
public class Department {
    @Column(name="DID_ID")
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer did;
    private String name;
    private String state;

    public Department() {
    }

    public Department(Integer did, String name, String state) {
        this.did = did;
        this.name = name;
        this.state = state;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
