package biz.turnonline.ecosystem.origin.frontend.page;

import org.apache.wicket.model.IModel;
import org.ctoolkit.wicket.standard.identity.behavior.FirebaseAppInit;
import org.ctoolkit.wicket.standard.model.I18NResourceModel;
import org.ctoolkit.wicket.turnonline.identity.IdentityOptions;
import org.ctoolkit.wicket.turnonline.markup.html.page.DecoratedPage;

import javax.inject.Inject;

/**
 * The default shopping cart page.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class ShoppingCart<T>
        extends DecoratedPage<T>
{
    private static final long serialVersionUID = 3575980225582351217L;

    private I18NResourceModel titleModel = new I18NResourceModel( "title.shopping-cart" );

    @Inject
    private IdentityOptions identityOptions;

    public ShoppingCart()
    {
        add( new FirebaseAppInit( identityOptions ) );
    }

    @Override
    protected IModel<?> getPageH1Header()
    {
        return getPageTitle();
    }

    @Override
    public IModel<String> getPageTitle()
    {
        return titleModel;
    }
}