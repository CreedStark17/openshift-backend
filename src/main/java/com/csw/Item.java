package com.csw;

public class Item {

    public Long id;

    public String name;
    public String count;
    public String status;

    public Item(Long id, String name, String count, String status) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.status = status;
    }

    public Item(String name, String count, String status) {
        this.name = name;
        this.count = count;
        this.status = status;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
