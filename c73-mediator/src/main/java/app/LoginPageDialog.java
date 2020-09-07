package app;

import app.component.Button;
import app.component.Component;
import app.component.Input;
import app.component.Selection;
import app.component.Text;
import app.enums.ActionEnum;
import app.enums.EventEnum;

/**
 * LoginPageDialog
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class LoginPageDialog implements Mediator {

    private Button loginBtn;
    private Button regBtn;
    private Selection selection;
    private Input nameInput;
    private Input passwordInput;
    private Input rePasswordInput;
    private Text hintText;

    @Override
    public void handleEvent(Component component, EventEnum event) {
        if (component.equals(this.loginBtn)) {
            String name = this.nameInput.text();
            String password = this.passwordInput.text();
            // ...
        } else if (component.equals(this.regBtn)) {
            String name = this.nameInput.text();
            String password = this.passwordInput.text();
            String rePassword = this.rePasswordInput.text();
            // ...
        } else if (component.equals(this.selection)) {
            ActionEnum action = this.selection.select();
            if (ActionEnum.LOGIN.equals(action)) {
                this.nameInput.show();
                this.passwordInput.show();
                this.rePasswordInput.hide();
                this.hintText.hide();
                // ...
            } else if (ActionEnum.REGISTER.equals(action)) {
                this.nameInput.show();
                this.passwordInput.show();
                this.rePasswordInput.show();
                this.hintText.show();
                // ...
            }
            // ...
        }
    }

    public void setLoginBtn(Button loginBtn) {
        this.loginBtn = loginBtn;
    }

    public void setRegBtn(Button regBtn) {
        this.regBtn = regBtn;
    }

    public void setSelection(Selection selection) {
        this.selection = selection;
    }

    public void setNameInput(Input nameInput) {
        this.nameInput = nameInput;
    }

    public void setPasswordInput(Input passwordInput) {
        this.passwordInput = passwordInput;
    }

    public void setRePasswordInput(Input rePasswordInput) {
        this.rePasswordInput = rePasswordInput;
    }

    public void setHintText(Text hintText) {
        this.hintText = hintText;
    }
}
