package com.yangpj.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author pj
 */
public class PoliticsStatus implements Serializable {
    private Integer id;

    private String name;

    public PoliticsStatus() {
    }

    public PoliticsStatus(String name) {
        this.name = name;
    }



    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliticsStatus that = (PoliticsStatus) obj;
        return Objects.equals(name, that.name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}