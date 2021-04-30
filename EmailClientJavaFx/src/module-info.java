module EmailClientJavaFx {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens com.pieter;
    opens com.pieter.view;
    opens com.pieter.controller;
    opens com.pieter.model;
}