package com.pieter;

import com.pieter.controller.services.FetchFoldersService;
import com.pieter.model.EmailAccount;
import com.pieter.model.EmailTreeItem;

public class EmailManager {

    // Folder handling;
    private EmailTreeItem<String> foldersRoot = new EmailTreeItem<String>("");

    public EmailTreeItem<String> getFoldersRoot() {
        return foldersRoot;
    }

    public void addEmailAccount(EmailAccount emailAccount) {
        EmailTreeItem<String> emailTreeItem = new EmailTreeItem<String>(emailAccount.getAddress());
        FetchFoldersService fetchFoldersService = new FetchFoldersService(emailAccount.getStore(), emailTreeItem);
        fetchFoldersService.start();
        foldersRoot.getChildren().add(emailTreeItem);
    }
}
