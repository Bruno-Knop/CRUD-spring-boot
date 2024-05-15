package com.bruno.struct.hexagonal.application.core.domain;

public class Customer {

    public Customer() {
        this.isValidDocument = false;
    }

    public Customer(String id, String name, Address address, String document, Boolean isValidDocument) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.document = document;
        this.isValidDocument = isValidDocument;
    }

    private String id;

    private String name;

    private Address address;

    private String document;

    private Boolean isValidDocument;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Boolean getValidDocument() {
        return isValidDocument;
    }

    public void setValidDocument(Boolean validDocument) {
        isValidDocument = validDocument;
    }
}
