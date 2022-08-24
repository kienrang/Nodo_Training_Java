package edu.java.spring_jee.unit1;

public class HelloClazz {
    String message;

    public HelloClazz() {
        this.message = "From Constructor: Say hello everyone";
    }

    private void initMessage() {
        this.message = "Hello Java";
    }

    private void release() {
        this.message = null;
        System.out.println("Message is null");
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        initMessage();
    }


}
