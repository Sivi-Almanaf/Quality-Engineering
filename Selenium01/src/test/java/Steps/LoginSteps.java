package Steps;


import Pages.LinkedinFeed;
import Pages.LinkedinLogin;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

    LinkedinLogin facebookLogin;
    LinkedinFeed facebookFeed;

    public void OpenFacebookPage() {
        facebookLogin.open();

    }


    public void ClickButtonLogin(){
        facebookLogin.ClickButtonLogin();
    }
    public void ShouldLoginSuccess(){
        facebookFeed.isHeaderDisplayed();
        facebookFeed.isFeedDisplayed();
    }

    public void InputEmail(String email_user) {
        facebookLogin.InputEmail(email_user);

    }
    public void InputPassword(String password){
        facebookLogin.InputPassword(password);
    }

    public void ShouldLoginFail(){
        facebookFeed.isErrorMessage();
    }

    public void ShouldLoginFailNotification(){
        facebookFeed.NotificationAsHuman();
    }
}

