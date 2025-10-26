package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private final SelenideElement userNameInput = $("#userName");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginButton = $("#login");
    private final SelenideElement loginUserPage = $("#userName-value");
    private final SelenideElement logoutButton = $("#submit");

    private final SelenideElement authorizedError = $("#userForm").$("#name");

    private final SelenideElement emptyErrorLogin = $(".p-formfield:has([name='login']) .p-message-text");
    private final SelenideElement emptyErrorPassword = $(".p-formfield:has([name='password']) .p-message-text");


    public LoginPage openPage() {
        open("/login");

        return this;
    }

    public LoginPage setUserName(String value) {
        userNameInput.setValue(value);

        return this;
    }

    public LoginPage setPasswordUser(String value) {
        passwordInput.setValue(value);

        return this;
    }

    public LoginPage loginButtonClick() {
        loginButton.click();

        return this;
    }

    public SelenideElement getLoginUserPage() {
        return loginUserPage;
    }

    public SelenideElement getLogoutButton() {
        return logoutButton;
    }

    public void logoutButtonClick() {
        logoutButton.click();

    }

    public SelenideElement getAuthorizedError() {
        return authorizedError;
    }
}