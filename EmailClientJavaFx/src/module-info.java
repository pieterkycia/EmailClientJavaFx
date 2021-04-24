module EmailClientJavaFx {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens com.pieter;
    opens com.pieter.view;
    opens com.pieter.controller;
}