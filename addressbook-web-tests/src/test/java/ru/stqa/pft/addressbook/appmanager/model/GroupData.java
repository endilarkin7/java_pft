package ru.stqa.pft.addressbook.appmanager.model;

public class GroupData {       //GroupData - обект имеет 3 атрибута
    private final String name;    // name -  1 атрибутт
    private final String header;
    private final String footer;

    public GroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
