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

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCount() {
        return count;
    }

    public String getStatus() {
        return status;
    }
}
