package app;

import app.component.Button;
import app.component.Component;
import app.component.Input;
import app.component.Selection;
import app.component.Text;
import app.enums.EventEnum;
import app.listener.OnClickListener;
import app.view.View;

/**
 * UIControl
 *
 * @author roy
 * @version 1.0.0
 *
 */
public class UIControl {

    private static final String LOGIN_BTN_ID = "login_btn";
    private static final String REG_BTN_ID = "reg_btn";
    private static final String USERNAME_INPUT_ID = "username_input";
    private static final String PASSWORD_INPUT_ID = "pwd_input";
    private static final String REPEATED_PASSWORD_INPUT_ID = "repeated_pwd_input";
    private static final String HINT_TEXT_ID = "hint_text";
    private static final String SELECTION_ID = "selection";

    public static void main(String[] args) {
        Button loginBtn = (Button) findViewById(LOGIN_BTN_ID);
        Button regBtn = (Button) findViewById(REG_BTN_ID);
        Input nameInput = (Input) findViewById(USERNAME_INPUT_ID);
        Input passwordInput = (Input) findViewById(PASSWORD_INPUT_ID);
        Input rePasswordInput = (Input) findViewById(REPEATED_PASSWORD_INPUT_ID);
        Text hintText = (Text) findViewById(HINT_TEXT_ID);
        Selection selection = (Selection) findViewById(SELECTION_ID);

        LoginPageDialog dialog = new LoginPageDialog();
        dialog.setLoginBtn(loginBtn);
        dialog.setRegBtn(regBtn);
        dialog.setNameInput(nameInput);
        dialog.setPasswordInput(passwordInput);
        dialog.setRePasswordInput(rePasswordInput);
        dialog.setHintText(hintText);
        dialog.setSelection(selection);

        loginBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.handleEvent(loginBtn, EventEnum.CLICK);
            }
        });

        regBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.handleEvent(regBtn, EventEnum.CLICK);
            }
        });

        // ...
    }

    public static Component findViewById(String id) {
        // ..
        return new Component();
    }

}
