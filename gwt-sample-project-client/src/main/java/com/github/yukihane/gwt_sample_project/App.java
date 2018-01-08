package com.github.yukihane.gwt_sample_project;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer;
import com.sencha.gxt.widget.core.client.container.CssFloatLayoutContainer.CssFloatData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.TextField;

import elemental2.dom.DomGlobal;



public class App implements EntryPoint {

    public void onModuleLoad() {
        CssFloatLayoutContainer container = new CssFloatLayoutContainer();
        TextField textField = new TextField();
        container.add(new FieldLabel(textField, "sample field"), new CssFloatData(1));
        
        TextButton button = new TextButton("elemental2");
        container.add(button);
        
        button.addSelectHandler(event -> DomGlobal.alert("Hello, Elemental2!"));

        Viewport viewPort = new Viewport();
        viewPort.setWidget(container);

        RootPanel.get("maincontent").add(viewPort);
    }
}
