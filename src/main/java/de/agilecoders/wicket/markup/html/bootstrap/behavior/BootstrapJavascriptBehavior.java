package de.agilecoders.wicket.markup.html.bootstrap.behavior;

import de.agilecoders.wicket.settings.IBootstrapSettings;
import org.apache.wicket.Component;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * TODO: document
 *
 * @author miha
 * @version 1.0
 */
public class BootstrapJavascriptBehavior extends BootstrapBaseBehavior {

    @Override
    public void renderHead(Component component, IHeaderResponse headerResponse) {
        IBootstrapSettings settings = getBootstrapSettings(component);

        headerResponse.render(JavaScriptHeaderItem.forReference(settings.getJsResourceReference(), new PageParameters(), "bootstrap-js", true));
    }
}
