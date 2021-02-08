package com.prueba.view;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class backing_login {
    private RichInputText password;
    private RichInputText username;

    public backing_login() {
    }

    public void setPassword(RichInputText password) {
        this.password = password;
    }

    public RichInputText getPassword() {
        return password;
    }

    public void setUsername(RichInputText username) {
        this.username = username;
    }

    public RichInputText getUsername() {
        return username;
    }
}
