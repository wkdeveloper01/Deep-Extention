package com.deeplink.app;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

@DesignerComponent(
    version = 1,
    description = "Deeplink Extension",
    category = ComponentCategory.EXTENSION,
    nonVisible = true
)
@SimpleObject(external = true)
public class DeeplinkExtension extends AndroidNonvisibleComponent {

    public DeeplinkExtension(ComponentContainer container) {
        super(container.$form());
    }

    @SimpleFunction(description = "Get Deeplink Data")
    public String GetLinkData() {
        return "Deeplink Active";
    }
}
