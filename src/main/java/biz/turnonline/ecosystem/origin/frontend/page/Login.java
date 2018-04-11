package biz.turnonline.ecosystem.origin.frontend.page;

import org.ctoolkit.wicket.standard.identity.FirebaseConfig;
import org.ctoolkit.wicket.standard.identity.behavior.FirebaseAppInit;

import javax.inject.Inject;

/**
 * Login
 *
 * @author <a href="mailto:pohorelec@comvai.com">Jozef Pohorelec</a>
 */
public class Login extends BasePage
{
    @Inject
    private FirebaseConfig firebaseConfig;

    public Login()
    {
        add( new FirebaseAppInit( firebaseConfig, true ) );
    }
}