package com.majimob.app.restaurantbuilder.ui;

import com.codename1.components.MultiButton;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BoxLayout;
import com.majimob.app.restaurantbuilder.model.AppSettings;

public class DetailsForm extends BaseNavigationForm {
    public DetailsForm(AppSettings app) {
        super(app, BoxLayout.y());
        
        addTextAndLabel("E-mail - will receive purchases from the generated app", "", TextField.EMAILADDR);
        addTextAndLabel("Website URL", "", TextField.URL);
        
        MultiButton address = new MultiButton("Address & Location");
        address.setTextLine2("...");
        add(address);

        MultiButton styles = new MultiButton("Colors & Fonts");
        styles.setTextLine2("...");
        add(styles);
    }
    
    private TextField addTextAndLabel(String label, String value) {
        TextField tf = new TextField(value);
        tf.setHint(label);
        add(new Label(label, "TextFieldLabel")).
                add(tf);
        return tf;
    }

    private TextField addTextAndLabel(String label, String value, int constraint) {
        TextField tf = addTextAndLabel(label, value);
        tf.setConstraint(constraint);
        return tf;
    }
}
