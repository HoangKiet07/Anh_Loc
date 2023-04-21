package com.example.restcontroller_pathvariable_requestbody;

public class ErrorMessage {
    private long id;
    private String message;

    public ErrorMessage(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
