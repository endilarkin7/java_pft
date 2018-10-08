package ru.stqa.pft.addressbook.appmanager.model;

import java.util.Objects;

public class GroupData {       //GroupData - обект имеет 3 атрибута
    private int id = Integer.MAX_VALUE;
    private  String name;    // name -  1 атрибутт
    private  String header;
    private  String footer;

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return Objects.equals(name, groupData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name); }

    public GroupData withName(String name) {
        this.name = name;
        return this;}

    public GroupData withHeader(String header) {
        this.header = header;
        return this;}

    public GroupData withFooter(String footer) {
        this.footer = footer;
        return this;}

    public GroupData withId(int id) {
        this.id = id;
        return this;}

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}
