package com.angkorteam.gradle.plugin.task;

public class PkayJavaExtension {

    private String message = "Default Greeting from Gradle";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}