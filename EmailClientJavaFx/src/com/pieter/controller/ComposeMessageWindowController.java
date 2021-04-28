package com.pieter.controller;

import com.pieter.EmailManager;
import com.pieter.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.web.HTMLEditor;

public class ComposeMessageWindowController extends BaseController {

    public ComposeMessageWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    private Label recipientTextField;

    @FXML
    private Label subjectTextField;

    @FXML
    private HTMLEditor htmlEditor;

    @FXML
    private Label errorLabel;

    @FXML
    void sendButtonAction() {
        System.out.println(htmlEditor.getHtmlText());
        System.out.println("send button!");
    }
}
