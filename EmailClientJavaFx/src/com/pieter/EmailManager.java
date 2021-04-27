package com.pieter;

import com.pieter.model.EmailAccount;
import javafx.scene.control.TreeItem;

public class EmailManager {

    // Folder handling;
    private TreeItem<String> foldersRoot = new TreeItem<String>("");

    public TreeItem<String> getFoldersRoot() {
        return foldersRoot;
    }

    public void addEmailAccount(EmailAccount emailAccount) {
        TreeItem<String> treeItem = new TreeItem<String>(emailAccount.getAddress());
        treeItem.setExpanded(true);
        foldersRoot.getChildren().add(treeItem);
    }
}
